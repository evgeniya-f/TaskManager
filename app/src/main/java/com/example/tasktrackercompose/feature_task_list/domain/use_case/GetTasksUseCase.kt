package com.example.tasktrackercompose.feature_task_list.domain.use_case

import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.feature_task_list.domain.repository.TaskRepository
import com.example.tasktrackercompose.feature_task_list.domain.utils.OrderType
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskFilter
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import java.util.Date

class GetTasksUseCase(
    private val repository: TaskRepository
) {

    operator fun invoke(
        taskFilter: TaskFilter = TaskFilter.All(TaskOrder.Date(OrderType.Descending))
    ): Flow<List<Task>> {
        return repository.getTasks().map { tasks ->
            resolveFilter(taskFilter, tasks = tasks)
        }
    }


    fun resolveFilter(taskFilter: TaskFilter, tasks: List<Task>): List<Task> {
        return when (taskFilter) {
            is TaskFilter.All -> resolveOrder(taskFilter.order, tasks)
            is TaskFilter.Fav -> resolveOrder(taskFilter.order, tasks.filter { it.is_fav })
            is TaskFilter.Today -> {
                val today = Date()
                resolveOrder(
                    taskFilter.order,
                    tasks.filter { it.date.date == today.date && it.date.year == today.year }
                )
            }
        }
    }

    fun resolveOrder(taskOrder: TaskOrder, tasks: List<Task>): List<Task> {
        return when(taskOrder.orderType) {
            is OrderType.Ascending -> {
                when(taskOrder) {
                    is TaskOrder.Date -> tasks.sortedBy { it.date }
                    is TaskOrder.Name -> tasks.sortedBy { it.name.lowercase() }
                }
            }
            is OrderType.Descending -> {
                when(taskOrder) {
                    is TaskOrder.Date -> tasks.sortedByDescending { it.date }
                    is TaskOrder.Name -> tasks.sortedByDescending { it.name.lowercase() }
                }
            }
        }
    }
}