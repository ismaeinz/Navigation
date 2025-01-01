package com.example.navigation.bottomNavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens
    (
    val route: String,
    var title: String,
    val icon: ImageVector
) {
    object Home : Screens(
        route = "home",
        title = "home",
        icon = Icons.Default.Home
    )

    object Account : Screens(
        route = "Account",
        title = "Account",
        icon = Icons.Default.AccountCircle
    )

    object Search : Screens(
        route = "Search",
        title = "Search",
        icon = Icons.Default.Search
    )

    object Settings : Screens(
        route = "Settings",
        title = "Settings",
        icon = Icons.Default.Settings
    )
}