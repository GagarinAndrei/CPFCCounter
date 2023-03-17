package com.gagarin.cpfccounter.ui.mainscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gagarin.cpfccounter.R
import com.gagarin.cpfccounter.ui.theme.CPFCCounterTheme

@Composable
fun CPFCOverview(modifier: Modifier = Modifier) {
    Card(
        elevation = CardDefaults.elevatedCardElevation(4.dp),
        colors = CardDefaults.elevatedCardColors(),
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = modifier.fillMaxWidth()
        ) {
            OverviewElement(
                item = stringResource(R.string.calories)
            )
            Row(
                horizontalArrangement = Arrangement.Center,
//                modifier = modifier.fillMaxWidth(0.33f)
            ) {
                OverviewElement(
                    item = stringResource(R.string.protein),
                    modifier = modifier.fillMaxWidth(0.3f)
                )
                OverviewElement(
                    item = stringResource(R.string.fat),
                    modifier = modifier.fillMaxWidth(0.4f)
                )
                OverviewElement(
                    item = stringResource(R.string.carbohydrates),
                    modifier = modifier.fillMaxWidth(0.6f)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun CPFCOverviewPreview() {
    CPFCCounterTheme {
        CPFCOverview()
    }
}