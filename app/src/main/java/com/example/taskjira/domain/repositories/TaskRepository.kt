package com.example.taskjira.domain.repositories

import com.example.taskjira.data.dataSource.TaskDataSource
import com.example.taskjira.data.models.Task

class TaskRepository(private val dataSource: TaskDataSource) {
    private var fetchTimestamp: Long = 0
    var cachedTasks: List<Task>? = null
        private set

    fun commit(taskModel: Task) {
        when (taskIsPresented(taskModel)) {
            true -> merge(taskModel)
            false -> push(taskModel)
        }
        fetch()
    }

    fun fetch() {
        cachedTasks = dataSource.getAllTasks()
        fetchTimestamp = System.currentTimeMillis()
    }


    private fun push(newTask: Task) {
        dataSource.add(newTask)
    }

    private fun merge(newTask: Task) {
        dataSource.update(newTask)
    }

    private fun taskIsPresented(taskModel: Task) = cachedTasks?.find { task ->
        task.key == taskModel.key
    } == null
}