package dev.vengateshm.dribbox.presentation.home

import androidx.compose.ui.graphics.Color
import dev.vengateshm.dribbox.R
import dev.vengateshm.dribbox.ui.theme.*

data class Folder(
    val name: String,
    val date: String,
    val textColor: Color? = null,
    val backgroundColor: Color? = null,
    val folderIconRes: Int? = null
) {
    companion object {
        fun getFoldersList(): List<Folder> {
            return listOf(
                Folder(
                    "Mobile Apps",
                    "Dec 20, 2021",
                    FolderTextBlue,
                    FolderBgBlue,
                    R.drawable.ic_folder_blue
                ),
                Folder(
                    "SVG icons",
                    "Dec 14, 2021",
                    FolderTextYellow,
                    FolderBgYellow,
                    R.drawable.ic_folder_yellow
                ),
                Folder(
                    "Prototypes",
                    "Nov 22, 2021",
                    FolderTextRed,
                    FolderBgRed,
                    R.drawable.ic_folder_red
                ),
                Folder(
                    "Avatar",
                    "Nov 10, 2021",
                    FolderTextGreen,
                    FolderBgGreen,
                    R.drawable.ic_folder_green
                ),
                Folder(
                    "Design",
                    "Oct 20, 2021",
                    FolderTextBlue,
                    FolderBgBlue,
                    R.drawable.ic_folder_blue
                ),
                Folder(
                    "Portfolio",
                    "Oct 18, 2021",
                    FolderTextYellow,
                    FolderBgYellow,
                    R.drawable.ic_folder_yellow
                ),
                Folder(
                    "References",
                    "Oct 16, 2021",
                    FolderTextRed,
                    FolderBgRed,
                    R.drawable.ic_folder_red
                ),
                Folder(
                    "Clients",
                    "Oct 02, 2021",
                    FolderTextGreen,
                    FolderBgGreen,
                    R.drawable.ic_folder_green
                ),
                Folder(
                    "Mobile Apps",
                    "Dec 20, 2021",
                    FolderTextBlue,
                    FolderBgBlue,
                    R.drawable.ic_folder_blue
                ),
                Folder(
                    "SVG icons",
                    "Dec 14, 2021",
                    FolderTextYellow,
                    FolderBgYellow,
                    R.drawable.ic_folder_yellow
                ),
                Folder(
                    "Prototypes",
                    "Nov 22, 2021",
                    FolderTextRed,
                    FolderBgRed,
                    R.drawable.ic_folder_red
                ),
                Folder(
                    "Avatar",
                    "Nov 10, 2021",
                    FolderTextGreen,
                    FolderBgGreen,
                    R.drawable.ic_folder_green
                ),
                Folder(
                    "Design",
                    "Oct 20, 2021",
                    FolderTextBlue,
                    FolderBgBlue,
                    R.drawable.ic_folder_blue
                ),
                Folder(
                    "Portfolio",
                    "Oct 18, 2021",
                    FolderTextYellow,
                    FolderBgYellow,
                    R.drawable.ic_folder_yellow
                ),
                Folder(
                    "References",
                    "Oct 16, 2021",
                    FolderTextRed,
                    FolderBgRed,
                    R.drawable.ic_folder_red
                ),
                Folder(
                    "Clients",
                    "Oct 02, 2021",
                    FolderTextGreen,
                    FolderBgGreen,
                    R.drawable.ic_folder_green
                )
            )
        }
    }
}
