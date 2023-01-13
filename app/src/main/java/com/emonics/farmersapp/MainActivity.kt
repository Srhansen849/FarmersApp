package com.emonics.farmersapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // get reference to textview
       // val sign_in= findViewById(R.id.Sign_in) as textview
        val signin= findViewById<TextView>(R.id.Sign_in)
        // set on-click listener
        signin.setOnClickListener {
            val Intent= Intent(this,Home:: class.java )
            startActivity(Intent)
        }
    }
}
