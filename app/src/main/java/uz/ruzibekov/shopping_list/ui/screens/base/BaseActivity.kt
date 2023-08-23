package uz.ruzibekov.shopping_list.ui.screens.base

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import uz.ruzibekov.shopping_list.ui.theme.ShoppingListTheme

abstract class BaseActivity : ComponentActivity() {

    abstract val content: @Composable () -> Unit

    abstract fun initialize()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ShoppingListTheme {
                content.invoke()
            }
        }

        initialize()
    }
}