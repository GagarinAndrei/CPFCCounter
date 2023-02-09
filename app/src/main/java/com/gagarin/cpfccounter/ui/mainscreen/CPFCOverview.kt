package com.gagarin.cpfccounter.ui.mainscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gagarin.cpfccounter.R
import com.gagarin.cpfccounter.ui.theme.CPFCCounterTheme

@Composable
fun CPFCOverview(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.padding(8.dp),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.elevatedCardColors()
    ) {
        Column(
            modifier = modifier.padding(8.dp)
        ) {
            Text(
                text = stringResource(R.string.overview),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                modifier = modifier
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


@Preview(showBackground = true)
@Composable
fun CPFCOverviewPreview() {
    CPFCCounterTheme {
        CPFCOverview()
    }
}