package uz.ruzibekov.shopping_list.ui.screens.product.create

import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import dagger.hilt.android.AndroidEntryPoint
import uz.ruzibekov.shopping_list.ui.screens.base.BaseActivity
import uz.ruzibekov.shopping_list.ui.screens.product.create._content.CreateProductContentView
import uz.ruzibekov.shopping_list.ui.screens.product.create.listeners.CreateProductListeners
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
        val id = intent.getLongExtra(ExtraConstants.EXTRA_SHOPPING_LIST, -1L)

        if (id != -1L)
            viewModel.state.shoppingListId = id
    }

    override fun createProduct() {
        viewModel.createProduct()
        finish()
    }
}