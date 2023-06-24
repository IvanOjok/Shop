package com.ivanojok.shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val matooke = Food(R.drawable.money,"matooke", "matooke", "Fibre")
        val rice = Food(R.drawable.money,"rice", "matooke", "Fibre")
        val chicken = Food(R.drawable.money,"chicken", "matooke", "Fibre")
        val steak = Food(R.drawable.money,"steak", "matooke", "Fibre")

        val list = MutableList<Food>(20, init = {Food(R.drawable.money, "Katogo", "Matooke, Irish, Peanut Butter, Meat", "t's a long one")})
        list.add(matooke)
        list.add(rice)
        list.add(chicken)
        list.add(steak)
        val myAdapter = MyRecyclerAdapter(this, list)

        val recyclerView = findViewById<RecyclerView>(R.id.my_list)
        recyclerView.layoutManager = GridLayoutManager(this, 2 )
        recyclerView.adapter = myAdapter
    }
}