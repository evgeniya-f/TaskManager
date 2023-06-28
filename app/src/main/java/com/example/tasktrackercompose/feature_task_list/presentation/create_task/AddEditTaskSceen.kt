package com.example.tasktrackercompose.feature_task_list.presentation.create_task

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.tasktrackercompose.R
import com.example.tasktrackercompose.feature_task_list.presentation.create_task.components.ChooseDateButton
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
    val favState = viewModel.taskIsFav

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
        Column(
            modifier = Modifier
                .padding(paddingValues).padding(horizontal = 8.dp).fillMaxWidth()
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
                modifier = Modifier.height(200.dp).padding(bottom = 40.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()){
                ChooseDateButton(
                    date = dateState.value,
                    onDatePicked = { n_date -> viewModel.onEvent(AddEditTaskEvent.ChangeDate(n_date)) }
                )
                IconButton(
                    onClick = {
                        val temp = !favState.value
                        viewModel.onEvent(AddEditTaskEvent.ChangeFav(temp))
                    }, modifier = Modifier,
                ) {
                    if (favState.value){
                        Icon(
                            painterResource(id = R.drawable.baseline_star_rate_24),
                            modifier = Modifier.size(64.dp),
                            tint = Color(0xFFFAB55B),
                            contentDescription = "Favorite icon",
                        )
                    } else {
                        Icon(
                            painterResource(id = R.drawable.baseline_star_outline_24),
                            modifier = Modifier.size(64.dp),
                            contentDescription = "Favorite icon",
                        )
                    }

                }
            }

        }
    }
}