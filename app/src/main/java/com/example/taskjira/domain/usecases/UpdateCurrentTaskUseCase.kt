package com.example.taskjira.domain.usecases

import com.example.taskjira.data.models.Task
import com.example.taskjira.domain.repositories.TaskRepository

class UpdateCurrentTaskUseCase(val repository: TaskRepository) {
    operator fun invoke(taskModel: Task) {
        repository.commit(taskModel)
    }
}