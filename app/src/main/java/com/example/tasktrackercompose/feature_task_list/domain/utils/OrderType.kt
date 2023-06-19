package com.example.tasktrackercompose.feature_task_list.domain.utils

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
