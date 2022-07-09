package dev.vengateshm.dribbox.presentation.settings

data class SettingsItem(val name: String) {
    companion object {
        fun getSettingsList(): List<SettingsItem> {
            return listOf(
                SettingsItem("Add Account"),
                SettingsItem("Change Password"),
                SettingsItem("Change Language"),
                SettingsItem("Upgrade Plan"),
                SettingsItem("Multiple Account")
            )
        }
    }
}
