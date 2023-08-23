package uz.ruzibekov.shopping_list.ui.screens.list.details

import android.content.Intent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import dagger.hilt.android.AndroidEntryPoint
import uz.ruzibekov.shopping_list.ui.screens.base.BaseActivity
import uz.ruzibekov.shopping_list.ui.screens.list.details._content.ListDetailsContentView
import uz.ruzibekov.shopping_list.ui.screens.list.details.listeners.ListDetailsListeners
import uz.ruzibekov.shopping_list.ui.screens.product.CreateProductActivity
import uz.ruzibekov.shopping_list.utils.ExtraConstants

@AndroidEntryPoint
class ListDetailsActivity : BaseActivity(), ListDetailsListeners {

    private val viewModel: ListDetailsViewModel by viewModels()

    override val content: @Composable () -> Unit = {

        ListDetailsContentView.Default(
            state = viewModel.state,
            listeners = this
        )
    }

    override fun initialize() {
        val id = intent.getLongExtra(ExtraConstants.EXTRA_ID, 0L)
        viewModel.state.selectedListId = id
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
        intent.putExtra(ExtraConstants.EXTRA_ID, viewModel.state.selectedListId)
        startActivity(intent)
    }
}