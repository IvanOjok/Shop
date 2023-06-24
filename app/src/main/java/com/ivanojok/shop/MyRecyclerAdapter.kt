package com.ivanojok.shop

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class MyRecyclerAdapter(var context: Context, var list:MutableList<Food>): RecyclerView.Adapter<MyRecyclerAdapter.RecyclerViewHolder>() {

    inner class RecyclerViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val foodImage = itemView.findViewById<ImageView>(R.id.food_image)
        val foodName = itemView.findViewById<TextView>(R.id.food_name)

        val myCard = itemView.findViewById<CardView>(R.id.my_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val listView = LayoutInflater.from(context).inflate(R.layout.item_layout, parent)
        return RecyclerViewHolder(listView)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.foodImage.setImageResource(list[position].image)
        holder.foodName.text = list[position].name

        holder.myCard.setOnClickListener {
            val intent = Intent(context, FoodDetailsActivity::class.java)
            intent.putExtra("foodImage", list[position].image)
            intent.putExtra("foodName", list[position].name)
            intent.putExtra("foodIngredients", list[position].ingredients)
            intent.putExtra("foodRecipe", list[position].recipe)
            intent.putExtra("foodPrice", list[position].price)
            context.startActivity(intent)
        }
    }
}