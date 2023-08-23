package uz.ruzibekov.shopping_list.ui.screens.shopping_list.create

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import uz.ruzibekov.shopping_list.data.dao.ShoppingListDao
import uz.ruzibekov.shopping_list.data.model.ShoppingListEntity
import uz.ruzibekov.shopping_list.ui.screens.shopping_list.create.state.CreateListState
import javax.inject.Inject

@HiltViewModel
class CreateListViewModel @Inject constructor(
    private val shoppingListDao: ShoppingListDao
) : ViewModel() {

    val state = CreateListState()

    private val scope = CoroutineScope(Dispatchers.IO)

    fun createNewList() = scope.launch {
        if (state.name.value.isNotEmpty()) {

            val entity = ShoppingListEntity(name = state.name.value)
            shoppingListDao.createList(entity)
        }
    }
}
