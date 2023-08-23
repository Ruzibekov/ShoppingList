package uz.ruzibekov.shopping_list.ui.screens.product.list._content

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uz.ruzibekov.shopping_list.ui.screens.product.list._components.ProductItemView
import uz.ruzibekov.shopping_list.ui.screens.product.list._components.ProductsTopBarView
import uz.ruzibekov.shopping_list.ui.screens.product.list.listeners.ProductsListeners
import uz.ruzibekov.shopping_list.ui.screens.product.list.state.ProductsState

object ProductsContentView {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Default(
        state: ProductsState,
        listeners: ProductsListeners
    ) {

        Scaffold(
            topBar = {
                ProductsTopBarView.Default(state = state, listeners = listeners)
            },
        ) { paddingValues ->

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentPadding = PaddingValues(top = 8.dp)
            ) {

                items(state.products) { data ->
                    ProductItemView.Default(data)
                }
            }
        }
    }
}