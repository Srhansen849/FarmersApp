package com.emonics.farmersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.emonics.farmersapp.databinding.ActivityListofitamsBinding

class listofitams : AppCompatActivity() {

    //declaring for the banding
    private lateinit var binding: ActivityListofitamsBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listofitams)
        //setContentView(R.layout.activity_itemlists)
//binding
        binding = ActivityListofitamsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intent.getIntExtra("imageId",R.drawable.Banana)
        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")

        // set all the data to the element of this activity

        binding.imageinfo.setImageResource(imageId)
        binding.nameinfo.text = name
        binding.descriptioninfo.text = description
    }
}