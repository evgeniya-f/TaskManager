package com.example.tasktrackercompose.feature_task_list.domain.utils

sealed class TaskFilter(val order: TaskOrder) {
    class All(order: TaskOrder): TaskFilter(order)
    class Fav(order: TaskOrder): TaskFilter(order)
    class Today(order: TaskOrder): TaskFilter(order)
}