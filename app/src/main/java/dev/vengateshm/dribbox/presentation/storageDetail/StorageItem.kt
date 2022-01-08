package dev.vengateshm.dribbox.presentation.storageDetail

import androidx.compose.ui.graphics.Color
import dev.vengateshm.dribbox.ui.theme.*

data class StorageItem(
    val name: String,
    val occupiedSize: String,
    val color: Color? = null,
    val occupiedSizeInBytes: Int? = null
) {
    companion object {
        fun getStorageItems(): List<StorageItem> {
            return listOf(
                StorageItem("Design Files", "38.66GB", StorageItemColor1),
                StorageItem("Images", "24.80GB", StorageItemColor2),
                StorageItem("Video", "12.60GB", StorageItemColor3),
                StorageItem("Documents", "06.57GB", StorageItemColor4),
                StorageItem("Others", "2.01GB", StorageItemColor5)
            )
        }
    }
}
