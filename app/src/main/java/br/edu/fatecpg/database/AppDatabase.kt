package br.edu.fatecpg.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.edu.fatecpg.dao.UserDao
import br.edu.fatecpg.model.User

@Database(entities = [User::class], version = 1)
abstract class AppDatabase:RoomDatabase() {
    abstract fun userDao():UserDao
}