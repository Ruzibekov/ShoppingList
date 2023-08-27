package uz.ruzibekov.shopping_list.ui.screens.product.list._components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import uz.ruzibekov.shopping_list.data.model.ProductEntity
import uz.ruzibekov.shopping_list.ui.theme.AppColor

object ProductItemView {

    @Composable
    fun Default(entity: ProductEntity, onDone: () -> Unit) {

        Card(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(bottom = 8.dp),
            shape = RoundedCornerShape(8.dp),
            colors = CardDefaults.cardColors(containerColor = AppColor.Light)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = entity.name,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    color = AppColor.Black
                )

                var checked by remember { mutableStateOf(false) }

                Checkbox(
                    checked = checked,
                    onCheckedChange = {
                        checked = true
                        onDone()
                    }
                )
            }
        }
    }
}