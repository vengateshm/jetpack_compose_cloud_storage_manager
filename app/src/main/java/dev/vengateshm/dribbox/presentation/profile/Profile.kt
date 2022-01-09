package dev.vengateshm.dribbox.presentation.profile

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vengateshm.dribbox.R
import dev.vengateshm.dribbox.presentation.home.Folder
import dev.vengateshm.dribbox.presentation.home.components.FolderItem
import dev.vengateshm.dribbox.ui.theme.ProfileAvatarDetailBgColor
import dev.vengateshm.dribbox.ui.theme.TextColor1

@ExperimentalFoundationApi
@Composable
fun Profile(onBack: () -> Unit) {
    BackHandler(onBack = onBack)
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Header(onBack = onBack)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(
                    enabled = true,
                    state = rememberScrollState()
                )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = ProfileAvatarDetailBgColor,
                            shape = RoundedCornerShape(20.dp)
                        )
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth(),
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_avatar),
                            contentDescription = "Profile avatar",
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape)
                                .align(Alignment.TopCenter),
                        )
                        Text(
                            text = "PRO",
                            color = Color.White,
                            fontSize = 10.sp,
                            fontWeight = FontWeight(500),
                            modifier = Modifier
                                .background(
                                    color = Color(0XFFFF317B),
                                    shape = RoundedCornerShape(8.dp)
                                )
                                .padding(
                                    horizontal = 8.dp,
                                    vertical = 4.dp
                                )
                                .align(Alignment.TopEnd),
                        )
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Vengatesh M",
                        color = Color.White,
                        fontSize = 18.sp,
                        fontWeight = FontWeight(700)
                    )
                    Text(
                        text = "Android Developer",
                        color = Color.White,
                        fontSize = 13.sp,
                        fontWeight = FontWeight(400)
                    )
                    Text(
                        text = "6+ years of hands on experience in mobile app development",
                        color = Color(0X96FFFFFF),
                        fontSize = 13.sp,
                        fontWeight = FontWeight(400),
                        textAlign = TextAlign.Center
                    )
                }
            }
            FolderOptions()
            MyFolders(Folder.getFoldersList().subList(0, 4))
            RecentUploads()
        }
    }
}

@Composable
fun Header(onBack: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = onBack
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_back_arrow),
                contentDescription = "Back arrow icon"
            )
        }

        Text(
            text = "My Profile",
            color = TextColor1,
            fontSize = 16.sp,
            fontWeight = FontWeight(600),
            modifier = Modifier
                .weight(1f)
        )

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_more_option_hori),
                contentDescription = "More icon horizontal"
            )
        }
    }
}

@Composable
fun FolderOptions() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "My Folders",
            color = TextColor1,
            fontSize = 15.sp,
            fontWeight = FontWeight(600)
        )

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_filter_arrow_down),
                contentDescription = "Filter arrow down icon"
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_add),
                contentDescription = "Add icon",
                modifier = Modifier.size(16.dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_settings),
                contentDescription = "Settings icon",
                modifier = Modifier.size(16.dp)
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_arrow_head_right),
                contentDescription = "Arrow right icon",
                modifier = Modifier.size(16.dp)
            )
        }
    }
}

@Composable
fun MyFolders(folderList: List<Folder>) {
    Row {
        FolderItem(modifier = Modifier.weight(0.5f), folder = folderList[0])
        FolderItem(modifier = Modifier.weight(0.5f), folder = folderList[1])
    }
    Row {
        FolderItem(modifier = Modifier.weight(1f), folder = folderList[2])
        FolderItem(modifier = Modifier.weight(1f), folder = folderList[3])
    }
}

@Composable
fun RecentUploads() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Recent Uploads",
            color = TextColor1,
            fontSize = 15.sp,
            fontWeight = FontWeight(600)
        )

        Spacer(modifier = Modifier.weight(1f))

        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_sort),
                contentDescription = "Arrow right icon"
            )
        }
    }

    val recentUploads = RecentUploadItem.getRecentUploadList()
    recentUploads.forEach { recentUploadItem ->
        RecentUploadComposable(recentUploadItem)
    }
}

@Composable
fun RecentUploadComposable(recentUploadItem: RecentUploadItem) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_word_doc),
            contentDescription = "Recent upload thumb"
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = recentUploadItem.name,
                fontSize = 15.sp,
                fontWeight = FontWeight(500),
                color = TextColor1
            )
            Text(
                text = recentUploadItem.date,
                fontSize = 11.sp,
                fontWeight = FontWeight(400),
                color = TextColor1
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = recentUploadItem.size,
            fontSize = 11.sp,
            fontWeight = FontWeight(400),
            color = TextColor1
        )
    }
}