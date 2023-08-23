package uz.ruzibekov.shopping_list.ui.screens.main.listeners

import uz.ruzibekov.shopping_list.data.model.ShoppingListEntity

interface MainListeners {

    fun openCreateListScreen()

    fun openListDetailsScreen(entity: ShoppingListEntity)
}