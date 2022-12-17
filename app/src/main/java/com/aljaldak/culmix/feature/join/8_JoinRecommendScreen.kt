package com.aljaldak.culmix.feature.join

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.theme.Body5
import com.aljaldak.culmix.feature.join.common.JoinSimpleLayout
import team.duckie.quackquack.ui.component.QuackLazyVerticalGridTag
import team.duckie.quackquack.ui.component.QuackTagType

private val recommendList = listOf(
    "혼자 여행", "유학", "문화 체험", "새로운 경험", "급한 일",
    "주변 행사", "다수 여행", "짧은 여행", "긴 여행", "이벤트 참여",
    "직장 & 직무", "직접 여향+"
)

@Composable
fun JoinRecommendScreen(
    onPrevious: () -> Unit,
    onNext: () -> Unit,
) {
    val list = List(
        size = recommendList.size,
        init = { false }
    )
    val itemSelection =
        remember {
            list.toMutableStateList()
        }

    JoinSimpleLayout(
        topContent = {
            BackBar {
                onPrevious()
            }
        },
        content = {
            Spacer(modifier = Modifier.height(30.dp))

            Body5(text = "어떤 분에게 추천하나요?")

            Spacer(modifier = Modifier.height(34.dp))

            QuackLazyVerticalGridTag(
                items = recommendList,
                itemChunkedSize = 5,
                tagType = QuackTagType.Round,
                onClick = {
                    itemSelection[it] = !itemSelection[it]
                },
                itemSelections = itemSelection
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