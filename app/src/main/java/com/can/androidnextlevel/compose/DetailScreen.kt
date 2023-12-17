package com.can.androidnextlevel.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.can.androidnextlevel.R

@Composable
fun DetailScrenCompose() {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Spacer(modifier = Modifier.height(100.dp))
        Image(
            modifier = Modifier.height(200.dp).fillMaxWidth().padding(10.dp),
            painter = painterResource(id = R.drawable.foto),
            contentScale = ContentScale.FillWidth,
            contentDescription ="black_hole" )
        Spacer(modifier = Modifier.height(50.dp))
        Text(
            text = "Country Name",
            fontSize = 31.sp,
            color = Color.Black,
            fontWeight = FontWeight.SemiBold,
            fontStyle = FontStyle.Italic,
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Country Capital",
            fontSize = 20.sp,
            color = Color.Black,
            fontStyle = FontStyle.Italic,
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Country Region",
            fontSize = 20.sp,
            color = Color.Black,
            fontStyle = FontStyle.Italic,
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Country Currency",
            fontSize = 20.sp,
            color = Color.Black,
            fontStyle = FontStyle.Italic,
        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Country Language",
            fontSize = 20.sp,
            color = Color.Black,
            fontStyle = FontStyle.Italic,
        )
    }
}