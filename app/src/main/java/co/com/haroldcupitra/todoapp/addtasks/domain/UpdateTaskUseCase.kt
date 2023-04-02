package co.com.haroldcupitra.todoapp.addtasks.domain

import co.com.haroldcupitra.todoapp.addtasks.data.TaskRepository
import co.com.haroldcupitra.todoapp.addtasks.ui.model.TaskModel
import javax.inject.Inject

class UpdateTaskUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    suspend operator fun invoke(taskModel: TaskModel) {
        taskRepository.update(taskModel)
    }
}