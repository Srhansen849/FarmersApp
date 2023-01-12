package com.emonics.farmersapp

import android.content.Context
import android.os.Build.VERSION
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Users :: class], version = 1)
abstract class ItemDb : RoomDatabase() {
    abstract fun itemApi(): ItemAPI
    companion object {
        @Volatile
        private var INSTANCE: ItemDb? = null

        fun getDatabase(context: Context) : ItemDb {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ItemDb::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }

    }
}