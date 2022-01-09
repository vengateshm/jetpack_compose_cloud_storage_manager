package dev.vengateshm.dribbox.presentation.storageDetail

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
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
import dev.vengateshm.dribbox.ui.theme.TextColor1

@Composable
fun StorageDetail(onBack: () -> Unit) {
    BackHandler(onBack = onBack)
    Column(modifier = Modifier.fillMaxSize()) {
        StorageHeader(
            onBack = onBack
        )
        StorageChart()
        Spacer(modifier = Modifier.height(16.dp))
        StorageList(StorageItem.getStorageItems())
    }
}

@Composable
fun StorageHeader(onBack: () -> Unit) {
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
            text = "Storage Details",
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
fun StorageChart() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_pie_chart),
            contentDescription = "Pie chart"
        )
        Text(
            text = "Available",
            color = TextColor1,
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
        )
        Text(
            text = "43.36 GB",
            color = TextColor1,
            fontSize = 24.sp,
            fontWeight = FontWeight(700),
        )
        Text(
            text = "Total 128 GB",
            color = TextColor1,
            fontSize = 20.sp,
            fontWeight = FontWeight(400),
        )
    }
}

@Composable
fun StorageList(storageItems: List<StorageItem>) {
    LazyColumn(contentPadding = PaddingValues(16.dp)) {
        items(storageItems) { storageItem ->
            StorageItem(storageItem)
        }
    }
}

@Composable
fun StorageItem(storageItem: StorageItem) {
    Row(verticalAlignment = Alignment.Top) {
        Box(
            modifier = Modifier
                .size(10.dp)
                .background(color = storageItem.color!!, shape = RoundedCornerShape(10.dp))
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = storageItem.name,
                fontSize = 18.sp,
                fontWeight = FontWeight(500),
                color = TextColor1
            )
            Text(
                text = storageItem.occupiedSize,
                fontSize = 12.sp,
                fontWeight = FontWeight(500),
                color = TextColor1
            )
        }
    }
}