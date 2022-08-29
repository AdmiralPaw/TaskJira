package com.example.taskjira.data.models

import androidx.compose.ui.graphics.Color
import com.example.taskjira.ui.theme.Blue
import com.example.taskjira.ui.theme.Green

sealed class TaskStatus(
    val name: String,
    val color: Color,
) {
    class Ready : TaskStatus(
        name = "Готово",
        color = Green
    )
    class InWork : TaskStatus(
        name = "В Работе",
        color = Blue,
    )
    class Pause : TaskStatus(
        name = "На паузе",
        color = Blue,
    )
}