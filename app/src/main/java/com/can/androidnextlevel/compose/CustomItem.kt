package com.can.androidnextlevel.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.can.androidnextlevel.R
import com.can.androidnextlevel.model.Country
import com.can.androidnextlevel.viewmodel.FeedViewModel

@Composable
fun CustomItemCompose(person:Country) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp),
        horizontalArrangement = Arrangement.Absolute.Left
    ){
        Image(
            modifier = Modifier
                .width(200.dp)
                .fillMaxHeight()
                .padding(3.dp),
            painter = painterResource(id = R.drawable.foto),
            contentScale = ContentScale.Crop,
            contentDescription = "blackhole")
        Column (
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            ){
            Text(
                text = person.countryName.toString(),
                fontSize = 20.sp,
            )
            Spacer(modifier = Modifier.size(10.dp))
            Text(
                text = person.countryRegion.toString(),
                fontSize = 15.sp,)
        }
    }
}