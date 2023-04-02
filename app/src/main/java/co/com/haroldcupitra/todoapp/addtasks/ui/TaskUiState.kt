package co.com.haroldcupitra.todoapp.addtasks.ui

import co.com.haroldcupitra.todoapp.addtasks.ui.model.TaskModel

sealed interface TaskUiState {
    object Loading: TaskUiState
    data class Error(val throwable: Throwable) : TaskUiState
    data class Success(val tasks:List<TaskModel>) : TaskUiState
}