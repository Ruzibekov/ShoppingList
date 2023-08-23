package uz.ruzibekov.shopping_list.ui.screens.main

import android.content.Intent
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import dagger.hilt.android.AndroidEntryPoint
import uz.ruzibekov.shopping_list.ui.screens.base.BaseActivity
import uz.ruzibekov.shopping_list.ui.screens.list.create.CreateListActivity
import uz.ruzibekov.shopping_list.ui.screens.main._content.MainContentView
import uz.ruzibekov.shopping_list.ui.screens.main.listeners.MainListeners

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
        val intent = Intent(this, CreateListActivity::class.java)
        startActivity(intent)
    }

}