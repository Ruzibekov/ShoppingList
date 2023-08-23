package uz.ruzibekov.shopping_list.ui.screens.product

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import uz.ruzibekov.shopping_list.data.dao.ProductDao
import uz.ruzibekov.shopping_list.data.model.ProductEntity
import uz.ruzibekov.shopping_list.ui.screens.product.state.CreateProductState
import javax.inject.Inject

@HiltViewModel
class CreateProductViewModel @Inject constructor(
    private val dao: ProductDao
) : ViewModel() {

    val state = CreateProductState()

    private val scope = CoroutineScope(Dispatchers.IO)

    fun createProduct() = scope.launch {

        state.shoppingListId?.let { id ->

            val entity = ProductEntity(
                name = state.name.value,
                shoppingListId = id
            )

            dao.createProduct(entity)
        }
    }
}