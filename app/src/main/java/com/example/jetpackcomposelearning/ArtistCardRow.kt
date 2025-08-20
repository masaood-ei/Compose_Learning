package com.example.jetpackcomposelearning
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ArtistCard() {
    Row(modifier = Modifier.fillMaxWidth().padding(16.dp)
        .background(Color(0xFFE3F2FD), shape = RoundedCornerShape(16.dp))){
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile Image"
            )
        Column {
            Text("Eminence Innovation Technology", modifier = Modifier.padding(10.dp,20.dp), fontWeight = FontWeight.Bold)
            Text("last seen 3 min ago",modifier = Modifier.padding(10.dp), fontWeight = FontWeight.W400)
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun ArtistPreview() {
    ArtistCard()
}