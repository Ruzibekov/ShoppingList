package uz.ruzibekov.shopping_list.ui.screens.product.list._content

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import uz.ruzibekov.shopping_list.ui.screens.product.list._components.ProductsListEmptyView
import uz.ruzibekov.shopping_list.ui.screens.product.list._components.ProductsListView
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

            Box(
                modifier = Modifier.fillMaxSize().padding(paddingValues),
                contentAlignment = Alignment.Center
            ) {

                when {

                    state.products.isNotEmpty() -> ProductsListView.Default(state)

                    else -> ProductsListEmptyView.Default()
                }
            }
        }
    }
}