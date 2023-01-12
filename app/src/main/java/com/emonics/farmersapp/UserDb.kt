package com.emonics.farmersapp

import android.content.Context
import android.os.Build.VERSION
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Users :: class], version = 1)
abstract class UserDb : RoomDatabase() {
    abstract fun userApi(): UsersAPI
    companion object {
        @Volatile
        private var INSTANCE: UserDb? = null

        fun getDatabase(context: Context) : UserDb {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    UserDb::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }

    }
}