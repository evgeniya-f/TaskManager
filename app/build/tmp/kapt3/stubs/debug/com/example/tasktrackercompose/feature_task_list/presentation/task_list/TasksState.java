package com.example.tasktrackercompose.feature_task_list.presentation.task_list;

import com.example.tasktrackercompose.feature_task_list.domain.model.Task;
import com.example.tasktrackercompose.feature_task_list.domain.utils.OrderType;
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskFilter;
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder;
import java.util.Date;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\bH\u00c6\u0003JC\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001c"}, d2 = {"Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksState;", "", "tasks", "", "Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;", "favTasks", "todayTasks", "taskFilter", "Lcom/example/tasktrackercompose/feature_task_list/domain/utils/TaskFilter;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/example/tasktrackercompose/feature_task_list/domain/utils/TaskFilter;)V", "getFavTasks", "()Ljava/util/List;", "getTaskFilter", "()Lcom/example/tasktrackercompose/feature_task_list/domain/utils/TaskFilter;", "getTasks", "getTodayTasks", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class TasksState {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> tasks = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> favTasks = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> todayTasks = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.tasktrackercompose.feature_task_list.domain.utils.TaskFilter taskFilter = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksState copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> tasks, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> favTasks, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> todayTasks, @org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.domain.utils.TaskFilter taskFilter) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public TasksState() {
        super();
    }
    
    public TasksState(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> tasks, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> favTasks, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> todayTasks, @org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.domain.utils.TaskFilter taskFilter) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> getTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> getFavTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> getTodayTasks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.tasktrackercompose.feature_task_list.domain.utils.TaskFilter component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.tasktrackercompose.feature_task_list.domain.utils.TaskFilter getTaskFilter() {
        return null;
    }
}