package com.emonics.farmersapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //private lateinit var recyclerView: RecyclerView //for recycler view
   // private lateinit var groceryList:ArrayList<DataModel>//
    //private lateinit var groceryAdapter:AdapterPhoto


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // get reference to textview
       // val sign_in= findViewById(R.id.Sign_in) as textview
        val sign_in= findViewById<Button>(R.id.Sign_in)
        // set on-click listener
        sign_in.setOnClickListener {
            // your code to perform when the user clicks on the TextView
            Toast.makeText(this@MainActivity, "You clicked on TextView 'Click Me'.", Toast.LENGTH_SHORT).show()
        }
    }
}




/*init()

    }
    //initialize our find id
    private fun init(){
        recyclerView=findViewById(R.id.home_recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        groceryList= ArrayList()

        addDataToList()

        groceryAdapter=AdapterPhoto(groceryList)
        recyclerView.adapter=groceryAdapter


    }
    private fun addDataToList(){
        groceryList.add(DataModel(R.drawable.b, "Breads and bakery ","Breads, bakery"))
        groceryList.add(DataModel(R.drawable.freashfood, "Fresh Foods  ","FreshFoods "))
        groceryList.add(DataModel(R.drawable.meetseefood, "Meats and see foods  ","Meats,see_foods  "))
        groceryList.add(DataModel(R.drawable.coofee, "Coffee and Breakfast  ","Coffee and Breakfast  "))
    }
}*/