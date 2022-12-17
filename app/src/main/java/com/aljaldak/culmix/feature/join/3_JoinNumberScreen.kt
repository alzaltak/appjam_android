package com.aljaldak.culmix.feature.join

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.theme.Body1
import com.aljaldak.culmix.feature.join.common.HouseTypeContent
import com.aljaldak.culmix.feature.join.common.JoinDivider
import com.aljaldak.culmix.feature.join.common.JoinSimpleLayout
import com.aljaldak.culmix.feature.join.common.UpDownContent

@Composable
fun JoinNumberScreen(
    onPrevious: () -> Unit,
    onNext: () -> Unit,
) {
    var peopleNumber by remember { mutableStateOf(0) }
    var checkedHouseType by remember { mutableStateOf(0) }

    JoinSimpleLayout(
        topContent = {
            BackBar {
                onPrevious()
            }
        },
        content = {
            Spacer(modifier = Modifier.height(30.dp))

            Body1(text = "몇 명이서 지낼 수 있나요?")

            Spacer(modifier = Modifier.height(24.dp))

            UpDownContent(
                number = peopleNumber,
                onClickUp = { peopleNumber++ },
                onClickDown = { peopleNumber-- },
            )

            Spacer(modifier = Modifier.height(24.dp))

            JoinDivider()

            Spacer(modifier = Modifier.height(24.dp))

            Body1(text = "다른 사람과 지낼 수 있는 집인가요?")

            Spacer(modifier = Modifier.height(18.dp))

            HouseTypeContent(
                checked = checkedHouseType == 0,
                onCheckedChange = {
                    checkedHouseType = 0
                },
                title = "집 전체",
                content = "모든 공간을 같이 사용하고 있어요.",
            )

            Spacer(modifier = Modifier.height(16.dp))

            HouseTypeContent(
                checked = checkedHouseType == 1,
                onCheckedChange = {
                    checkedHouseType = 1
                },
                title = "1인실",
                content = "침실은 혼자 사용하지만 화장실, 욕실 및 주방은 \n" +
                        "공용으로 사용해요.",
            )

            Spacer(modifier = Modifier.height(16.dp))

            HouseTypeContent(
                checked = checkedHouseType == 2,
                onCheckedChange = {
                    checkedHouseType = 2
                },
                title = "다인실",
                content = "침실을 포함한 모든 공간을 다른 사람과\n" +
                        "공유하면서 사용해요.",
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
fun PreviewJoinNumberScreen() {
    JoinNumberScreen(onPrevious = { /*TODO*/ }) {
        
    }
}