package com.aljaldak.culmix.feature.join

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.component.BackBar
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.aljaldak.culmix.R
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.component.CulmixTextField
import com.aljaldak.culmix.core.theme.Body1
import com.aljaldak.culmix.core.theme.Title1
import com.aljaldak.culmix.core.util.simClickable
import com.aljaldak.culmix.feature.join.common.JoinDivider
import com.aljaldak.culmix.feature.join.common.JoinSimpleLayout
import com.aljaldak.culmix.feature.join.common.RadioButton
import com.aljaldak.culmix.feature.join.common.UpDownContent

private val HouseTypeList = listOf(
    "아파트",
    "주택",
    "빌라",
)

@Composable
fun JoinDefaultInfoScreen(
    onPrevious: () -> Unit,
    onNext: () -> Unit,
) {
    var selectedTypeBtn by remember { mutableStateOf(0) }
    var roomNumber by remember { mutableStateOf(0) }
    var houseSize by remember { mutableStateOf("") }

    JoinSimpleLayout(
        topContent = {
            BackBar {
                onPrevious()
            }
        },
        content = {
            Spacer(modifier = Modifier.height(30.dp))

            Title1(text = "집 정보 입력")

            Spacer(modifier = Modifier.height(21.dp))

            Body1(text = "어떤 집 유형인가요?")

            Spacer(modifier = Modifier.height(18.dp))

            LazyRow(
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                itemsIndexed(HouseTypeList) { index, house ->
                    RadioButton(
                        text = house,
                        onClick = {
                            selectedTypeBtn = index
                        },
                        enabled = selectedTypeBtn == index,
                    )
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            JoinDivider()

            Spacer(modifier = Modifier.height(24.dp))

            Body1(text = "집에 방이 몇 개 있나요?")

            Spacer(modifier = Modifier.height(14.dp))

            UpDownContent(
                number = roomNumber,
                onClickUp = { roomNumber++ },
                onClickDown = { roomNumber-- }
            )
            Spacer(modifier = Modifier.width(24.dp))

            Spacer(modifier = Modifier.height(24.dp))

            JoinDivider()

            Spacer(modifier = Modifier.height(24.dp))

            Body1(text = "집의 크기는 어떻게 되나요?")

            Spacer(modifier = Modifier.height(16.dp))

            CulmixTextField(
                value = houseSize,
                onValueChange = {
                    houseSize = it
                },
                hint = "평수"
            )
        },
        bottomContent = {
            CulmixLargeButton(
                text = "NEXT",
                onClick = {
                    onNext()
                },
            )
        }
    )
}

@Preview
@Composable
fun PreviewJoinDefaultInfoScreen() {
    JoinDefaultInfoScreen(onPrevious = { /*TODO*/ }) {
    }
}
