package com.emonics.farmersapp

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CardAPI {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(card: Card)

    @Query("SELECT * FROM card_table WHERE card_id LIKE :qID LIMIT 1")
    suspend fun findByID(qID: Int): Card

}