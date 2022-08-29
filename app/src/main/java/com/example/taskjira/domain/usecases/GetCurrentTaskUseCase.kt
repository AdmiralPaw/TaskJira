package com.example.taskjira.domain.usecases

import com.example.taskjira.data.models.Task
import com.example.taskjira.domain.repositories.TaskRepository

class GetCurrentTaskUseCase(private val repository: TaskRepository) {
    operator fun invoke(): Task? {
        repository.fetch()
        return repository.cachedTasks?.get(0)
    }
}