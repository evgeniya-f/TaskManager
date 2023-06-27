package com.example.tasktrackercompose.feature_task_list.presentation.create_task

data class TaskTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)