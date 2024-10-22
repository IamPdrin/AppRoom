package br.edu.fatecpg.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import br.edu.fatecpg.model.User

@Dao
interface UserDao {
    @Query("SELECT * FROM user")
    fun getAll():List<User>

    @Insert
    suspend fun insertAll(vararg user: User)

}