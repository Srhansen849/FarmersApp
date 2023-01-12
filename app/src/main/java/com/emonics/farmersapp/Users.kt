package com.emonics.farmersapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "user_table")
data class Users(
    @PrimaryKey(autoGenerate = true) val user_id: Int?,
    @ColumnInfo(name = "first_name") val fname: String?,
    @ColumnInfo(name = "last_name") val lname: String?,
    @ColumnInfo(name = "email") val email: String?,
    @ColumnInfo(name = "user_name") val username: String?,
    @ColumnInfo(name = "password") val password: String?,
    @ColumnInfo(name = "card_id")val card: Card?,
    val cart: List<Items>?

)

   /*

@Entity(tableName = "student_table")
data class Student(
    @PrimaryKey(autoGenerate = true) val id: Int?,
    @ColumnInfo(name = "first_name") val fName: String?,
    @ColumnInfo(name = "last_name") val lname: String?,
    @ColumnInfo(name = "roll_no") val rNo: Int?
)
    */