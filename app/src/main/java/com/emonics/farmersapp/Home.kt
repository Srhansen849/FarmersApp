package com.emonics.farmersapp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class Home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // get reference to textview
        // val sign_in= findViewById(R.id.Sign_in)

        val signin= findViewById<TextView>(R.id.Sign_in)
        // crating on click listener for the textview
        // set on-click listener
        signin.setOnClickListener {
            val Intent= Intent(this,registration :: class.java )
            startActivity(Intent)
        }
        // for the items
        val freshfood= findViewById (R.id.fresh_food)as ImageView
        // set on-click listener
        freshfood.setOnClickListener {
            val Intent= Intent(this,itemlists:: class.java )
            startActivity(Intent)
        }


    }
}



