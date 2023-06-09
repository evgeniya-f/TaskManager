package com.example.tasktrackercompose.feature_task_list.presentation.task_list.components

import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tasktrackercompose.R
import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import java.text.DateFormat
import java.text.SimpleDateFormat

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
@Composable
fun TaskElement(
    task: Task,
    onClick: () -> Unit,
    changeFavorite: (task: Task) -> Unit,
    onLongPress: (task: Task) -> Unit,
    modifier: Modifier,
) {

    Card(
        shape = MaterialTheme.shapes.small,
        modifier = modifier
            .height(75.dp),
//        onClick = onClick,
    ) {
        val updatedOnTap = rememberUpdatedState(onClick)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .pointerInput(true) {
                    detectTapGestures(
                        onLongPress = {
                            onLongPress(task)
                        },
                        onTap = { updatedOnTap.value.invoke() }
                    )
                }

        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = modifier.fillMaxSize()
            )
            {
                Column(modifier = modifier.fillMaxHeight()) {
                    Text(
                        text = task.name,
                        modifier = modifier
                            .offset(x = 18.dp, y = 10.dp)
                            .padding(end = 6.dp),
                        fontSize = 14.sp,
                        fontWeight = FontWeight(700),
                    )
                    Surface(
                        shape = RoundedCornerShape(99),
                        color = Color(0xFFFFC982),
                        modifier = modifier
                            .offset(x = 40.dp, y = 20.dp)
                    ) {
                        val df: DateFormat = SimpleDateFormat("dd/MM/yyyy")

                        Text(text = df.format(task.date), modifier = modifier.padding(4.dp))
                    }
                }
                IconButton(
                    onClick = {
                        val temp = task.copy(is_fav = !task.is_fav)
                        changeFavorite(temp)
                    }, modifier = modifier
                        .offset(x = -10.dp),
                ) {
                    if (task.is_fav){
                        Icon(
                            painterResource(id = R.drawable.baseline_star_rate_24),
                            modifier = modifier.size(36.dp),
                            tint = Color(0xFFFAB55B),
                            contentDescription = "Favorite icon",
                        )
                    } else {
                        Icon(
                            painterResource(id = R.drawable.baseline_star_outline_24),
                            modifier = modifier.size(36.dp),
                            contentDescription = "Favorite icon",
                        )
                    }

                }
            }
        }
    }
}


//
//@Preview
//@Composable
//fun TaskPreview() {
//    val task = Task(
//        id = 0,
//        name = "Вынести мусор",
//        description = "Вынести мусор уверенно",
//        date = Date(1, 1, 1),
//        is_fav = true
//    )
//    TaskElement(task = task)
//
//}