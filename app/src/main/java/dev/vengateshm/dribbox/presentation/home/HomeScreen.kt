package dev.vengateshm.dribbox.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.DrawerValue
import androidx.compose.material.ModalDrawer
import androidx.compose.material.rememberDrawerState
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.vengateshm.dribbox.Screen
import dev.vengateshm.dribbox.presentation.home.components.Drawer
import dev.vengateshm.dribbox.presentation.home.components.Home
import dev.vengateshm.dribbox.presentation.profile.Profile
import dev.vengateshm.dribbox.presentation.settings.Settings
import dev.vengateshm.dribbox.presentation.storageDetail.StorageDetail
import kotlinx.coroutines.launch

@ExperimentalFoundationApi
@Composable
fun HomeScreen() {
    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val drawerMenuList = DrawerItem.getDrawerMenuList()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    var selectedDrawerItem by remember {
        mutableStateOf("Home")
    }

    val closeDrawer = {
        coroutineScope.launch {
            drawerState.close()
        }
    }

    val openDrawer = {
        coroutineScope.launch {
            drawerState.open()
        }
    }

    ModalDrawer(
        drawerState = drawerState,
        drawerBackgroundColor = Color(0XFFF1F3F6),
        drawerContent = {
            Drawer(
                selectedDrawerItem = selectedDrawerItem,
                navController = navController,
                drawerMenuList = drawerMenuList,
                closeDrawer = {
                    closeDrawer()
                },
                onDrawerItemClick = { drawerItem ->
                    closeDrawer()

                    selectedDrawerItem = drawerItem.title

                    when (drawerItem.title) {
                        "Home" -> {
                            navController.navigate(
                                route = Screen.Home.route
                            ) {
                                popUpTo(navController.graph.startDestinationRoute!!)
                                launchSingleTop = true
                            }
                        }
                        "Profile" -> {
                            navController.navigate(
                                route = Screen.Profile.route
                            ) {
                                popUpTo(navController.graph.startDestinationRoute!!)
                                launchSingleTop = true
                            }
                        }
                        "Storage" -> {
                            navController.navigate(
                                route = Screen.StorageDetail.route
                            ) {
                                popUpTo(navController.graph.startDestinationRoute!!)
                                launchSingleTop = true
                            }
                        }
                        "Settings" -> {
                            navController.navigate(
                                route = Screen.Settings.route
                            ) {
                                popUpTo(navController.graph.startDestinationRoute!!)
                                launchSingleTop = true
                            }
                        }
                    }
                }
            )
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route
        ) {
            composable(route = Screen.Home.route) {
                Home(
                    onHeaderMenuClick = {
                        openDrawer()
                    }
                )
            }
            composable(route = Screen.Profile.route) {
                Profile(
                    onBack = {
                        selectedDrawerItem = "Home"
                        navController.navigateUp()
                    }
                )
            }
            composable(route = Screen.StorageDetail.route) {
                StorageDetail(
                    onBack = {
                        selectedDrawerItem = "Home"
                        navController.navigateUp()
                    }
                )
            }
            composable(route = Screen.Settings.route) {
                Settings(
                    onBack = {
                        setDefaultDrawerItem(selectedDrawerItem, navController)
                    }
                )
            }
        }
    }
}

private fun setDefaultDrawerItem(
    selectedDrawerItem: String,
    navController: NavHostController
) {
    var selectedDrawerItem1 = selectedDrawerItem
    selectedDrawerItem1 = "Home"
    navController.navigateUp()
}