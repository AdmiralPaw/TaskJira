package com.example.taskjira.data.models

data class Task(
    val id: Int,
    val icon: TaskIcon,
    val project: Project,
    val name: String,
    val deadline: TaskDate,
    val status: TaskStatus,
    val priority: TaskPriority,
    val childTasks: List<Task>,
    val parentTasks: List<Task>
) {
    val key: String
        get() = "$id-${project.name}"
}