package com.example.portalhtk

data class Stock(
    val id: Int,
    val symbol: String,
    val name: String,
    val price: Double,
    val variation: Double,
    val volume: Int
)
