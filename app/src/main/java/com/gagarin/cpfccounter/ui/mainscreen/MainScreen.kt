package com.gagarin.cpfccounter.ui.mainscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gagarin.cpfccounter.R
import com.gagarin.cpfccounter.data.DataSource
import com.gagarin.cpfccounter.ui.theme.CPFCCounterTheme

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier.fillMaxSize()
    ) {
        Box {
            Column (
                modifier = modifier.padding(8.dp)
            ) {
                Spacer(modifier = modifier.height(8.dp))
                Card(
                    shape = CardDefaults.elevatedShape,
                    elevation = CardDefaults.elevatedCardElevation(8.dp),
                    colors = CardDefaults.elevatedCardColors()
                ) {
                    Text(
                        text = "01.01.2023",
                        fontWeight = FontWeight.Bold,
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        modifier = modifier
                            .padding(8.dp)
                            .fillMaxWidth()
                    )
                }
                Spacer(modifier = modifier.height(8.dp))
                CPFCOverview()
                Spacer(modifier = modifier.height(8.dp))
                FoodsList(foodList = DataSource().loadFoods())
            }
            FloatingActionButton(
                onClick = { /*TODO*/ },
                shape = CircleShape,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_add_24),
                    contentDescription = stringResource(R.string.add_new_food)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    CPFCCounterTheme {
        MainScreen()
    }
}