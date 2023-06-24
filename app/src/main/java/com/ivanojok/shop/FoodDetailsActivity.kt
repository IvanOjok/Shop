package com.ivanojok.shop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ivanojok.shop.databinding.ActivityFoodDetailsBinding

class FoodDetailsActivity : AppCompatActivity() {

    var binding: ActivityFoodDetailsBinding ?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodDetailsBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val foodImage = intent.getIntExtra("foodImage", R.drawable.money)
        val foodName = intent.getStringExtra("foodName")
        val foodPrice = intent.getStringExtra("foodPrice")
        val foodIngredients = intent.getStringExtra("foodIngredients")
        val foodRecipe = intent.getStringExtra("foodRecipe")

        binding?.foodImage?.setImageResource(foodImage)
        binding?.foodName?.text = foodName
        binding?.foodPrice?.text = foodPrice
        binding?.foodIngredients?.text = foodIngredients
        binding?.foodRecipe?.text = foodRecipe
    }
}