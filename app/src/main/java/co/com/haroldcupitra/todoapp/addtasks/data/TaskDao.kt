package co.com.haroldcupitra.todoapp.addtasks.data

import androidx.room.*
import co.com.haroldcupitra.todoapp.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Query("SELECT * from TaskEntity")
    fun getTasks(): Flow<List<TaskEntity>>

    @Insert
    suspend fun addTask(item: TaskEntity)

    @Update
    suspend fun updateTask(taskModel: TaskEntity)

    @Delete
    suspend fun deleteTask(taskModel: TaskEntity)
}
