package com.example.tasktrackercompose.feature_task_list.presentation.task_list

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.feature_task_list.presentation.task_list.components.TaskElement
import com.example.tasktrackercompose.feature_task_list.presentation.util.Screen
import com.google.accompanist.pager.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@OptIn(ExperimentalMaterial3Api::class, ExperimentalPagerApi::class)
@Composable
fun TasksScreen(
    navController: NavController?,
    viewModel: TasksViewModel = hiltViewModel(),
) {
    val state = viewModel.state.value
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()
    val pagerState = rememberPagerState(initialPage = 0)

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Мои задачи") }
            )
            Tabs(pagerState = pagerState, scope = scope)

        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController?.navigate(Screen.AddEditTaskScreen.route)
                }
            ) {
                Icon(Icons.Filled.Add, "")
            }
        },
        content = { padding ->
            HorizontalPager(state = pagerState, count = 3) { page ->
                when (page) {
                    0 -> {
                        TaskTabScreen(
                            modifier = Modifier.padding(padding),
                            viewModel = viewModel,
                            state = state,
                            navController = navController,
                            filteredTasks = state.tasks
                        )
                    }

                    1 -> {
                        TaskTabScreen(
                            modifier = Modifier.padding(padding),
                            viewModel = viewModel,
                            state = state,
                            navController = navController,
                            filteredTasks = state.favTasks
                        )
                    }

                    2 -> {
                        TaskTabScreen(
                            modifier = Modifier.padding(padding),
                            viewModel = viewModel,
                            state = state,
                            navController = navController,
                            filteredTasks = state.todayTasks
                        )
                    }
                }
            }
        }
    )
}

@Composable
fun TaskTabScreen(
    modifier: Modifier = Modifier,
    viewModel: TasksViewModel,
    state: TasksState,
    navController: NavController?,
    filteredTasks: List<Task>
    ) {

    LazyColumn(
        modifier = modifier
            .padding(horizontal = 8.dp)
            .fillMaxSize()
    ) {
        items(filteredTasks) { task ->
            TaskElement(
                onClick = {
                    navController?.navigate(
                        Screen.AddEditTaskScreen.route +
                                "?taskId=${task.id}"
                    )
                },
                changeFavorite = { n_task: Task ->
                    viewModel.onEvent(
                        TasksEvent.ChangeFavorite(
                            n_task
                        )
                    )
                },
                task = task,
                onLongPress = { n_task: Task -> viewModel.onEvent(TasksEvent.DeleteTask(n_task)) },
                modifier = Modifier
            )
            Spacer(modifier = Modifier.height(8.dp))
        }

    }
}

@OptIn(ExperimentalPagerApi::class)
@Composable
fun Tabs(pagerState: PagerState, scope: CoroutineScope) {
    val list = listOf(
        "Все",
        "Избранное",
        "Сегодня"
    )
    TabRow(
        selectedTabIndex = pagerState.currentPage,
        indicator = { tabPositions ->
            TabRowDefaults.Indicator(
                Modifier.pagerTabIndicatorOffset(pagerState, tabPositions),
                height = 2.dp,
                color = Color.White
            )
        }
    ) {
        list.forEachIndexed { index, _ ->
            Tab(
                text = {
                    Text(
                        list[index],
                        color = if (pagerState.currentPage == index) Color.White else Color.LightGray
                    )
                },
                selected = pagerState.currentPage == index,
                onClick = {
                    scope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                }
            )
        }
    }
}

