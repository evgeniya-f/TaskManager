package com.example.tasktrackercompose.feature_task_list.domain.use_case

import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.feature_task_list.domain.repository.TaskRepository

class ChangeFavoriteUseCase(
    private val repository: TaskRepository
) {
    suspend operator fun invoke(task: Task) {
        repository.updateTask(task)
    }
}