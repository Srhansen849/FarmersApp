package com.emonics.farmersapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Myadapter (private val context: Activity, private val arrayList:ArrayList<items>):ArrayAdapter<items>(context,R.layout.list_item,arrayList){

    //method overwrite

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        // creating view object
        val inflater:LayoutInflater = LayoutInflater.from(context)
        val view :View =inflater.inflate(R.layout.list_item,null)

        //refer to all items in resource file

        val imageView : ImageView =view.findViewById(R.id.fruit_pic)
        val name: TextView = view.findViewById(R.id.fruitName)
        val description:TextView=view.findViewById(R.id.itemDescription)

        //set the data for the 3 elements
        imageView.setImageResource(arrayList[position].imageId)
        name.text=arrayList[position].name
        description.text=arrayList[position].description


        return view
    }


}