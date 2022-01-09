package dev.vengateshm.dribbox.presentation.home

data class DrawerItem(val title: String) {
    companion object {
        fun getDrawerMenuList(): List<DrawerItem> {
            return listOf(
                DrawerItem("Home"),
                DrawerItem("Profile"),
                DrawerItem("Storage"),
                DrawerItem("Settings"),
            )
        }
    }
}
