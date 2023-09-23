package com.example.jetpackcomposenavigationsample.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.jetpackcomposenavigationsample.data.ROUTES


@Composable
fun SettingPage(authNavController:NavController) {
    Column {
        Text(text = "Setting")
        TextButton(onClick = {
            authNavController.navigate(ROUTES.LOGIN.name) {
                popUpTo(ROUTES.HOME.name) {
                    inclusive = true
                }
            }
        }) {
            Text(text = "Log Out")
        }
    }
}