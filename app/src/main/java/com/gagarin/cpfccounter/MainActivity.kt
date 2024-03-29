package com.gagarin.cpfccounter

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gagarin.cpfccounter.ui.mainscreen.MainScreen
import com.gagarin.cpfccounter.ui.theme.CPFCCounterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                MainScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CPFCCounterTheme {
        MainScreen()
    }
}
@Preview(showBackground = true,
uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DefaultPreviewNight() {
    CPFCCounterTheme {
        MainScreen()
    }
}