package com.example.tasktrackercompose.feature_task_list.domain.use_case

data class TaskUseCases(
    val getTasksUseCase: GetTasksUseCase,
    val getTaskUseCase: GetTaskUseCase,
    val deleteTaskUseCase: DeleteTaskUseCase,
    val addTask: AddTaskUseCase,
    val changeFavorite: ChangeFavoriteUseCase
)