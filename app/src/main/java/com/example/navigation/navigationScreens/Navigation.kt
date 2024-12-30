package com.example.navigation.navigationScreens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation.screens.A
import com.example.navigation.screens.B
import com.example.navigation.screens.C

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "A") {
        composable(route = "A") {
            A(navController)
        }
        composable(route = "B") {
            B(navController)
        }
        composable(route = "C") {
            C(navController)
        }

    }
}