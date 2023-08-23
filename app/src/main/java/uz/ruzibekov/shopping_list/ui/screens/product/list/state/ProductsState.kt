package uz.ruzibekov.shopping_list.ui.screens.product.list.state

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.snapshots.SnapshotStateList
import uz.ruzibekov.shopping_list.data.model.ProductEntity
import uz.ruzibekov.shopping_list.data.model.ShoppingListEntity

data class ProductsState (
    val products: SnapshotStateList<ProductEntity> = mutableStateListOf()
) {
    var selectedList: ShoppingListEntity? = null
}