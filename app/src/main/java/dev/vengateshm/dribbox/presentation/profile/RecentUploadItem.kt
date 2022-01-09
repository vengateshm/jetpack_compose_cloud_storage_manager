package dev.vengateshm.dribbox.presentation.profile

data class RecentUploadItem(val name: String, val date: String, val size: String) {
    companion object {
        fun getRecentUploadList(): List<RecentUploadItem> {
            return listOf(
                RecentUploadItem("Projects.docx", "Nov 20, 2021", "300kb")
            )
        }
    }
}
