package dev.vengateshm.dribbox.presentation.home

data class DrawerItem(val title: String, val isSelected: Boolean) {
    companion object {
        fun getDrawerMenuList(): List<DrawerItem> {
            return listOf(
                DrawerItem("Home", true),
                DrawerItem("Profile", false),
                DrawerItem("Storage", false),
                DrawerItem("Shared", false),
                DrawerItem("Stats", false),
                DrawerItem("Settings", false),
                DrawerItem("Help", false),
            )
        }
    }
}
