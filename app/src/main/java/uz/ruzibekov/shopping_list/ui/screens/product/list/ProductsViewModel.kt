package uz.ruzibekov.shopping_list.ui.screens.product.list

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import uz.ruzibekov.shopping_list.data.dao.ProductDao
import uz.ruzibekov.shopping_list.ui.screens.product.list.state.ProductsState
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val dao: ProductDao
) : ViewModel() {

    val state = ProductsState()

    private val scope = CoroutineScope(Dispatchers.IO)

    fun fetch() = scope.launch {

        state.selectedList?.let { data ->

            val products = dao.getProductsByListId(data.id)

            state.products.clear()
            state.products.addAll(products)
        }
    }

    fun removeProductById(id: Long) = scope.launch {
        dao.removeProductById(id)
        state.products.removeIf { it.id == id }
    }
}