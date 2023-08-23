package uz.ruzibekov.shopping_list.ui.screens.product.list

import android.content.Intent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import com.google.gson.Gson
import dagger.hilt.android.AndroidEntryPoint
import uz.ruzibekov.shopping_list.data.model.ShoppingListEntity
import uz.ruzibekov.shopping_list.ui.screens.base.BaseActivity
import uz.ruzibekov.shopping_list.ui.screens.product.create.CreateProductActivity
import uz.ruzibekov.shopping_list.ui.screens.product.list._content.ProductsContentView
import uz.ruzibekov.shopping_list.ui.screens.product.list.listeners.ProductsListeners
import uz.ruzibekov.shopping_list.utils.ExtraConstants

@AndroidEntryPoint
class ProductsActivity : BaseActivity(), ProductsListeners {

    private val viewModel: ProductsViewModel by viewModels()

    override val content: @Composable () -> Unit = {

        ProductsContentView.Default(
            state = viewModel.state,
            listeners = this
        )
    }

    override fun initialize() {
        val json = intent.getStringExtra(ExtraConstants.EXTRA_SHOPPING_LIST)
        val entity = Gson().fromJson(json, ShoppingListEntity::class.java)
        viewModel.state.selectedList = entity
    }

    override fun onStart() {
        super.onStart()

        viewModel.fetch()
    }

    override fun backStack() {
        finish()
    }

    override fun openCreateProductScreen() {
        val intent = Intent(this, CreateProductActivity::class.java)
        intent.putExtra(ExtraConstants.EXTRA_SHOPPING_LIST, viewModel.state.selectedList?.id)
        startActivity(intent)
    }
}