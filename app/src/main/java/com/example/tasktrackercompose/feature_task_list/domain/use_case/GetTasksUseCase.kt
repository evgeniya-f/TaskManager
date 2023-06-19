package com.example.tasktrackercompose.feature_task_list.domain.use_case

import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.feature_task_list.domain.repository.TaskRepository
import com.example.tasktrackercompose.feature_task_list.domain.utils.OrderType
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetTasksUseCase(
    private val repository: TaskRepository
) {

    operator fun invoke(
        taskOrder: TaskOrder = TaskOrder.Date(OrderType.Descending)
    ): Flow<List<Task>> {
        return repository.getTasks().map { tasks ->
            when(taskOrder.orderType) {
                is OrderType.Ascending -> {
                    when(taskOrder){
                        is TaskOrder.Name -> tasks.sortedBy { it.name.lowercase() }
                        is TaskOrder.Date -> tasks.sortedBy { it.date }
                    }
                }
                is OrderType.Descending -> {
                    when(taskOrder){
                        is TaskOrder.Name -> tasks.sortedByDescending { it.name.lowercase() }
                        is TaskOrder.Date -> tasks.sortedByDescending { it.date }
                    }
                }
            }
        }
    }
}