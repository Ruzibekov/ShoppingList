package uz.ruzibekov.shopping_list.ui.screens.list.create._content

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ruzibekov.shopping_list.R
import uz.ruzibekov.shopping_list.ui.theme.AppColor

object CreateListContentView {

    @Composable
    fun Default() {

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
                    text = stringResource(id = R.string.create),
                    fontSize = 17.sp,
                    color = AppColor.Blue,
                    fontWeight = FontWeight.Normal
                )
            }

            Spacer(modifier = Modifier.height(11.dp))

            Text(
                text = stringResource(id = R.string.add_list),
                fontWeight = FontWeight.Bold,
                fontSize = 34.sp,
                color = AppColor.Black
            )

            Spacer(modifier = Modifier.height(11.dp))

            BasicTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth(),
                textStyle = TextStyle(
                    fontWeight = FontWeight.Medium,
                    fontSize = 22.sp,
                    color = AppColor.Black
                )
            )

            Spacer(modifier = Modifier.height(11.dp))

            Divider()
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    CreateListContentView.Default()
}