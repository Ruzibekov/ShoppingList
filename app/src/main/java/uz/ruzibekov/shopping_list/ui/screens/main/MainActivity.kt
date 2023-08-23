package uz.ruzibekov.shopping_list.ui.screens.main

import android.content.Intent
import androidx.compose.runtime.Composable
import uz.ruzibekov.shopping_list.ui.screens.base.BaseActivity
import uz.ruzibekov.shopping_list.ui.screens.list.create.CreateListActivity
import uz.ruzibekov.shopping_list.ui.screens.main._content.MainContentView
import uz.ruzibekov.shopping_list.ui.screens.main.listeners.MainListeners

class MainActivity : BaseActivity(), MainListeners {

    override val content: @Composable () -> Unit = {
        MainContentView.Default(this)
    }

    override fun initialize() {}

    override fun openCreateListScreen() {
        val intent = Intent(this, CreateListActivity::class.java)
        startActivity(intent)
    }

}