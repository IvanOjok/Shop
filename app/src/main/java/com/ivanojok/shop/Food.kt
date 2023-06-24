package com.ivanojok.shop

data class Food(
    var image:Int,
    var name:String,
    var ingredients:String,
    var recipe:String = "",
    var price:String = "UGX. 2000"
)
