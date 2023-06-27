package com.example.tasktrackercompose.di

import android.app.Application
import androidx.room.Room
import com.example.tasktrackercompose.feature_task_list.data.data_source.TaskDatabase
import com.example.tasktrackercompose.feature_task_list.data.repository.TaskRepositoryImpl
import com.example.tasktrackercompose.feature_task_list.domain.repository.TaskRepository
import com.example.tasktrackercompose.feature_task_list.domain.use_case.AddTaskUseCase
import com.example.tasktrackercompose.feature_task_list.domain.use_case.ChangeFavoriteUseCase
import com.example.tasktrackercompose.feature_task_list.domain.use_case.DeleteTaskUseCase
import com.example.tasktrackercompose.feature_task_list.domain.use_case.GetTaskUseCase
import com.example.tasktrackercompose.feature_task_list.domain.use_case.GetTasksUseCase
import com.example.tasktrackercompose.feature_task_list.domain.use_case.TaskUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideTaskDatabase(app: Application): TaskDatabase {
        return Room.databaseBuilder(
            app,
            TaskDatabase::class.java,
            TaskDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideNoteRepository(db: TaskDatabase): TaskRepository{
        return  TaskRepositoryImpl(db.taskDao)
    }

    @Provides
    @Singleton
    fun provideTaskUseCases(repository: TaskRepository): TaskUseCases {
        return TaskUseCases(
            getTasksUseCase = GetTasksUseCase(repository),
            deleteTaskUseCase = DeleteTaskUseCase(repository),
            addTask = AddTaskUseCase(repository),
            changeFavorite = ChangeFavoriteUseCase(repository),
            getTaskUseCase = GetTaskUseCase(repository)
        )
    }
}