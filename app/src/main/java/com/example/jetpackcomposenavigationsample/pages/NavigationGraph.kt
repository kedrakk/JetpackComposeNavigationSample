package com.example.jetpackcomposenavigationsample.pages

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.jetpackcomposenavigationsample.data.ROUTES

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController, startDestination = ROUTES.LOGIN
            .name,
    ) {
        composable(ROUTES.LOGIN.name) {
            LoginPage(navController = navController)
        }
        composable(ROUTES.HOME.name) {
            HomePage()
        }
    }
}

@Composable
fun NavigationGraphHome(navController: NavHostController) {
    NavHost(navController = navController, startDestination = ROUTES.HOME_CONTENT.name){
        composable(ROUTES.HOME_CONTENT.name) {
            HomeContent(navController)
        }
        composable(ROUTES.ACCOUNT.name) {
            AccountPage(navController)
        }
        composable(ROUTES.DETAIL.name) {
            DetailPage()
        }
        composable(ROUTES.SETTING.name) {
            SettingPage(navController = navController)
        }
    }
}
