package com.example.jetpackcomposelearning

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Composable
//fun ColumnExample() {
//    Column {
//        Text("Data 1")
//        Text("Data 2")
//        Text("Data 3")
//    }
//}
@Composable
fun RowExample(){
    Row {
        Text(
            text = "Hello Modifier",
            modifier = Modifier
                .padding(16.dp)
                .background(Color.Yellow)

        )
        Spacer(modifier = Modifier.width(100.dp))
        Text("Right")
    }
}