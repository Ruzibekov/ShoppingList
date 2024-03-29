package uz.ruzibekov.shopping_list.ui.screens.main

import android.content.Intent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import uz.ruzibekov.shopping_list.data.model.ShoppingListEntity
import uz.ruzibekov.shopping_list.ui.screens.base.BaseActivity
import uz.ruzibekov.shopping_list.ui.screens.main._content.MainContentView
import uz.ruzibekov.shopping_list.ui.screens.main.listeners.MainListeners
import uz.ruzibekov.shopping_list.ui.screens.product.list.ProductsActivity
import uz.ruzibekov.shopping_list.ui.screens.shopping_list.create.CreateShoppingListActivity
import uz.ruzibekov.shopping_list.utils.ExtraConstants

@AndroidEntryPoint
class MainActivity : BaseActivity(), MainListeners {

    private val viewModel: MainViewModel by viewModels()

    override val content: @Composable () -> Unit = {
        MainContentView.Default(
            state = viewModel.state,
            listeners = this
        )
    }

    override fun initialize() {}

    override fun onStart() {
        super.onStart()

        viewModel.fetch()
    }

    override fun openCreateListScreen() {
        val intent = Intent(this, CreateShoppingListActivity::class.java)
        startActivity(intent)
    }

    override fun openListDetailsScreen(entity: ShoppingListEntity) {

        val intent = Intent(this, ProductsActivity::class.java)
        intent.putExtra(ExtraConstants.EXTRA_SHOPPING_LIST, Gson().toJson(entity))

        startActivity(intent)
    }

}