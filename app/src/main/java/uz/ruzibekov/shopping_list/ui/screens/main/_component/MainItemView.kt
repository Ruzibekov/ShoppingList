package uz.ruzibekov.shopping_list.ui.screens.main._component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ruzibekov.shopping_list.R
import uz.ruzibekov.shopping_list.data.model.ShoppingListEntity
import uz.ruzibekov.shopping_list.ui.theme.AppColor

object MainItemView {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun Default(data: ShoppingListEntity, onClick: (ShoppingListEntity) -> Unit) {

        Card(
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.padding(bottom = 12.dp, start = 16.dp, end = 16.dp),
            colors = CardDefaults.cardColors(containerColor = AppColor.Light),
            onClick = { onClick(data) }
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 14.dp, horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Card(
                    shape = CircleShape,
                    colors = CardDefaults.cardColors(containerColor = AppColor.Green)
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_foreground),
                        contentDescription = "item icon",
                        modifier = Modifier
                            .padding(all = 4.dp)
                            .size(24.dp)
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Text(
                    text = data.name,
                    fontSize = 17.sp,
                    color = AppColor.Black,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}