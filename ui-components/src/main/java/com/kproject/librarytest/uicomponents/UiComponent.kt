package com.kproject.librarytest.uicomponents

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import dev.vivvvek.seeker.Seeker
import dev.vivvvek.seeker.SeekerDefaults

@Composable
fun CustomText(
    text: String
) {
    Text(
        text = text,
        color = Color.Red
    )
}

@Composable
fun CustomSlider(
    value: Float
) {
    Seeker(
        value = 50f,
        onValueChange = {},
        colors = SeekerDefaults.seekerColors(
            progressColor = Color.Green
        )
    )
}
