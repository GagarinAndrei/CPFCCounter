package com.gagarin.cpfccounter.ui.entryscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gagarin.cpfccounter.data.DataSource
import com.gagarin.cpfccounter.ui.mainscreen.CPFCOverview
import com.gagarin.cpfccounter.ui.mainscreen.FoodsList

@Composable
fun AddEntryScreen(modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize()) {
        Box {
            Column(
                modifier = modifier.padding(8.dp)
            ) {
                CPFCOverview()
                Spacer(modifier = modifier.height(8.dp))
                FoodsList(foodList = DataSource().loadFoods())
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AddEntryScreenPreview() {
    AddEntryScreen()
}