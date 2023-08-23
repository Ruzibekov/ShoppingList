package uz.ruzibekov.shopping_list.ui.screens.product.create.state

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class CreateProductState(
    val name: MutableState<String> = mutableStateOf(""),
    var shoppingListId: Long? = null
)