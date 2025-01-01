package com.example.navigation.bottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavBottom(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screens.Home.route
    ) {
        composable(Screens.Home.route) {
            Home()
        }
        composable(Screens.Account.route) {
            Account()
        }
        composable(Screens.Settings.route) {
            Settings()
        }
        composable(Screens.Search.route) {
            Search()
        }
    }
}