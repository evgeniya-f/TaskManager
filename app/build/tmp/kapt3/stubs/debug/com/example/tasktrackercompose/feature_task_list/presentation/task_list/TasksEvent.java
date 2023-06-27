package com.example.tasktrackercompose.feature_task_list.presentation.task_list;

import com.example.tasktrackercompose.feature_task_list.domain.model.Task;
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent;", "", "()V", "AddTask", "ChangeFavorite", "DeleteTask", "Order", "RestoreTask", "ToggleOrderSection", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent$AddTask;", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent$ChangeFavorite;", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent$DeleteTask;", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent$Order;", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent$RestoreTask;", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent$ToggleOrderSection;", "app_debug"})
public abstract class TasksEvent {
    
    private TasksEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent$Order;", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent;", "taskOrder", "Lcom/example/tasktrackercompose/feature_task_list/domain/utils/TaskOrder;", "(Lcom/example/tasktrackercompose/feature_task_list/domain/utils/TaskOrder;)V", "getTaskOrder", "()Lcom/example/tasktrackercompose/feature_task_list/domain/utils/TaskOrder;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Order extends com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder taskOrder = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent.Order copy(@org.jetbrains.annotations.NotNull
        com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder taskOrder) {
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
        
        public Order(@org.jetbrains.annotations.NotNull
        com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder taskOrder) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder getTaskOrder() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent$DeleteTask;", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent;", "task", "Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;", "(Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;)V", "getTask", "()Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class DeleteTask extends com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.tasktrackercompose.feature_task_list.domain.model.Task task = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent.DeleteTask copy(@org.jetbrains.annotations.NotNull
        com.example.tasktrackercompose.feature_task_list.domain.model.Task task) {
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
        
        public DeleteTask(@org.jetbrains.annotations.NotNull
        com.example.tasktrackercompose.feature_task_list.domain.model.Task task) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tasktrackercompose.feature_task_list.domain.model.Task component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tasktrackercompose.feature_task_list.domain.model.Task getTask() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent$ChangeFavorite;", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent;", "task", "Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;", "(Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;)V", "getTask", "()Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class ChangeFavorite extends com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.tasktrackercompose.feature_task_list.domain.model.Task task = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent.ChangeFavorite copy(@org.jetbrains.annotations.NotNull
        com.example.tasktrackercompose.feature_task_list.domain.model.Task task) {
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
        
        public ChangeFavorite(@org.jetbrains.annotations.NotNull
        com.example.tasktrackercompose.feature_task_list.domain.model.Task task) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tasktrackercompose.feature_task_list.domain.model.Task component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tasktrackercompose.feature_task_list.domain.model.Task getTask() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent$AddTask;", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent;", "task", "Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;", "(Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;)V", "getTask", "()Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class AddTask extends com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.tasktrackercompose.feature_task_list.domain.model.Task task = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent.AddTask copy(@org.jetbrains.annotations.NotNull
        com.example.tasktrackercompose.feature_task_list.domain.model.Task task) {
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
        
        public AddTask(@org.jetbrains.annotations.NotNull
        com.example.tasktrackercompose.feature_task_list.domain.model.Task task) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tasktrackercompose.feature_task_list.domain.model.Task component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.tasktrackercompose.feature_task_list.domain.model.Task getTask() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent$RestoreTask;", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent;", "()V", "app_debug"})
    public static final class RestoreTask extends com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent.RestoreTask INSTANCE = null;
        
        private RestoreTask() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent$ToggleOrderSection;", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent;", "()V", "app_debug"})
    public static final class ToggleOrderSection extends com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent.ToggleOrderSection INSTANCE = null;
        
        private ToggleOrderSection() {
            super();
        }
    }
}