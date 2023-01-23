package com.emonics.farmersapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Card :: class], version = 1)
abstract class CardDb : RoomDatabase() {
    abstract fun cardApi(): CardAPI
    companion object {
        @Volatile
        private var INSTANCE: CardDb? = null

        fun getDatabase(context: Context) : CardDb {
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    CardDb::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }

    }
}