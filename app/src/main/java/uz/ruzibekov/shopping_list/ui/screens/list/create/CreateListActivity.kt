package uz.ruzibekov.shopping_list.ui.screens.list.create

import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import dagger.hilt.android.AndroidEntryPoint
import uz.ruzibekov.shopping_list.ui.screens.base.BaseActivity
import uz.ruzibekov.shopping_list.ui.screens.list.create._content.CreateListContentView
import uz.ruzibekov.shopping_list.ui.screens.list.create.listeners.CreateListListeners


@AndroidEntryPoint
class CreateListActivity : BaseActivity(), CreateListListeners {

    private val viewModel: CreateListViewModel by viewModels()

    override val content: @Composable () -> Unit = {
        CreateListContentView.Default(
            state = viewModel.state,
            listeners = this
        )
    }

    override fun initialize() {

    }

    override fun createNewList() {
        viewModel.createNewList()
        finish()
    }
}