package com.gagarin.cpfccounter.data

import com.gagarin.cpfccounter.model.Food

class DataSource {
    fun loadFoods(): List<Food> {
        return listOf(
            Food("Pelmeni", 500, 10, 20, 30),
            Food("Vareniki", 500, 10, 20, 30),
            Food("Bubliki", 500, 10, 20, 30),
            Food("Smetana", 500, 10, 20, 30),
            Food("Borsch", 500, 10, 20, 30)
        )
    }
}