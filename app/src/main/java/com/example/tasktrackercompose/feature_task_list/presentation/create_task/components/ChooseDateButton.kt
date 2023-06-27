package com.example.tasktrackercompose.feature_task_list.presentation.create_task.components

import android.util.Log
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.vanpra.composematerialdialogs.MaterialDialog
import com.vanpra.composematerialdialogs.datetime.date.datepicker
import com.vanpra.composematerialdialogs.rememberMaterialDialogState
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.time.ZoneId
import java.util.Date


@Composable
fun ChooseDateButton(
    date: Date?,
    onDatePicked: (Date) -> Unit
) {
    val dialogState = rememberMaterialDialogState()
    MaterialDialog(
        dialogState = dialogState,
        buttons = {
            positiveButton("Ok")
            negativeButton("Cancel")
        }
    ) {
        datepicker {
            n_date ->
            val t_date = Date.from(n_date.atStartOfDay(ZoneId.systemDefault()).toInstant())
            Log.d("DatePicker", "Выбрали дату ${t_date}")
            onDatePicked(t_date)
        }
    }

    Button(
        onClick =
        {
            dialogState.show()
        },
    ){
        if (date != null) {
            val df: DateFormat = SimpleDateFormat("dd/MM/yyyy")
            Text(text = df.format(date))
        }
        else {
            Text(text = "Выбирете дату")
        }

    }
}

@Preview
@Composable
fun DateButtonPrev() {
    ChooseDateButton(null, { })
}