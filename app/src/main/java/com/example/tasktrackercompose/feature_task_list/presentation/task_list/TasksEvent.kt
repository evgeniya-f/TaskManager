package com.example.tasktrackercompose.feature_task_list.presentation.task_list

import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder

sealed class TasksEvent {
    data class Order(val taskOrder: TaskOrder): TasksEvent()
    data class DeleteTask(val task: Task): TasksEvent()
    object RestoreTask: TasksEvent()
    object ToggleOrderSection: TasksEvent()
}
