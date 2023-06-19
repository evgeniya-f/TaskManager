package com.example.tasktrackercompose.feature_task_list.domain.use_case

import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.feature_task_list.domain.repository.TaskRepository

class DeleteTaskUseCase(
    private val repository: TaskRepository
) {

    suspend operator fun invoke(task: Task) {
        repository.deleteTask(task)
    }
}