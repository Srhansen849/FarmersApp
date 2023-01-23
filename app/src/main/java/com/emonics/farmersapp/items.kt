package com.emonics.farmersapp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "item_table")
data class Items(
    @PrimaryKey(autoGenerate = true) val item_id: Int?,
    @ColumnInfo(name = "item_name") val name: String?,
    @ColumnInfo(name = "item_price") val price: Int?,
    @ColumnInfo(name = "item_description") val description: String?,
    @ColumnInfo(name = "item_image") val image: String?
)
