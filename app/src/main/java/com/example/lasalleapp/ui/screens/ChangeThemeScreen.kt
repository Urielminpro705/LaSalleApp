package com.example.lasalleapp.ui.screens

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ChangeThemeScreen(innerPadding : PaddingValues) {
    Text(
        text = "Cambia el tema epicamente",
        modifier = Modifier
            .padding(innerPadding)
    )
}