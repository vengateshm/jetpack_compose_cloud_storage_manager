package dev.vengateshm.dribbox.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import dev.vengateshm.dribbox.presentation.home.components.Drawer
import dev.vengateshm.dribbox.presentation.home.components.Home
import dev.vengateshm.dribbox.ui.theme.FabBgColor

@ExperimentalFoundationApi
@Composable
fun HomeScreen(navController: NavController) {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        drawerContent = {
            Drawer(
                coroutineScope,
                scaffoldState,
                navController,
                DrawerItem.getDrawerMenuList()
            )
        },
        drawerBackgroundColor = Color(0XFFF1F3F6),
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                backgroundColor = FabBgColor,
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "Fab add",
                    tint = Color.White
                )
            }
        }
    ) {
        Home(folderList = Folder.getFoldersList())
    }
}

