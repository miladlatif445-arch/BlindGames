package com.blindgames.app.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MainScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Blind Games",
            style = MaterialTheme.typography.headlineMedium
        )

        Button(onClick = { }) {
            Text("Domino")
        }

        Button(onClick = { }) {
            Text("American Domino")
        }

        Button(onClick = { }) {
            Text("Backgammon")
        }

        Button(onClick = { }) {
            Text("Chess")
        }

        Button(onClick = { }) {
            Text("Card Games")
        }

        Button(onClick = { }) {
            Text("Settings")
        }
    }
}
