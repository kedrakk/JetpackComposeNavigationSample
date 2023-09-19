package com.example.jetpackcomposenavigationsample.pages

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackcomposenavigationsample.data.ROUTES

@Composable
fun MainScreenPage() {
    val navController = rememberNavController()
    NavigationGraph(navController = navController)
}