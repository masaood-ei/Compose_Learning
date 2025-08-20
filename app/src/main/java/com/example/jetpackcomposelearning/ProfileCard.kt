package com.example.jetpackcomposelearning
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun ProfileCard() {
   Row (
       modifier = Modifier
           .fillMaxWidth()
           .padding(16.dp)
           .background(Color(0xFFE3F2FD), shape = RoundedCornerShape(12.dp))
           .padding(16.dp)
   ){
       Image(
           painter = painterResource(id = R.drawable.ic_launcher_foreground),
           contentDescription = "Profile",
           modifier = Modifier
               .size(64.dp)
               .clip(CircleShape)
               .background(Color.Gray)
       )
       Spacer(modifier = Modifier.width(16.dp))

       Column {
           Text("Suraj Singh", fontSize = 20.sp, fontWeight = FontWeight.Bold)
           Text("Associate Android Developer")
       }

   }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFFE3F2FD), shape = RoundedCornerShape(12.dp))
            .padding(16.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(Color.Gray)

        )
        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text("Masaood Raza", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("Associate Android Developer")
        }
    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFFE3F2FD), shape = RoundedCornerShape(12.dp))
            .padding(16.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(Color.Gray)

        )
        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text("Masaood Raza", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("Associate Android Developer")
        }

    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFFE3F2FD), shape = RoundedCornerShape(12.dp))
            .padding(16.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(Color.Gray)

        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text("Masaood Raza", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("Associate Android Developer")
        }
    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFFE3F2FD), shape = RoundedCornerShape(12.dp))
            .padding(16.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(Color.Gray)

        )
        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text("Nitin Sahu", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.size(12.dp,12.dp))
            Text("Associate Android Developer")
        }
    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFFE3F2FD), shape = RoundedCornerShape(12.dp))
            .padding(16.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(Color.Gray)

        )
        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text("Masaood Raza", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.size(12.dp))
            Text("Associate Android Developer")
        }
    }
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color(0xFFE3F2FD), shape = RoundedCornerShape(12.dp))
            .padding(16.dp)
    ){
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "Profile",
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape)
                .background(Color.Gray)

        )
        Spacer(modifier = Modifier.width(16.dp))

        Column {
            Text("Suraj Singh", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text("Associate Android Developer")
        }

    }
}
@Composable
@Preview(showSystemUi = true)
fun Prev (modifier: Modifier = Modifier) {
    ProfileCard()
}