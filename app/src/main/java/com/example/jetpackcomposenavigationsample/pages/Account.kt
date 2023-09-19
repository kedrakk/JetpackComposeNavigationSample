package com.example.jetpackcomposenavigationsample.pages

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpackcomposenavigationsample.data.ROUTES

@Composable
fun AccountPage(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "This is Account Page", modifier = Modifier.padding(vertical = 10.dp))
        Button(onClick = {
            navController.navigate(ROUTES.SETTING.name)
        }) {
            Text(text = "Click here to see setting")
        }
    }
}