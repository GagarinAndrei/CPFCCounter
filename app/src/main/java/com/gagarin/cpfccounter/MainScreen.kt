package com.gagarin.cpfccounter

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gagarin.cpfccounter.ui.theme.CPFCCounterTheme

@Composable
fun MainScreen() {
    Column {
        CPFCOverview()
        Spacer(modifier = Modifier.height(16.dp))
        FoodsList()
    }
}

@Composable
fun CPFCOverview() {
    Card(
        shape = CardDefaults.shape,
        elevation = CardDefaults.elevatedCardElevation()
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = stringResource(R.string.overview),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            OverviewElement(
                item = stringResource(R.string.calories)
            )
            OverviewElement(
                item = stringResource(R.string.protein)
            )
            OverviewElement(
                item = stringResource(R.string.fat)
            )
            OverviewElement(
                item = stringResource(R.string.carbohydrates)
            )
        }
    }
}

@Composable
fun OverviewElement(item: String) {
//    var maxValue by remember { StateOf("0") }
//    var currentValue by remember { mutableStateOf("0") }
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = item,
                modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.size(4.dp))
            Text(
                text = "currentValue",
//            modifier = Modifier.weight(1f)
            )
            Spacer(modifier = Modifier.size(4.dp))
            Text(
                text = "maxValue",
//            modifier = Modifier.weight(1f)
            )
        }
        LinearProgressIndicator(
            progress = 1.0f,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun FoodsList() {
    val list = remember {
        List(10) {
            "Item ${it + 1}"
        }.toMutableStateList()
    }
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

@Composable
fun FoodListItem(foodName: String) {
    Text(
        text = foodName,
        modifier = Modifier.fillMaxWidth()
    )
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    CPFCCounterTheme {
        MainScreen()
    }
}