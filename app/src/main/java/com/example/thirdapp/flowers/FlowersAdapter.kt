package com.example.thirdapp.flowers

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.thirdapp.R

class FlowersAdapter(val flowerList: Array<String>,val flowersImages : List<Int>) : RecyclerView.Adapter<FlowersAdapter.FlowerViewHolder>() {

    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val flowerTextView: TextView = itemView.findViewById(R.id.flower_text)
        private val flowersImages: ImageView = itemView.findViewById(R.id.imageView)


        fun bind(word: String,image : Int){
            flowersImages.setImageResource(image)
            flowerTextView.text = word
        }
    }

    // Returns a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return FlowerViewHolder(view)
    }

    // Displays data at a certain position
    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.bind(flowerList[position], flowersImages[position])
    }

    // Returns size of data list
    override fun getItemCount(): Int {
        return flowerList.size
    }
}