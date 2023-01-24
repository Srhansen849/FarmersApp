package com.emonics.farmersapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

            val username = findViewById<EditText>(R.id.et_username)
            val password = findViewById<EditText>(R.id.et_password)
            val uname = "Bhavya"
            val pass = "1234"


                val loginbtn = findViewById<Button>(R.id.loginbtn)
                loginbtn.setOnClickListener{
                    if (username.text.isNullOrBlank() && password.text.isNullOrBlank()) {
                        Toast.makeText(this, "please fill the required fields", Toast.LENGTH_SHORT).show()
                    }
                    //if (username.text == uname && password.text == pass){
                    // val Intent = Intent(this,Home :: class.java)
                    // startActivity(Intent)
                    // }
                    // else{
                    //   Toast.makeText(this, "Signed Up", Toast.LENGTH_SHORT).show()
                    //}
                    else {
                        val Intent = Intent(this, Home::class.java)
                        startActivity(Intent)
                    }
                }
            }
        }

