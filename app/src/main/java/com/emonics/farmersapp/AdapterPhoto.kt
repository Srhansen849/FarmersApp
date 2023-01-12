package com.emonics.farmersapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterPhoto(private val groceryList: ArrayList<DataModel>) :
    RecyclerView.Adapter<AdapterPhoto.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val groceryImage: ImageView = itemView.findViewById(R.id.image)
        val groceryTitle: TextView = itemView.findViewById(R.id.title)
        val groceryDesc: TextView = itemView.findViewById(R.id.desc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        //we inflate the layout
        val view =LayoutInflater.from(parent.context).inflate(R.layout.photos, parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //binding the data
        val grocery=groceryList[position]
        holder.groceryImage.setImageResource(grocery.image).toString()
        holder.groceryTitle.text=grocery.title
        holder.groceryDesc.text=grocery.desc
    }

    override fun getItemCount(): Int {
        //return size of the list
        return groceryList.size//cheek this on the class vido

    }
}