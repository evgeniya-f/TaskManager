package com.example.tasktrackercompose.feature_task_list.presentation.task_list;

import android.util.Log;
import androidx.compose.material.TabRowDefaults;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.runtime.Composable;
import androidx.navigation.NavController;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import com.example.tasktrackercompose.feature_task_list.domain.model.Task;
import com.example.tasktrackercompose.feature_task_list.domain.utils.TaskFilter;
import com.example.tasktrackercompose.feature_task_list.presentation.util.Screen;
import java.util.Date;
import com.google.accompanist.pager.*;

@kotlin.Metadata(mv = {1, 7, 1}, k = 2, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a:\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007\u001a\u001c\u0010\u0012\u001a\u00020\u00012\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u0013"}, d2 = {"Tabs", "", "pagerState", "Lcom/google/accompanist/pager/PagerState;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "TaskTabScreen", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksViewModel;", "state", "Lcom/example/tasktrackercompose/feature_task_list/presentation/task_list/TasksState;", "navController", "Landroidx/navigation/NavController;", "filteredTasks", "", "Lcom/example/tasktrackercompose/feature_task_list/domain/model/Task;", "TasksScreen", "app_debug"})
public final class TasksScreenKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class, com.google.accompanist.pager.ExperimentalPagerApi.class})
    public static final void TasksScreen(@org.jetbrains.annotations.Nullable
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void TaskTabScreen(@org.jetbrains.annotations.NotNull
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksViewModel viewModel, @org.jetbrains.annotations.NotNull
    com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksState state, @org.jetbrains.annotations.Nullable
    androidx.navigation.NavController navController, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.tasktrackercompose.feature_task_list.domain.model.Task> filteredTasks) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {com.google.accompanist.pager.ExperimentalPagerApi.class})
    public static final void Tabs(@org.jetbrains.annotations.NotNull
    com.google.accompanist.pager.PagerState pagerState, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
    }
}