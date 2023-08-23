package uz.ruzibekov.shopping_list.ui.screens.main._component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import uz.ruzibekov.shopping_list.R
import uz.ruzibekov.shopping_list.ui.theme.AppColor

object ShoppingListEmptyView {

    @Composable
    fun Default() {

        Text(
            text = stringResource(id = R.string.is_empty_list),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = AppColor.Gray
        )
    }
}