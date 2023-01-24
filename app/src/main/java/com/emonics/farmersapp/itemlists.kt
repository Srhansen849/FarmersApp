package com.emonics.farmersapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emonics.farmersapp.databinding.ActivityItemlistfirstpageBinding
import com.emonics.farmersapp.databinding.ActivityListofitamsBinding

class itemlists : AppCompatActivity() {

    //declaring for the banding
    private lateinit var binding: ActivityItemlistfirstpageBinding


    // declaring for the array list
    private lateinit var itemArrayList: ArrayList<items>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_itemlists)
//binding
        binding = ActivityItemlistfirstpageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // crating an arrya which contatins the data

        // add the images
        val imageId = intArrayOf(
            R.drawable.strobary,
            R.drawable.carrot,
            R.drawable.banana,
            R.drawable.eggplant,
            R.drawable.tomato,
            R.drawable.orange
        )

        // add names of the fruits and veggies
        val name = arrayOf(
            "Strobary",
            "Carrot",
            "Banana",
            "Eggplant",
            "Tomato",
            "Orange"
        )

        // add the description of the fruits and veggies
        val description = arrayOf(

            "Fresh Strawberries, 2 lb ,$5",
            "Whole Carrots, 16 Oz bag $4",
            "Marketside Organic Bananas, Bunch $2",
            "Fresh Purple Eggplant, Each $1",
            "Tomato on the Vine, Bag $2",
            "Navel Oranges, 3 lb Bag $4"


        )
        //initialize the array list
        itemArrayList = ArrayList()

        // loop for to store our data in the array using an object
        // and add or the data in the array list
        for (i in name.indices) {

            val item = items(name[i], description[i], imageId[i])
            itemArrayList.add(item)
        }

        //click listener


        binding.listview.isClickable = true

        // setting the adapter
        binding.listview.adapter = Myadapter(this, itemArrayList)

        // seting on item click listener which delers in the top for  item on click

        binding.listview.setOnItemClickListener { parent, view, position, id ->

            // getting the data on this variables
            // getting all the data  inside the variables for particular position when the user clicks
            val imageId = imageId[position]
            val name = name[position]
            val description = description[position]

            // sending the data for the next activity
            val i = Intent(this, listofitams::class.java)

            //sending the data for the next actvity using putextra method
            i.putExtra("name", name)
            i.putExtra("description", description)
            i.putExtra("imageId", imageId)

            startActivity(i)


        }
    }
}