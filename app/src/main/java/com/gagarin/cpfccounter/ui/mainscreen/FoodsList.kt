package com.gagarin.cpfccounter.ui.mainscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gagarin.cpfccounter.R
import com.gagarin.cpfccounter.data.DataSource
import com.gagarin.cpfccounter.model.Food
import com.gagarin.cpfccounter.ui.theme.CPFCCounterTheme

@Composable
fun FoodsList(foodList: List<Food>, modifier: Modifier = Modifier) {
//    val list = remember {
//        List(10) {
//            "Item ${it + 1}"
//        }.toMutableStateList()
//    }
    LazyColumn(
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
            .fillMaxWidth()
    ) {
        items(foodList) { item ->
            FoodListItemCard(food = item)
        }

    }
}

@Composable
fun FoodListItemCard(food: Food, modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.elevatedCardElevation(4.dp),
        colors = CardDefaults.elevatedCardColors()
    ) {
        Text(
            text = food.foodName,
            modifier = modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        Row(
            modifier = modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween

        ) {
            ValueItem(
                valueName = stringResource(id = R.string.cal),
                value = food.calories.toString()
            )
            ValueItem(
                valueName = stringResource(id = R.string.prot),
                value = food.protein.toString()
            )
            ValueItem(valueName = stringResource(id = R.string.fat), value = food.fat.toString())
            ValueItem(
                valueName = stringResource(id = R.string.carbs),
                value = food.carbohydrates.toString()
            )
        }
    }
}

@Composable
fun ValueItem(valueName: String, value: String) {
    Row {
        Text(text = valueName)
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = value)
    }
}


@Preview(showBackground = true)
@Composable
fun FoodListPreview() {
    CPFCCounterTheme {
        FoodsList(foodList = DataSource().loadFoods())
    }
}