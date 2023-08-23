package uz.ruzibekov.shopping_list.ui.screens.main._content

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uz.ruzibekov.shopping_list.ui.screens.main._component.MainItemView
import uz.ruzibekov.shopping_list.ui.screens.main._component.MainTopBarView
import uz.ruzibekov.shopping_list.ui.screens.main.listeners.MainListeners

object MainContentView {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Default(listeners: MainListeners) {
        Scaffold(
            topBar = {
                MainTopBarView.Default(listeners)
            }
        ) { paddingValues ->

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentPadding = PaddingValues(top = 8.dp)
            ) {

                items(5){
                    MainItemView.Default()
                }
            }
        }
    }
}