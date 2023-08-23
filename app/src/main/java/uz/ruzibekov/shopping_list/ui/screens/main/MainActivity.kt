package uz.ruzibekov.shopping_list.ui.screens.main

import androidx.compose.runtime.Composable
import uz.ruzibekov.shopping_list.ui.screens.base.BaseActivity
import uz.ruzibekov.shopping_list.ui.screens.main._content.MainContentView

class MainActivity : BaseActivity() {

    override val content: @Composable () -> Unit = {
        MainContentView.Default()
    }

    override fun initialize() {}


}