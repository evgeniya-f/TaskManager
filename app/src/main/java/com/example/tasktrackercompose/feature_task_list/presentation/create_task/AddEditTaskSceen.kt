package com.example.tasktrackercompose.feature_task_list.presentation.create_task

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.tasktrackercompose.feature_task_list.presentation.create_task.components.HintTextField

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddEditTaskScreen(
    navController: NavController,
    viewModel: AddEditTaskViewModel = hiltViewModel()
) {
    val nameState = viewModel.taskName.value
    val descriptionState = viewModel.taskDescription.value

    val dateState = viewModel.taskDate

    val scope = rememberCoroutineScope()

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                viewModel.onEvent(AddEditTaskEvent.SaveTask)
                navController.navigateUp()
            }) {
                Icon(imageVector = Icons.Default.Done, contentDescription = "Save Note")
            }
        },
    ) { paddingValues ->
        Column(modifier = Modifier
            .padding(paddingValues)
        ) {
            HintTextField(
                text = nameState.text,
                hint = nameState.hint,
                onValueChange = {
                    viewModel.onEvent(AddEditTaskEvent.EnterName(it))
                },
                onFocusChange = {
                    viewModel.onEvent(AddEditTaskEvent.ChangeNameFocus(it))
                },
                isHintVisible = nameState.isHintVisible,
                singleLine = true,
                textStyle = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(16.dp))
            HintTextField(
                text = descriptionState.text,
                hint = descriptionState.hint,
                onValueChange = {
                    viewModel.onEvent(AddEditTaskEvent.EnterDescription(it))
                },
                onFocusChange = {
                    viewModel.onEvent(AddEditTaskEvent.ChangeDescriptionFocus(it))
                },
                isHintVisible = descriptionState.isHintVisible,
                textStyle = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.fillMaxHeight()
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = {  }) {
                Text(text = dateState.toString())
            }
        }
    }
}