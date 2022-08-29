package com.example.taskjira.data.dataSource

import com.example.taskjira.data.models.Project
import com.example.taskjira.data.models.Task
import com.example.taskjira.data.models.taskModelFabric

class TaskDataSource {
    fun getAllTasks(): List<Task> {
        return listOf(taskModelFabric())
    }

    fun getTasksOnProject(project: Project): List<Task> {
        return listOf(taskModelFabric())
    }

    fun getTaskOnProjectById(project: Project, id: Int): Task {
        return taskModelFabric()
    }

    fun update(newTask: Task) {
        TODO("Not yet implemented")
    }

    fun add(newTask: Any) {
        TODO("Not yet implemented")
    }
}

