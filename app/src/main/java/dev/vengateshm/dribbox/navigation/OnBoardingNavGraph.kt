package dev.vengateshm.dribbox.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import dev.vengateshm.dribbox.Screen
import dev.vengateshm.dribbox.presentation.login.LoginScreen

fun NavGraphBuilder.onBoardingNavGraph(navController: NavController) {
    composable(Screen.Login.route) {
        LoginScreen(navController = navController)
    }
}