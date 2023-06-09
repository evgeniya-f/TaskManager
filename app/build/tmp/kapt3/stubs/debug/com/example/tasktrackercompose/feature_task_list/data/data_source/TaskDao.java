package com.example.tasktrackercompose.feature_task_list.data.data_source;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;
import com.example.tasktrackercompose.feature_task_list.domain.model.Task;
import kotlinx.coroutines.flow.Flow;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u001b\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0019\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/example/tasktrackercompose/feature_task_list/data/data_source/TaskDao;", "", "deleteTask", "", "task", "Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;", "(Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteTasks", "Lkotlinx/coroutines/flow/Flow;", "", "is_fav", "", "getTaskById", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTasks", "insertTask", "updateTask", "app_debug"})
public abstract interface TaskDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM task")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task>> getTasks();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM task WHERE is_fav = :is_fav")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task>> getFavoriteTasks(boolean is_fav);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM task WHERE id = :id")
    public abstract java.lang.Object getTaskById(int id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.tasktrackercompose.feature_task_list.domain.model.Task> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertTask(@org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.domain.model.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteTask(@org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.domain.model.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object updateTask(@org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.domain.model.Task task, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}