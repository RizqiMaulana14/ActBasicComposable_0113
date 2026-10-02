package com.example.pertemuan3

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HalamanLogin(modifier: Modifier = Modifier) {

    val background = painterResource(id = R.drawable.background)
    val logo = painterResource(id = R.drawable.logo)

    Box(
        modifier = modifier.fillMaxSize()
    ) {

        Image(
            painter = background,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Color.Black.copy(alpha = 0.35f)
                )
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Spacer(modifier = Modifier.height(35.dp))

            Text(
                text = "Login",
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            Text(
                text = "Ini adalah halaman login,",
                fontSize = 18.sp,
                color = Color.White
            )

            Spacer(modifier = Modifier.height(55.dp))

            Image(
                painter = logo,
                contentDescription = "Logo",
                modifier = Modifier
                    .size(150.dp)
                    .padding(5.dp)
            )

            Spacer(modifier = Modifier.height(55.dp))

            Text(
                text = "Nama",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )

            Text(
                text = "Rizqi Maulana Fitrah",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )

            Text(
                text = "20240140113",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}