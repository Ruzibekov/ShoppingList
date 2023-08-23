package uz.ruzibekov.shopping_list.ui.screens.main.state

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import uz.ruzibekov.shopping_list.data.model.ShoppingListEntity

data class MainState(
    val shoppingLists: SnapshotStateList<ShoppingListEntity> = mutableStateListOf()
)