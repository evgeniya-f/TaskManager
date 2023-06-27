package com.example.tasktrackercompose.feature_task_list.presentation.task_list.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tasktrackercompose.R
import com.example.tasktrackercompose.feature_task_list.domain.model.Task
import java.sql.Date

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TaskElement(
    task: Task,
    onClick: () -> Unit,
    changeFavorite: (task: Task) -> Unit,
    modifier: Modifier,
) {

    Card(
        shape = MaterialTheme.shapes.small,
        modifier = modifier
            .shadow(
                elevation = 4.dp,
                spotColor = Color(0x40000000),
                ambientColor = Color(0x40000000)
            )
            .fillMaxWidth()
            .height(75.dp)
            .background(color = Color(0xFFFFFFFF)),
        onClick = onClick
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier.fillMaxSize()
        ) {
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
                    Text(text = task.date.toString(), modifier = modifier.padding(4.dp))
                }
            }
            IconButton(
                onClick = {
                    val temp = task.copy(is_fav = !task.is_fav)
                    Log.d("Проверка изменения task.is_fav", "Оригинал: ${task.is_fav}, Новый: ${temp}")
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