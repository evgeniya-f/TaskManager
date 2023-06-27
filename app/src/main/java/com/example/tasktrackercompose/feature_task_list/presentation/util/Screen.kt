package com.example.tasktrackercompose.feature_task_list.presentation.util

sealed class Screen(val route: String) {
    object TasksScreen: Screen("tasks_screen")
}
