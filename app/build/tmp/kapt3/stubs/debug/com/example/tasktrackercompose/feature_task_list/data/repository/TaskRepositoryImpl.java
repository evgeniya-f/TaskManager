package com.example.tasktrackercompose.feature_task_list.data.repository;

import com.example.tasktrackercompose.feature_task_list.data.data_source.TaskDao;
import com.example.tasktrackercompose.feature_task_list.domain.model.Task;
import com.example.tasktrackercompose.feature_task_list.domain.repository.TaskRepository;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00100\u000fH\u0016J\u0019\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/tasktrackercompose/feature_task_list/data/repository/TaskRepositoryImpl;", "Lcom/example/tasktrackercompose/feature_task_list/domain/repository/TaskRepository;", "dao", "Lcom/example/tasktrackercompose/feature_task_list/data/data_source/TaskDao;", "(Lcom/example/tasktrackercompose/feature_task_list/data/data_source/TaskDao;)V", "deleteTask", "", "task", "Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;", "(Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTaskById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTasks", "Lkotlinx/coroutines/flow/Flow;", "", "insertTask", "updateTask", "app_debug"})
public final class TaskRepositoryImpl implements com.example.tasktrackercompose.feature_task_list.domain.repository.TaskRepository {
    private final com.example.tasktrackercompose.feature_task_list.data.data_source.TaskDao dao = null;
    
    public TaskRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.data.data_source.TaskDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task>> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getTaskById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.tasktrackercompose.feature_task_list.domain.model.Task> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object insertTask(@org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.domain.model.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.domain.model.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object updateTask(@org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.domain.model.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}