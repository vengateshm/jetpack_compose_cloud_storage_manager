package dev.vengateshm.dribbox.presentation.settings

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.IconToggleButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vengateshm.dribbox.R
import dev.vengateshm.dribbox.ui.theme.TextColor2
import dev.vengateshm.dribbox.ui.theme.ToggleSwitchColor

@Composable
fun Settings(
    onBack: () -> Unit,
    onItemClick: (String) -> Unit,
) {
    BackHandler(onBack = onBack)
    Column(modifier = Modifier.fillMaxSize()) {
        IconButton(
            onClick = onBack
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_back_arrow),
                contentDescription = "Back arrow icon"
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Settings",
            color = TextColor2,
            fontSize = 30.sp,
            fontWeight = FontWeight(700),
            modifier = Modifier
                .padding(start = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        val settingsItemList = SettingsItem.getSettingsList()
        settingsItemList.forEach { settingsItem ->
            Text(
                text = settingsItem.name,
                fontSize = 16.sp,
                fontWeight = FontWeight(500),
                color = TextColor2,
                modifier = Modifier
                    .clickable { onItemClick(settingsItem.name) }
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp)
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        CheckBoxSetting(name = "Enable Sync", true)
        CheckBoxSetting(name = "Enable 2 Step Verification", false)
    }
}

@Composable
fun CheckBoxSetting(name: String, isChecked: Boolean) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 16.dp,
                vertical = 8.dp
            ),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = name,
            fontSize = 16.sp,
            fontWeight = FontWeight(700),
            color = TextColor2
        )
        IconToggleButton(checked = isChecked, onCheckedChange = {}) {
            Icon(
                painter = painterResource(id = if (isChecked) R.drawable.ic_baseline_toggle_on_24 else R.drawable.ic_baseline_toggle_off_24),
                contentDescription = null,
                tint = ToggleSwitchColor
            )
        }
    }
}