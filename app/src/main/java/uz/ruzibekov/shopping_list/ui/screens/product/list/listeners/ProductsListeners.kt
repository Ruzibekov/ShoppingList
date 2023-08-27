package uz.ruzibekov.shopping_list.ui.screens.product.list.listeners

interface ProductsListeners {

    fun backStack()

    fun openCreateProductScreen()

    fun removeProduct(id: Long)

}