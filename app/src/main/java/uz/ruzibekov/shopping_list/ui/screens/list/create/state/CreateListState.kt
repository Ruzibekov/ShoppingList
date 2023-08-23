package uz.ruzibekov.shopping_list.ui.screens.list.create.state

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class CreateListState(
    val name: MutableState<String> = mutableStateOf("")
)