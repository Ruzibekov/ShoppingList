package uz.ruzibekov.shopping_list.ui.screens.product

import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import dagger.hilt.android.AndroidEntryPoint
import uz.ruzibekov.shopping_list.ui.screens.base.BaseActivity
import uz.ruzibekov.shopping_list.ui.screens.product._content.CreateProductContentView
import uz.ruzibekov.shopping_list.ui.screens.product.listeners.CreateProductListeners
import uz.ruzibekov.shopping_list.utils.ExtraConstants

@AndroidEntryPoint
class CreateProductActivity : BaseActivity(), CreateProductListeners {

    private val viewModel: CreateProductViewModel by viewModels()

    override val content: @Composable () -> Unit = {

        CreateProductContentView.Default(
            state = viewModel.state,
            listeners = this
        )
    }

    override fun initialize() {
        val id = intent.getLongExtra(ExtraConstants.EXTRA_ID, -1L)

        if (id != -1L)
            viewModel.state.shoppingListId = id
    }

    override fun createProduct() {
        viewModel.createProduct()
        finish()
    }
}