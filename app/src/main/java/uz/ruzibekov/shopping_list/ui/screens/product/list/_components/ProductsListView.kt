package uz.ruzibekov.shopping_list.ui.screens.product.list._components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uz.ruzibekov.shopping_list.ui.screens.product.list.listeners.ProductsListeners
import uz.ruzibekov.shopping_list.ui.screens.product.list.state.ProductsState

object ProductsListView {

    @Composable
    fun Default(state: ProductsState, listeners: ProductsListeners) {

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(top = 8.dp)
        ) {

            items(state.products) { data ->
                ProductItemView.Default(data){
                    listeners.removeProduct(data.id)
                }
            }
        }
    }
}