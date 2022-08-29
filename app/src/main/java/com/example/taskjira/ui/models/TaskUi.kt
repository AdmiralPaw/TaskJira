package com.example.taskjira.ui.models

import com.example.taskjira.data.models.Task

data class TaskUi(val taskModel: Task? = null) {
    var relatedTasksExpanded = false
    var taskTimeTrackerExpanded = false
}