package com.gagarin.cpfccounter.ui.mainscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gagarin.cpfccounter.ui.theme.CPFCCounterTheme

@Composable
fun OverviewElement(item: String, modifier: Modifier = Modifier) {
    Column {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier
                .padding(4.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = item,
                modifier = modifier.weight(1f)
            )
            Spacer(modifier = modifier.size(4.dp))
            Text(
                text = "100",
            )
            Text(text = " / ")
            Text(
                text = "200",
            )
        }
        LinearProgressIndicator(
            progress = 0.7f,
            modifier = modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun OverviewElementPreview() {
    CPFCCounterTheme {
        OverviewElement("Calories")
    }
}