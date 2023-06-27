package com.example.tasktrackercompose.feature_task_list.presentation.task_list;

import android.util.Log;
import androidx.compose.runtime.State;
import androidx.lifecycle.ViewModel;
import com.example.tasktrackercompose.feature_task_list.domain.model.Task;
import com.example.tasktrackercompose.feature_task_list.domain.use_case.TaskUseCases;
import com.example.tasktrackercompose.feature_task_list.domain.utils.OrderType;
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksViewModel;", "Landroidx/lifecycle/ViewModel;", "taskUseCases", "Lcom/example/tasktrackercompose/feature_task_list/domain/use_case/TaskUseCases;", "(Lcom/example/tasktrackercompose/feature_task_list/domain/use_case/TaskUseCases;)V", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksState;", "getTasksJob", "Lkotlinx/coroutines/Job;", "recentlyDeletedTask", "Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getTasks", "", "taskOrder", "Lcom/example/tasktrackercompose/feature_task_list/domain/utils/TaskOrder;", "onEvent", "event", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksEvent;", "app_debug"})
public final class TasksViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.tasktrackercompose.feature_task_list.domain.use_case.TaskUseCases taskUseCases = null;
    private final androidx.compose.runtime.MutableState<com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksState> _state = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.State<com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksState> state = null;
    private com.example.tasktrackercompose.feature_task_list.domain.model.Task recentlyDeletedTask;
    private kotlinx.coroutines.Job getTasksJob;
    
    @javax.inject.Inject
    public TasksViewModel(@org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.domain.use_case.TaskUseCases taskUseCases) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.State<com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksState> getState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksEvent event) {
    }
    
    private final void getTasks(com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder taskOrder) {
    }
}