package dev.vengateshm.dribbox.presentation.storageDetail

import androidx.compose.ui.graphics.Color
import dev.vengateshm.dribbox.ui.theme.*

data class StorageItem(
    val name: String,
    val occupiedSize: String,
    val color: Color? = null,
    val occupiedSizeInBytes: Int? = null,
    val progress: Float = 0.0f,
) {
    companion object {
        fun getStorageItems(): List<StorageItem> {
            return listOf(
                StorageItem("Design Files", "38.66GB", StorageItemColor1, progress = 70f),
                StorageItem("Images", "24.80GB", StorageItemColor2, progress = 60f),
                StorageItem("Video", "12.60GB", StorageItemColor3, progress = 20f),
                StorageItem("Documents", "06.57GB", StorageItemColor4, progress = 13.50f),
                StorageItem("Others", "2.01GB", StorageItemColor5, progress = 6.3f)
            )
        }
    }
}
