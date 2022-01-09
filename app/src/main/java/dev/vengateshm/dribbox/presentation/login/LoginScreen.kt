package dev.vengateshm.dribbox.presentation.login

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import dev.vengateshm.dribbox.R
import dev.vengateshm.dribbox.Screen
import dev.vengateshm.dribbox.ui.theme.TextColor2

@Composable
fun LoginScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Login background image
        Image(
            painter = painterResource(id = R.drawable.login_bg),
            contentDescription = "Login Background Image",
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 96.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.login_image),
                    contentDescription = "Login Background Image",
                    modifier = Modifier
                        .size(
                            width = 180.dp,
                            height = 180.dp
                        )
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color(0XFF22215B),
                            fontSize = 20.sp,
                            fontWeight = FontWeight(300)
                        )
                    ) {
                        append("Welcome to")
                    }

                    append("\n")

                    withStyle(
                        style = SpanStyle(
                            color = Color(0XFF22215B),
                            fontSize = 38.sp,
                            fontWeight = FontWeight(700)
                        )
                    ) {
                        append("Dribbox")
                    }

                    append("\n")
                    append("\n")

                    withStyle(
                        style = SpanStyle(
                            color = Color(0XFF7B7F9E),
                            fontSize = 14.sp,
                            fontWeight = FontWeight(500)
                        )
                    ) {
                        append("Best cloud storage platform for all")
                        append("\n")
                        append("business and individuals to")
                        append("\n")
                        append("manage their data")
                        append("\n")
                        append("\n")
                        append("Join For Free.")
                    }
                })

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 32.dp),
                    horizontalArrangement = Arrangement.spacedBy(
                        24.dp,
                        alignment = Alignment.CenterHorizontally
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .background(
                                color = Color(0X16567DF4),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(
                                horizontal = 16.dp,
                                vertical = 8.dp
                            )
                            .clickable {
                                navController.navigate(Screen.Home.route)
                            },
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_finger_print),
                            contentDescription = "Fingerprint icon",
                            tint = Color(0XFF567DF4)
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Text(
                            text = "Smart Id",
                            color = Color(0XFF567DF4)
                        )
                    }

                    Row(
                        modifier = Modifier
                            .background(
                                color = Color(0XFF567DF4),
                                shape = RoundedCornerShape(10.dp)
                            )
                            .padding(
                                horizontal = 16.dp,
                                vertical = 8.dp
                            )
                            .clickable {
                                navController.navigate(Screen.Home.route)
                            },
                        verticalAlignment = Alignment.CenterVertically,
                    ) {
                        Text(
                            text = "Sign In",
                            color = Color.White
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.ic_arrow_right),
                            contentDescription = "Right arrow icon",
                            tint = Color.White
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.weight(1f))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Use Social Login",
                    color = TextColor2,
                    fontSize = 12.sp,
                    fontWeight = FontWeight(400)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                            top = 16.dp,
                            bottom = 32.dp
                        ),
                    horizontalArrangement = Arrangement.spacedBy(
                        24.dp,
                        alignment = Alignment.CenterHorizontally
                    )
                ) {
                    IconButton(
                        onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_instagram_logo),
                            contentDescription = "Instagram Logo"
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ }) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_twitter_logo),
                            contentDescription = "Twitter Logo"
                        )
                    }
                    IconButton(
                        onClick = { /*TODO*/ }) {
                        Icon(
                            modifier = Modifier.height(24.dp),
                            painter = painterResource(id = R.drawable.ic_facebook_logo),
                            contentDescription = "Facebook Logo"
                        )
                    }
                }
                Text(
                    text = "Create an account",
                    color = TextColor2,
                    fontSize = 16.sp,
                    fontWeight = FontWeight(400)
                )
            }
        }
    }
}