package com.example.taskjira.data.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowCircleUp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.taskjira.ui.theme.Green

sealed class TaskIcon(
    val color: Color,
    val imageVector: ImageVector,
) {
    class Default : TaskIcon(
        color = Green,
        imageVector = Icons.Default.ArrowCircleUp
    )
}