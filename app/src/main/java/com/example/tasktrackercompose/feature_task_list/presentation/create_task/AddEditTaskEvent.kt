package com.example.tasktrackercompose.feature_task_list.presentation.create_task

import androidx.compose.ui.focus.FocusState
import java.util.Date

sealed class AddEditTaskEvent{
    data class EnterName(val value: String): AddEditTaskEvent()
    data class ChangeNameFocus(val focusState: FocusState): AddEditTaskEvent()
    data class EnterDescription(val value: String): AddEditTaskEvent()
    data class ChangeDescriptionFocus(val focusState: FocusState): AddEditTaskEvent()
    data class ChangeDate(val value: Date): AddEditTaskEvent()
    object SaveTask: AddEditTaskEvent()
}