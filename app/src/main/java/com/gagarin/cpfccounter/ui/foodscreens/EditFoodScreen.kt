package com.gagarin.cpfccounter.ui.foodscreens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gagarin.cpfccounter.R
import com.gagarin.cpfccounter.ui.theme.CPFCCounterTheme

@Composable
fun EditFoodScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize()
    ) {
        Box {
            Column(
                modifier = modifier.padding(8.dp)
            ) {
                FoodOverview()
            }
            FloatingActionButton(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(4.dp),
                modifier = modifier
                    .padding(16.dp)
                    .align(Alignment.BottomCenter)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = modifier.padding(16.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_edit_24),
                        contentDescription = stringResource(R.string.add_new_food)
                    )
                    Spacer(modifier = modifier.size(4.dp))
                    Text(text = "Edit")
                }
            }
        }
    }
}

@Composable
fun FoodOverview(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Column {
            Card(
                elevation = CardDefaults.elevatedCardElevation(4.dp),
                colors = CardDefaults.elevatedCardColors(),
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
                    OutlinedTextField(
                        value = "",
                        onValueChange = { },
                        label = { Text("Cal") },
                        modifier = modifier.fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = { },
                        label = { Text("Prot") },
                        modifier = modifier.fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = { },
                        label = { Text("Fat") },
                        modifier = modifier.fillMaxWidth()
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = { },
                        label = { Text("Carbs") },
                        modifier = modifier.fillMaxWidth()
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EditFoodScreenPreview() {
    CPFCCounterTheme {
        EditFoodScreen()
    }
}
