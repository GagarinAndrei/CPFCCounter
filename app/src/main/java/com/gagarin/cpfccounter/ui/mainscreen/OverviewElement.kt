package com.gagarin.cpfccounter.ui.mainscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gagarin.cpfccounter.ui.theme.CPFCCounterTheme

@Composable
fun OverviewElement(item: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(4.dp)
    ) {
        Text(
            text = item,
        )
        LinearProgressIndicator(
            progress = 0.5f,
        )
        Row {
            Text(text = "100")
            Text(text = " / ")
            Text(text = "200")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun OverviewElementPreview() {
    CPFCCounterTheme {
        OverviewElement("Calories")
    }
}