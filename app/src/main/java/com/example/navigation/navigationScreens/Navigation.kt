package com.example.navigation.navigationScreens

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.navigation.screens.A
import com.example.navigation.screens.B

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "A") {
        composable(
            route = "A"
        ) {
            A(navController)
        }

        composable(
            route = "B?name={name}&age={age}",
            arguments = listOf(
                navArgument(
                    name = "name"
                ) {
                    type = NavType.StringType
                    nullable = true
                },
                navArgument(
                    name = "age"
                ) {
                    type = NavType.StringType
                    nullable = true

                },
            )
        ) { it ->
            B(
                navController,
                myName = it.arguments?.getString("name").toString(),
                myAge = it.arguments?.getString("age").toString()
            )
        }

//        composable(route = "C") {
//            C(navController)
//        }

    }
}