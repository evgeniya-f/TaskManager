package com.example.tasktrackercompose.feature_task_list.presentation.task_list

import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.feature_task_list.domain.utils.OrderType
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder

data class TasksState(
    val tasks: List<Task> = emptyList(),
    val taskOrder: TaskOrder = TaskOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)