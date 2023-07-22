package com.example.jetpackcomposenavigationsample.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage() {
    Scaffold(topBar = {
        CommonAppBar(label = "Home")
    },
        bottomBar = {
            CommonBottomBar()
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "This is Home Page", modifier = Modifier.padding(vertical = 10.dp))
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Click here to see detail")
            }
        }
    }

}

@Preview
@Composable
fun HomePreview() {
    HomePage()
}