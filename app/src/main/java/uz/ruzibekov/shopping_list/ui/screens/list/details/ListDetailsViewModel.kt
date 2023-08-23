package uz.ruzibekov.shopping_list.ui.screens.list.details

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import uz.ruzibekov.shopping_list.data.dao.ProductDao
import uz.ruzibekov.shopping_list.ui.screens.list.details.state.ListDetailsState
import javax.inject.Inject

@HiltViewModel
class ListDetailsViewModel @Inject constructor(
    private val dao: ProductDao
) : ViewModel() {

    val state = ListDetailsState()

    private val scope = CoroutineScope(Dispatchers.IO)

    fun fetch() = scope.launch {
        val products = dao.getProductsByListId(state.selectedListId)

        state.products.clear()
        state.products.addAll(products)
    }
}