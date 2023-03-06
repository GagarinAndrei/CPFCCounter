package com.gagarin.cpfccounter.ui.foodscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gagarin.cpfccounter.ui.theme.CPFCCounterTheme

@Composable
fun AddFoodScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize()
    ) {
        Column(
            modifier = modifier.padding(8.dp)
        ) {
            FoodOverview()
        }
    }
}

@Composable
fun FoodOverview(modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.elevatedCardElevation(8.dp),
        colors = CardDefaults.elevatedCardColors(),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = modifier.padding(8.dp)
        ) {
            OutlinedTextField(
                value = "",
                onValueChange = { },
                label = { Text("Food name") },
                modifier = modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddFoodScreenPreview() {
    CPFCCounterTheme {
        AddFoodScreen()
    }
}
