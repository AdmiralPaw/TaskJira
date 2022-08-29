package com.example.taskjira.data.models

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.taskjira.ui.theme.Blue
import com.example.taskjira.ui.theme.Orange
import com.example.taskjira.ui.theme.Red

enum class TaskPriority(
    imageVector: ImageVector,
    color: Color
) {
    CRITICAL(Icons.Default.KeyboardArrowUp, Red),
    HIGH(Icons.Default.KeyboardArrowUp, Red),
    MEDIUM(Icons.Default.Menu, Orange),
    LOW(Icons.Default.KeyboardArrowDown, Blue),
    PLAN(Icons.Default.DoubleArrow, Blue),
    BLOCK(Icons.Default.StopCircle, Red)
}