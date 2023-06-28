package com.example.tasktrackercompose.feature_task_list.presentation.task_list

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.feature_task_list.domain.use_case.TaskUseCases
import com.example.tasktrackercompose.feature_task_list.domain.utils.OrderType
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskFilter
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import java.util.Date
import javax.inject.Inject

@HiltViewModel
class TasksViewModel @Inject constructor(
    private val taskUseCases: TaskUseCases
) : ViewModel() {

    private val _state = mutableStateOf<TasksState>(TasksState())
    val state: State<TasksState> = _state

    private var recentlyDeletedTask: Task? = null

    private var getTasksJob: Job? = null

    init {
        getTasks(TaskFilter.All(TaskOrder.Date(OrderType.Descending)))
    }

    fun onEvent(event: TasksEvent){
        when(event) {
            is TasksEvent.Filter -> {
                if(state.value.taskFilter::class == event.taskFilter::class &&
                    state.value.taskFilter.order == event.taskFilter.order
                ){
                    return
                }
                getTasks(event.taskFilter)
            }
            is TasksEvent.DeleteTask -> {
                viewModelScope.launch {
                    taskUseCases.deleteTaskUseCase(event.task)
                    recentlyDeletedTask = event.task
                }
            }
            is TasksEvent.RestoreTask -> {
                viewModelScope.launch {
                    taskUseCases.addTask(recentlyDeletedTask ?: return@launch)
                    recentlyDeletedTask = null
                }
            }
            is TasksEvent.ToggleOrderSection -> {
            }
            is TasksEvent.ChangeFavorite -> {
                viewModelScope.launch {
                    Log.d("В VM", "штучка ${event.task}")
                    taskUseCases.addTask(event.task)


                }
            }

            is TasksEvent.AddTask -> {
                viewModelScope.launch {
                    taskUseCases.addTask(event.task)
                }
            }

            is TasksEvent.Order -> {
                if(state.value.taskFilter.order::class == event.taskOrder::class &&
                    state.value.taskFilter.order.orderType == event.taskOrder.orderType
                ){
                    return
                }
            }
        }
    }

    private fun getTasks(taskFilter: TaskFilter) {
        getTasksJob?.cancel()
        val today = Date()
        taskUseCases.getTasksUseCase(taskFilter)
            .onEach { tasks ->
                _state.value = state.value.copy(
                    tasks = tasks,
                    favTasks = tasks.filter { it.is_fav },
                    todayTasks = tasks.filter { it.date.date == today.date && it.date.year == today.year },
                    taskFilter = taskFilter
                )
            }
            .launchIn(viewModelScope)

    }
}