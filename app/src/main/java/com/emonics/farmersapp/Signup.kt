package com.emonics.farmersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.emonics.farmersapp.databinding.ActivityMainBinding
import com.emonics.farmersapp.databinding.ActivitySignupBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
class Signup : AppCompatActivity() {

    private lateinit var userDb: UserDb
    lateinit var binding: ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

    private fun writeData(){

        val firstName = binding.etFName.text.toString()
        val lastName = binding.etLName.text.toString()
        val userName = binding.etUName.text.toString()
        val emailAddress = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        val cpassword = binding.etCpassword.text.toString()


        if(firstName.isNotEmpty() && lastName.isNotEmpty()  && userName.isNotEmpty() && emailAddress.isNotEmpty() && password.isNotEmpty() && cpassword.isNotEmpty() ) {
            if(password == cpassword){
                val newuser = Users(
                    null, firstName, lastName, emailAddress, password, cpassword, null, null
                )
                GlobalScope.launch(Dispatchers.IO) {

                    userDb.userApi().insert(newuser)
                }

                binding.etFName.text.clear()
                binding.etLName.text.clear()
                binding.etEmail.text.clear()
                binding.etUName.text.clear()
                binding.etPassword.text.clear()
                binding.etCpassword.text.clear()

                Toast.makeText(this@Signup,"Success",Toast.LENGTH_SHORT).show()
            }else Toast.makeText(this@Signup,"Passwords did not match",Toast.LENGTH_SHORT).show()

        }else Toast.makeText(this@Signup,"Please Enter personal data",Toast.LENGTH_SHORT).show()

    }

}