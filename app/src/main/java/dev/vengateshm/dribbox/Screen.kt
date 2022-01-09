package dev.vengateshm.dribbox

sealed class Screen(val route: String) {
    object Login : Screen("login")
    object Home : Screen("home")
    object Profile : Screen("profile")
    object StorageDetail : Screen("storage")
    object Settings : Screen("settings")
}
