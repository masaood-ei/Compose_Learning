package com.example.jetpackcomposelearning

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumn() {
    LazyColumn {
        items(count = 100) { index ->
            Text("Item $index", modifier = Modifier.padding(16.dp))
        }
    }

}
@Preview(showSystemUi = true)
@Composable
fun prevue() {
    LazyColumn()

}