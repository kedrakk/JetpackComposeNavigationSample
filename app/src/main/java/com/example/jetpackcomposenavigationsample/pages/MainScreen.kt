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
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposenavigationsample.data.ROUTES

@Composable
fun MainScreenPage() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ROUTES.LOGIN.name){
        composable(ROUTES.LOGIN.name){
            LoginPage(navController = navController)
        }
        composable(ROUTES.HOME.name){
            HomePage()
        }
        composable(ROUTES.ACCOUNT.name){
            AccountPage()
        }
        composable(ROUTES.DETAIL.name){
            DetailPage()
        }
        composable(ROUTES.SETTING.name){
            SettingPage()
        }
    }
}