package com.example.taskjira.domain.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.taskjira.data.dataSource.TaskDataSource
import com.example.taskjira.data.models.Task
import com.example.taskjira.data.models.TaskIcon
import com.example.taskjira.data.models.TaskPriority
import com.example.taskjira.data.models.TaskStatus
import com.example.taskjira.domain.repositories.TaskRepository
import com.example.taskjira.domain.usecases.GetCurrentTaskUseCase
import com.example.taskjira.domain.usecases.UpdateCurrentTaskUseCase
import com.example.taskjira.ui.models.TaskUi

class TaskViewModel(
    val getCurrentTask: GetCurrentTaskUseCase,
    val updateCurrentTask: UpdateCurrentTaskUseCase
) : ViewModel() {
    var currentTask by mutableStateOf(TaskUi())

    init {
        val taskModel = getCurrentTask()
        taskModel?.let {
            currentTask = currentTask.copy(taskModel = it)
        }
    }

    fun setName(name: String) = update(currentTask.taskModel?.copy(name = name))
    fun setStatus(status: TaskStatus) = update(currentTask.taskModel?.copy(status = status))
    fun setPriority(priority: TaskPriority) = update(currentTask.taskModel?.copy(priority = priority))
    fun setIcon(icon: TaskIcon) = update(currentTask.taskModel?.copy(icon = icon))

    private fun update(updatedTaskModel: Task?) {
        updatedTaskModel?.let {
            currentTask = currentTask.copy(taskModel = updatedTaskModel)
            updateCurrentTask(updatedTaskModel)
        }
    }

}