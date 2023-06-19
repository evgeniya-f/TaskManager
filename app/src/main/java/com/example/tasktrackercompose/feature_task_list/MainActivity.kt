package com.example.tasktrackercompose.feature_task_list

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import com.example.tasktrackercompose.ui.theme.TaskTrackerComposeTheme
import java.sql.Date

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskTrackerComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}


@Composable
fun TaskApp() {

}

@Composable
fun TaskCard(task: Task, modifier: Modifier) {
    Surface(
        shape = MaterialTheme.shapes.small,
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.width(192.dp)
        ) {
            Column() {
                Text(text = task.name)
                Surface() {
                    Text(text = task.date.toString())
                }
            }
        }
    }
}

@Preview
@Composable
fun TaskPreview() {
    val task = Task(
        id = 0,
        name = "Вынести мусор",
        description = "Вынести мусор уверенно",
        date = Date(1, 1, 1),
        is_fav = true
    )
    TaskCard(task = task, modifier = Modifier)

}



