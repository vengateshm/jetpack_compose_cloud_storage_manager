package dev.vengateshm.dribbox.presentation.home.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.vengateshm.dribbox.R
import dev.vengateshm.dribbox.presentation.home.Folder

@ExperimentalFoundationApi
@Composable
fun Home(folderList: List<Folder>) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
    ) {
        items(folderList) { folder ->
            FolderItem(folder = folder)
        }
    }
}

@Composable
fun FolderItem(folder: Folder) {
    Row(
        modifier = Modifier
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