package com.emonics.farmersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageId = intArrayOf(
            R.drawable.apple,R.drawable.banana,R.drawable.dragonfruit,R.drawable.grapes,R.drawable.kiwi,
            R.drawable.mango
        )

        val name = arrayOf(
            "Apple",
            "Banana",
            "Dragonfruit",
            "Grapes",
            "Kiwi"
            "Mango"
        )

        val itemDescription = arrayOf(
            "Fresh apple","Fresh banana","Fresh","Fresh Dragonfruit","Fresh kiwi",
        "Fresh mango"
        )


    }
}
