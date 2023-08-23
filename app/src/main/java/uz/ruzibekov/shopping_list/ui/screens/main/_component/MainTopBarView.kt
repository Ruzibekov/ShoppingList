package uz.ruzibekov.shopping_list.ui.screens.main._component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uz.ruzibekov.shopping_list.R
import uz.ruzibekov.shopping_list.ui.theme.AppColor

object MainTopBarView {

    @Composable
    fun Default() {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .padding(start = 16.dp, end = 16.dp, bottom = 11.dp),
            contentAlignment = Alignment.BottomCenter
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(
                    text = stringResource(id = R.string.lists),
                    fontSize = 34.sp,
                    color = AppColor.Black,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = stringResource(id = R.string.add_list),
                    modifier = Modifier.offset(y = 5.dp),
                    fontSize = 17.sp,
                    color = AppColor.Blue,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun Preview() {
    MainTopBarView.Default()
}