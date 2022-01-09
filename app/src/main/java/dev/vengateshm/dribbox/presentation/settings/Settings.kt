package dev.vengateshm.dribbox.presentation.settings

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Settings(onBack: () -> Unit) {
    BackHandler(onBack = onBack)
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Settings")
    }
}