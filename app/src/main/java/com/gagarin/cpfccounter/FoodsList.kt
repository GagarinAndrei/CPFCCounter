package com.gagarin.cpfccounter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FoodsList() {
    val list = remember {
        List(10) {
            "Item ${it + 1}"
        }.toMutableStateList()
    }
    Card(
        shape = CardDefaults.shape,
        elevation = CardDefaults.elevatedCardElevation()
    ) {
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier
                .fillMaxWidth()
        ) {
            items(list) { item ->
                FoodListItem(
                    foodName = item,
                )
            }

        }
    }
}

@Composable
fun FoodListItem(foodName: String) {
    Text(
        text = foodName,
        modifier = Modifier.fillMaxWidth()
    )
}