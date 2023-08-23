package uz.ruzibekov.shopping_list.ui.screens.list.details._content

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import uz.ruzibekov.shopping_list.ui.screens.list.details._components.ListDetailsItemView
import uz.ruzibekov.shopping_list.ui.screens.list.details._components.ListDetailsTopBarView
import uz.ruzibekov.shopping_list.ui.screens.list.details.listeners.ListDetailsListeners
import uz.ruzibekov.shopping_list.ui.screens.list.details.state.ListDetailsState
import uz.ruzibekov.shopping_list.ui.theme.AppIcon

object ListDetailsContentView {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Default(
        state: ListDetailsState,
        listeners: ListDetailsListeners
    ) {

        Scaffold(
            topBar = {
                ListDetailsTopBarView.Default(listeners)
            },
            floatingActionButton = {
                FloatingActionButton(
                    onClick = { listeners.openCreateProductScreen() }
                ) {

                    Icon(
                        painter = painterResource(id = AppIcon.Plus),
                        contentDescription = "plus icon"
                    )
                }
            }
        ) { paddingValues ->

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentPadding = PaddingValues(top = 8.dp)
            ) {

                items(state.products) { data ->
                    ListDetailsItemView.Default()
                }
            }
        }
    }
}