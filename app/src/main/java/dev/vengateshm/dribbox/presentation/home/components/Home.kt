package dev.vengateshm.dribbox.presentation.home.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
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
import dev.vengateshm.dribbox.presentation.home.Folder
import dev.vengateshm.dribbox.ui.theme.TextColor1

@ExperimentalFoundationApi
@Composable
fun Home(onHeaderMenuClick: () -> Unit) {
    val folderList by lazy {
        Folder.getFoldersList()
    }
    Column {
        Header(onHeaderMenuClick)
        SearchBar()
        Filter()
        FolderGrid(folderList)
    }
}

@Composable
fun Header(onHeaderMenuClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .padding(end = 8.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Your Dribbox",
            color = TextColor1,
            fontSize = 24.sp,
            fontWeight = FontWeight(600)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_header_icon),
            contentDescription = "Header icon",
            modifier = Modifier.clickable {
                onHeaderMenuClick()
            }
        )
    }
}

@Composable
fun SearchBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 1.dp, color = Color(0XFFEEF2FE),
                    shape = RoundedCornerShape(10.dp)
                )
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = "Search icon"
            )
            Spacer(modifier = Modifier.width(8.dp))
            Box {
                BasicTextField(
                    value = "", onValueChange = {},
                    singleLine = true,
                    modifier = Modifier
                        .fillMaxWidth()
                )
                Text(
                    text = "Search Folder",
                    fontWeight = FontWeight(500),
                    fontSize = 16.sp,
                    color = TextColor1
                )
            }
        }
    }
}

@Composable
fun Filter() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "Recent",
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
                painter = painterResource(id = R.drawable.ic_list_view),
                contentDescription = "List view icon"
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.ic_grid_view),
                contentDescription = "List view icon"
            )
        }
    }
}

@ExperimentalFoundationApi
@Composable
fun FolderGrid(folderList: List<Folder>) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(4.dp)
    ) {
        items(folderList) { folder ->
            FolderItem(folder = folder)
        }
    }
}

@Composable
fun FolderItem(modifier: Modifier = Modifier, folder: Folder) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = folder.backgroundColor!!,
                    shape = RoundedCornerShape(20.dp)
                )
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Image(
                    painter = painterResource(id = folder.folderIconRes!!),
                    contentDescription = "Folder image"
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = folder.name,
                    fontSize = 15.sp,
                    fontWeight = FontWeight(500),
                    color = folder.textColor!!
                )
                Text(
                    text = folder.date,
                    fontSize = 10.sp,
                    fontWeight = FontWeight(400),
                    color = folder.textColor
                )
            }

            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier.align(Alignment.Top)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_more_option),
                    contentDescription = "More icon",
                    tint = folder.textColor!!
                )
            }
        }
    }
}