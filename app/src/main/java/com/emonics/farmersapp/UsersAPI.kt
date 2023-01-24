package com.emonics.farmersapp

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface UsersAPI {

    @Query("SELECT * FROM user_table")
    fun getAll(): List<Users>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(user: Users)

    @Query("SELECT * FROM user_table WHERE user_name LIKE :username LIMIT 1")
    suspend fun findByUsername(username: String): Users

    @Query("SELECT * FROM user_table WHERE user_id LIKE :qID LIMIT 1")
    suspend fun findByID(qID: Int): Users

}


/*
@Query("SELECT * FROM student_table")
    fun getAll(): List<Student>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(student: Student)

    @Query("SELECT * FROM student_table WHERE roll_no LIKE :roll LIMIT 1")
    suspend fun findByRoll(roll: Int): Student
 */

