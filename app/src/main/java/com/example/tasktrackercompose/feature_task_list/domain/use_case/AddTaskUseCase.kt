package com.example.tasktrackercompose.feature_task_list.domain.use_case

import com.example.tasktrackercompose.feature_task_list.domain.model.InvalidTaskException
import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.feature_task_list.domain.repository.TaskRepository

class AddTaskUseCase(
    private val repository: TaskRepository
) {

    @Throws(InvalidTaskException::class)
    suspend operator fun invoke(task: Task) {
        if(task.name.isBlank()){
            throw InvalidTaskException("Task have no name")
        }
        if(task.description.isBlank()){
            throw InvalidTaskException("Task have no description")
        }
        repository.insertTask(task)
    }
}