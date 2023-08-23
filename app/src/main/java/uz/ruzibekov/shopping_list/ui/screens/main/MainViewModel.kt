package uz.ruzibekov.shopping_list.ui.screens.main

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import uz.ruzibekov.shopping_list.data.dao.ShoppingListDao
import uz.ruzibekov.shopping_list.ui.screens.main.state.MainState
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dao: ShoppingListDao
) : ViewModel() {

    val state = MainState()

    private val scope = CoroutineScope(Dispatchers.IO)

    fun fetch() = scope.launch {
        val list = dao.getAllShoppingList()
        state.shoppingLists.clear()
        state.shoppingLists.addAll(list)
    }
}