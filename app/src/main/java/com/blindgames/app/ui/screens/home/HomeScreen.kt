package com.blindgames.app.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.blindgames.app.ui.components.GameButton

@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Blind Games",
            style = MaterialTheme.typography.headlineMedium
        )

        GameButton(
            title = "Domino",
            onClick = {}
        )

        GameButton(
            title = "American Domino",
            onClick = {}
        )

        GameButton(
            title = "Backgammon",
            onClick = {}
        )

        GameButton(
            title = "Chess",
            onClick = {}
        )

        GameButton(
            title = "Card Games",
            onClick = {}
        )

        GameButton(
            title = "Settings",
            onClick = {}
        )
    }
}
