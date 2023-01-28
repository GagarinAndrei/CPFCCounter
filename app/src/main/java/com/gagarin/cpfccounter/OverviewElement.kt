package com.gagarin.cpfccounter

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

@Preview(showBackground = true)
@Composable
fun OverviewElementPreview() {
    CPFCCounterTheme {
        OverviewElement("Calories")
    }
}