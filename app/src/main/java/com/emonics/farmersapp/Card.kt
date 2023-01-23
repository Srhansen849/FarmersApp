package com.emonics.farmersapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "card_table")
data class Card(
    @PrimaryKey(autoGenerate = true) val card_id: Int?,
    @ColumnInfo(name = "card_number") val cardnum: Int?,
    @ColumnInfo(name = "exp_date") val expdate: String?,
    @ColumnInfo(name = "cvv") val cvv: Int?,
    @ColumnInfo(name = "card_name") val cardname: String?
)
