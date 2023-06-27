package com.example.tasktrackercompose.feature_task_list.presentation.create_task

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tasktrackercompose.feature_task_list.domain.model.InvalidTaskException
import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.feature_task_list.domain.use_case.TaskUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch
import java.util.Date
import javax.inject.Inject

@HiltViewModel
class AddEditTaskViewModel @Inject constructor(
    private val taskUseCases: TaskUseCases,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private  val _taskName = mutableStateOf(TaskTextFieldState(
        hint = "Название задачи"
    ))
    val taskName: State<TaskTextFieldState> = _taskName

    private  val _taskDescription = mutableStateOf(TaskTextFieldState(
        hint = "Описание задачи"
    ))
    val taskDescription: State<TaskTextFieldState> = _taskDescription

    private  val _taskDate = mutableStateOf(Date())
    val taskDate: State<Date> = _taskDate

    private val _taskIsFav = mutableStateOf(false)
    val taskIsFav: State<Boolean> = _taskIsFav

    private val _eventFlow = MutableSharedFlow<UiEvent>()
    val event = _eventFlow.asSharedFlow()


    private var currentTaskId: Int? = null

    init {
        savedStateHandle.get<Int>("taskId")?.let { taskId ->
            if (taskId != -1) {
                viewModelScope.launch {
                    taskUseCases.getTaskUseCase(taskId)?.also {task ->
                        currentTaskId = task.id
                        _taskName.value = taskName.value.copy(
                            text = task.name,
                            isHintVisible = false
                        )
                        _taskDescription.value = taskDescription.value.copy(
                            text = task.name,
                            isHintVisible = false
                        )
                        _taskDate.value = task.date
                        _taskIsFav.value = task.is_fav
                    }
                }
            }
        }
    }

    fun onEvent(event: AddEditTaskEvent){
        when(event){
            is AddEditTaskEvent.ChangeDate -> {
                _taskDate.value = event.value
            }
            is AddEditTaskEvent.ChangeDescriptionFocus -> {
                _taskDescription.value = taskDescription.value.copy(
                    isHintVisible = !event.focusState.isFocused &&
                            taskDescription.value.text.isBlank()
                )
            }
            is AddEditTaskEvent.ChangeNameFocus -> {
                _taskName.value = taskName.value.copy(
                    isHintVisible = !event.focusState.isFocused &&
                            taskName.value.text.isBlank()
                )
            }
            is AddEditTaskEvent.EnterDescription -> {
                _taskDescription.value = taskDescription.value.copy(
                    text = event.value
                )
            }
            is AddEditTaskEvent.EnterName -> {
                _taskName.value = taskName.value.copy(
                    text = event.value
                )
            }
            AddEditTaskEvent.SaveTask -> {
                viewModelScope.launch {
                    try {
                        taskUseCases.addTask(
                            Task(
                                name = taskName.value.text,
                                description = taskDescription.value.text,
                                date = taskDate.value,
                                is_fav = taskIsFav.value,
                                id = currentTaskId
                            )
                        )
                        _eventFlow.emit(UiEvent.SaveTask)
                    } catch (e: InvalidTaskException) {
                        _eventFlow.emit(
                            UiEvent.ShowSnackbar(
                                message = e.message ?: "Невозможно сохранить задачу"
                            )
                        )

                    }
                }
            }
        }
    }

    sealed class UiEvent {
        data class ShowSnackbar (val message: String): UiEvent()
        object SaveTask: UiEvent()
    }
}