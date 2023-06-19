package com.example.tasktrackercompose.feature_task_list.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity
data class Task(
    @PrimaryKey val id: Int? = null,
    val name: String,
    val description: String,
    val date: Date,
    val is_fav: Boolean
)
