package com.example.jetpackcomposelearning
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun StyleText() {
    Text(
        text = "Welcome world!",
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold
    )
}