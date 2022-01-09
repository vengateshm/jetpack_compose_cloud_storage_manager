package dev.vengateshm.dribbox.presentation.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.vengateshm.dribbox.R
import dev.vengateshm.dribbox.presentation.home.DrawerItem

@Composable
fun Drawer(
    selectedDrawerItem: String,
    drawerMenuList: List<DrawerItem>,
    onDrawerItemClick: (DrawerItem) -> Unit,
    closeDrawer: () -> Unit,
    onLogoutClick: () -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(
                            topStart = 0.dp,
                            topEnd = 0.dp,
                            bottomStart = 0.dp,
                            bottomEnd = 50.dp
                        )
                    )
                    .padding(24.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_avatar),
                    contentDescription = "Profile avatar",
                    Modifier
                        .size(48.dp)
                        .clip(RoundedCornerShape(percent = 50))
                )

                Spacer(modifier = Modifier.width(16.dp))

                Column {
                    Text(
                        text = "Vengatesh M",
                        fontSize = 16.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0XFF1B1D28)
                    )
                    Text(
                        text = "Seattle, Washington",
                        fontSize = 10.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0XFF7B7F9E)
                    )
                }
            }

            IconButton(
                onClick = closeDrawer,
                modifier = Modifier
                    .size(24.dp)
                    .padding(top = 8.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_drawer_close),
                    contentDescription = "Drawer close",
                )
            }
        }

        Spacer(modifier = Modifier.height(32.dp))

        drawerMenuList.forEach { drawerItem ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {
                        onDrawerItemClick(drawerItem)
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Box(
                    modifier = Modifier
                        .width(8.dp)
                        .height(32.dp)
                        .background(
                            color = if (drawerItem.title == selectedDrawerItem) Color(0XFF567DF4) else Color(
                                0XFFFFFFFF
                            )
                        )
                )
                Spacer(modifier = Modifier.width(24.dp))
                Text(
                    text = drawerItem.title,
                    fontSize = 16.sp,
                    fontWeight = if (drawerItem.title == selectedDrawerItem) FontWeight(700) else FontWeight(
                        500
                    ),
                    color = Color(0XFF1B1D28)
                )
            }
            Spacer(modifier = Modifier.height(8.dp))
        }

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .padding(
                    horizontal = 16.dp,
                    vertical = 8.dp
                )
                .clickable {
                    onLogoutClick()
                },
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_logout),
                contentDescription = "Logout icon",
                tint = Color(0XFF1B1D28),
                modifier = Modifier.size(18.dp)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text = "Logout",
                color = Color(0XFF1B1D28)
            )
        }

        Spacer(modifier = Modifier.height(64.dp))

        Text(
            text = "Version 2.0.1",
            fontSize = 10.sp,
            fontWeight = FontWeight(700),
            color = Color(0XFF3A4276),
            modifier = Modifier.padding(start = 16.dp)
        )

        Spacer(modifier = Modifier.height(32.dp))
    }
}