package uz.ruzibekov.shopping_list.ui.screens.list.create

import androidx.compose.runtime.Composable
import uz.ruzibekov.shopping_list.ui.screens.base.BaseActivity
import uz.ruzibekov.shopping_list.ui.screens.list.create._content.CreateListContentView

class CreateListActivity : BaseActivity() {


    override val content: @Composable () -> Unit = {
        CreateListContentView.Default()
    }

    override fun initialize() {

    }
}