package com.example.jetpackcomposelearning

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

//@Composable
//fun Greet(name: String){
//    Text("$name")
//
//}

@Preview(showBackground = true)
@Composable
fun increase() {
    var num by remember { mutableStateOf(0) }
    Text("$num")
    Button(onClick = {
        num++
    }) {
        Text("Click Me!")
    }
    Button(onClick = {
        num--
    }) {
        Text("Decrease Button", fontStyle = FontStyle.Italic, fontSize = 24.sp)
    }

}

