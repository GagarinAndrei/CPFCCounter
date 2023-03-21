package com.gagarin.cpfccounter.ui.mainscreen

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gagarin.cpfccounter.R
import com.gagarin.cpfccounter.data.DataSource
import com.gagarin.cpfccounter.model.Food
import com.gagarin.cpfccounter.ui.theme.CPFCCounterTheme
import java.security.AllPermission

@Composable
fun FoodsList(foodList: List<Food>, modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.elevatedCardElevation(4.dp),
        colors = CardDefaults.elevatedCardColors()
    ) {
        LazyColumn(
            contentPadding = PaddingValues(bottom = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = modifier
                .fillMaxWidth()
        ) {
            items(foodList) { item ->
                FoodListItemCard(food = item)
            }

        }
    }
}

@Composable
fun FoodListItemCard(food: Food, modifier: Modifier = Modifier) {
    var extended by remember() { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioLowBouncy,
                    stiffness = Spring.StiffnessHigh
                )
            )
            .padding(8.dp)
    ) {

        Text(
            text = food.foodName
        )

        Row(
            modifier = modifier
//                    .padding(8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ValueItem(
                valueName = stringResource(id = R.string.cal),
                value = food.calories.toString()
            )
            FoodItemButton(
                extended = extended,
                onClick = { extended = !extended }
            )
        }
        if (extended) {
            FoodExtendedInfo(food = food)
        }
    }
}

@Composable
fun FoodExtendedInfo(food: Food, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ValueItem(
            valueName = stringResource(id = R.string.prot),
            value = food.protein.toString()
        )
        ValueItem(
            valueName = stringResource(id = R.string.fat),
            value = food.fat.toString()
        )
        ValueItem(
            valueName = stringResource(id = R.string.carbs),
            value = food.carbohydrates.toString()
        )
    }
}

@Composable
fun FoodItemButton(
    extended: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick
    ) {
        Icon(
            imageVector = if (extended) Icons.Filled.ExpandLess else Icons.Filled.ExpandMore,
            contentDescription = null
        )
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