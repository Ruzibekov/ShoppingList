package uz.ruzibekov.shopping_list.ui.screens.main._content

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import uz.ruzibekov.shopping_list.ui.screens.main._component.MainTopBarView
import uz.ruzibekov.shopping_list.ui.screens.main._component.ShoppingListEmptyView
import uz.ruzibekov.shopping_list.ui.screens.main._component.ShoppingListView
import uz.ruzibekov.shopping_list.ui.screens.main.listeners.MainListeners
import uz.ruzibekov.shopping_list.ui.screens.main.state.MainState
import uz.ruzibekov.shopping_list.ui.screens.product.list._components.ProductsListEmptyView
import uz.ruzibekov.shopping_list.ui.screens.product.list._components.ProductsListView

object MainContentView {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Default(
        state: MainState,
        listeners: MainListeners
    ) {
        Scaffold(
            topBar = {
                MainTopBarView.Default(listeners)
            }
        ) { paddingValues ->

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.Center
            ) {

                when {

                    state.shoppingLists.isNotEmpty() -> ShoppingListView.Default(state, listeners)

                    else -> ShoppingListEmptyView.Default()
                }
            }
        }
    }
}