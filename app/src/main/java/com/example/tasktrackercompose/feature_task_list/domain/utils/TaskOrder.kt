package com.example.tasktrackercompose.feature_task_list.domain.utils

sealed class TaskOrder(val orderType: OrderType) {
    class Name(orderType: OrderType): TaskOrder(orderType)
    class Date(orderType: OrderType): TaskOrder(orderType)
}