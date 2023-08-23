package uz.ruzibekov.shopping_list.ui.screens.product.create._content

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ruzibekov.shopping_list.R
import uz.ruzibekov.shopping_list.ui.screens.product.create.listeners.CreateProductListeners
import uz.ruzibekov.shopping_list.ui.screens.product.create.state.CreateProductState
import uz.ruzibekov.shopping_list.ui.theme.AppColor

object CreateProductContentView {

    @Composable
    fun Default(state: CreateProductState, listeners: CreateProductListeners) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .padding(top = 11.dp)
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = stringResource(id = R.string.cancel),
                    fontSize = 17.sp,
                    color = AppColor.Blue,
                    fontWeight = FontWeight.Normal
                )

                Text(
                    text = stringResource(id = R.string.add),
                    modifier = Modifier
                        .clip(RoundedCornerShape(10.dp))
                        .clickable { listeners.createProduct() }
                        .padding(5.dp),
                    fontSize = 17.sp,
                    color = AppColor.Blue,
                    fontWeight = FontWeight.Normal
                )
            }

            Spacer(modifier = Modifier.height(11.dp))

            Text(
                text = stringResource(id = R.string.add_product),
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                color = AppColor.Black
            )

            Spacer(modifier = Modifier.height(11.dp))

            BasicTextField(
                value = state.name.value,
                onValueChange = {
                    if (it.length < 25)
                        state.name.value = it
                },
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp,
                    color = AppColor.Black
                ),
                maxLines = 1,
                keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done)
            )

            Spacer(modifier = Modifier.height(11.dp))

            Divider()
        }
    }
}