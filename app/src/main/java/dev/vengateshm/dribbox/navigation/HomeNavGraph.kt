package dev.vengateshm.dribbox.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import dev.vengateshm.dribbox.Screen
import dev.vengateshm.dribbox.presentation.home.HomeScreen
import dev.vengateshm.dribbox.presentation.storageDetail.StorageDetailScreen

@ExperimentalFoundationApi
fun NavGraphBuilder.homeNavGraph(navController:NavController) {
    composable(route = Screen.Home.route) {
        HomeScreen(navController = navController)
    }
    composable(route = Screen.StorageDetail.route) {
        StorageDetailScreen(navController = navController)
    }
}