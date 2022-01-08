package dev.vengateshm.dribbox

sealed class Screen(val route: String) {
    object Login : Screen("login_screen")
    object Home : Screen("home_screen")
    object StorageDetail : Screen("storage_detail_screen")
}
