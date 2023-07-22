package com.example.jetpackcomposenavigationsample.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposenavigationsample.data.BottomBarItemsData
import com.example.jetpackcomposenavigationsample.ui.theme.PurpleGrey80

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CommonAppBar(label:String) {
    TopAppBar(
        title = { Text(text = label) },
        colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Magenta, titleContentColor = White)
    )
}

@Composable
fun CommonBottomBar() {
    BottomAppBar(
        containerColor = PurpleGrey80,
        contentColor = White,
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            BottomBarItemsData.allBottomBarItems.map {
                Button(onClick = { /*TODO*/ }) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Image(painter = painterResource(id = it.icon), contentDescription = it.label,)
                        Text(text = it.label, modifier = Modifier.padding(horizontal = 5.dp))
                    }
                }
            }
        }
    }
}