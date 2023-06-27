package com.example.tasktrackercompose.feature_task_list.presentation.task_list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.feature_task_list.presentation.task_list.components.TaskElement
import com.example.tasktrackercompose.feature_task_list.presentation.util.Screen
import java.util.Date


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TasksScreen(
    navController: NavController?,
    viewModel: TasksViewModel = hiltViewModel(),
) {
    val state = viewModel.state.value
    val snackbarHostState = remember { SnackbarHostState() }
    val scope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Мои задачи") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    val task = Task(
                        name = "Вынести мусор",
                        description = "Вынести мусор уверенно",
                        date = Date(1, 1, 1),
                        is_fav = true
                    )
                    viewModel.onEvent(TasksEvent.AddTask(task))
                }
            ) {
                Icon(Icons.Filled.Add, "")
            }
        },
        content = { padding ->

            LazyColumn(modifier = Modifier
                .padding(padding)
                .padding(horizontal = 8.dp)
                .fillMaxSize()) {
                items(state.tasks) { task ->
                    TaskElement(
                        onClick = {
                            navController?.navigate(
                                Screen.AddEditTaskScreen.route +
                                        "?taskId=${task.id}"
                            )
                        },
                        changeFavorite = {n_task: Task -> viewModel.onEvent(TasksEvent.ChangeFavorite(n_task))},
                        task = task,
                        onLongPress = {n_task: Task -> viewModel.onEvent(TasksEvent.DeleteTask(n_task))},
                        modifier = Modifier
                    )
                    Spacer(modifier = Modifier.height(8.dp),)
                }

            }
        }
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun ScreenPreview() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Мои задачи") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {}
            ) {
                Icon(Icons.Filled.Add, "")
            }
        },
        content = { padding ->
            print(padding)
            val task = Task(
                name = "Вынести мусор",
                description = "Вынести мусор уверенно",
                date = Date(1, 1, 1),
                is_fav = true
            )
            Column(
                modifier = Modifier.padding(padding)
            ) {
                TaskElement(
                    onClick = {},
                    changeFavorite = {},
                    task = task,
                    onLongPress = {},
                    modifier = Modifier
                )
            }
        }
    )
}