package com.example.tasktrackercompose.feature_task_list.presentation.task_list

import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.feature_task_list.domain.utils.OrderType
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskFilter
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder

data class TasksState(
    val tasks: List<Task> = emptyList(),
    val favTasks: List<Task> = emptyList(),
    val todayTasks: List<Task> = emptyList(),
    val taskFilter: TaskFilter = TaskFilter.All(TaskOrder.Date(OrderType.Descending)),
)