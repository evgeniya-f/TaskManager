package com.example.tasktrackercompose.feature_task_list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tasktrackercompose.feature_task_list.presentation.create_task.AddEditTaskScreen
import com.example.tasktrackercompose.feature_task_list.presentation.task_list.TasksScreen
import com.example.tasktrackercompose.feature_task_list.presentation.util.Screen
import com.example.tasktrackercompose.ui.theme.TaskTrackerComposeTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskTrackerComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController,
                        startDestination = Screen.TasksScreen.route
                    ){
                        composable(route = Screen.TasksScreen.route) {
                            TasksScreen(navController = navController)
                        }
                        composable(
                            route = Screen.AddEditTaskScreen.route +
                                "?taskId={taskId}",
                            arguments = listOf(
                                navArgument(
                                    name = "taskId"
                                ){
                                    type = NavType.IntType
                                    defaultValue = -1
                                }
                            )
                        ) {
                            AddEditTaskScreen(
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}



