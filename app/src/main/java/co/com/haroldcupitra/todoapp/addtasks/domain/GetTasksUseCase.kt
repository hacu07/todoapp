package co.com.haroldcupitra.todoapp.addtasks.domain

import co.com.haroldcupitra.todoapp.addtasks.data.TaskRepository
import co.com.haroldcupitra.todoapp.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(
    private val taskRepository: TaskRepository
) {
    operator fun invoke(): Flow<List<TaskModel>> = taskRepository.tasks
}