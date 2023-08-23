package uz.ruzibekov.shopping_list.ui.screens.main._component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import uz.ruzibekov.shopping_list.ui.screens.main.listeners.MainListeners
import uz.ruzibekov.shopping_list.ui.screens.main.state.MainState

object ShoppingListView {

    @Composable
    fun Default(state: MainState, listeners: MainListeners) {

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(top = 8.dp)
        ) {

            items(state.shoppingLists) { data ->
                MainItemView.Default(data) {
                    listeners.openListDetailsScreen(data)
                }
            }
        }
    }
}