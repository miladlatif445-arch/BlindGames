package com.blindgames.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.blindgames.app.ui.BlindGamesTheme
import com.blindgames.app.ui.screens.home.HomeScreen

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            BlindGamesTheme {
                HomeScreen()
            }
        }
    }
}
