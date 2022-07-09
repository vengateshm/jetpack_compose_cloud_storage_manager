package dev.vengateshm.dribbox.presentation.changePassword

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vengateshm.dribbox.R
import dev.vengateshm.dribbox.ui.theme.TextColor2

@Composable
fun ChangePassword(onBack: () -> Unit) {
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
            text = "Change Password",
            color = TextColor2,
            fontSize = 30.sp,
            fontWeight = FontWeight(700),
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)) {
            Text(modifier = Modifier
                .fillMaxWidth(), text = "Current Password")
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(modifier = Modifier
                .fillMaxWidth(), value = "", onValueChange = {})
            Spacer(modifier = Modifier.height(8.dp))
            Text(modifier = Modifier
                .fillMaxWidth(), text = "New Password")
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(modifier = Modifier
                .fillMaxWidth(), value = "", onValueChange = {})
            Spacer(modifier = Modifier.height(8.dp))
            Text(modifier = Modifier
                .fillMaxWidth(), text = "Confirm new Password")
            Spacer(modifier = Modifier.height(8.dp))
            OutlinedTextField(modifier = Modifier
                .fillMaxWidth(), value = "", onValueChange = {})
            Spacer(modifier = Modifier.height(32.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color(0XFF567DF4),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .padding(
                        horizontal = 16.dp,
                        vertical = 8.dp
                    )
                    .clickable {

                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Submit",
                    color = Color.White,
                )
            }
        }
    }
}