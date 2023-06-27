package com.example.tasktrackercompose.feature_task_list.domain.use_case;

import com.example.tasktrackercompose.feature_task_list.domain.model.Task;
import com.example.tasktrackercompose.feature_task_list.domain.repository.TaskRepository;
import com.example.tasktrackercompose.feature_task_list.domain.utils.OrderType;
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/tasktrackercompose/feature_task_list/domain/use_case/GetTasksUseCase;", "", "repository", "Lcom/example/tasktrackercompose/feature_task_list/domain/repository/TaskRepository;", "(Lcom/example/tasktrackercompose/feature_task_list/domain/repository/TaskRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;", "taskOrder", "Lcom/example/tasktrackercompose/feature_task_list/domain/utils/TaskOrder;", "app_debug"})
public final class GetTasksUseCase {
    private final com.example.tasktrackercompose.feature_task_list.domain.repository.TaskRepository repository = null;
    
    public GetTasksUseCase(@org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.domain.repository.TaskRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task>> invoke(@org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.domain.utils.TaskOrder taskOrder) {
        return null;
    }
}