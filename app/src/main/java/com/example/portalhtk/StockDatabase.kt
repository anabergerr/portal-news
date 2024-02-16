package com.example.portalhtk

object StockDatabase {

    private val stockList = listOf(
        Stock(1, "AAPL", "Apple Inc.", 1500.50, 1.2, 10000),
        Stock(2, "GOOGL", "Alphabet Inc.", 2800.25, -0.5, 5000),
        Stock(3, "MSFT", "Microsoft Corporation", 350.75, 0.8, 8000),
        Stock(4, "AMZN", "Amazon.com Inc.", 3300.80, -0.3, 7000),
        Stock(5, "TSLA", "Tesla Inc.", 900.60, 2.5, 12000),
        Stock(6, "FB", "Meta Platforms Inc.", 320.40, 0.1, 6000)
    )

    fun findAll() = stockList
    fun findById(id: Int) = stockList.find{ it.id == id}
    fun findBySymbol(symbol: String) = stockList.find {it.symbol == symbol}

}