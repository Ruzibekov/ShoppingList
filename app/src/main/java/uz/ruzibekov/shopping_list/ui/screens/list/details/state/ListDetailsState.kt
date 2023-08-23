package uz.ruzibekov.shopping_list.ui.screens.list.details.state

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import uz.ruzibekov.shopping_list.data.model.ProductEntity

data class ListDetailsState (
    val products: SnapshotStateList<ProductEntity> = mutableStateListOf()
) {
    var selectedListId: Long = 0
}