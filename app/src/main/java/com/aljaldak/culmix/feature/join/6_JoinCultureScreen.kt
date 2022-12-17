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

private val cultureList = listOf(
    "새로움", "신기한", "놀라움", "색다로움", "멋있음", "체계적인",
    "익숙하지 않음", "재밌는", "새로움", "신기함", "놀라움", "색다로움", "멋있음",
    "체계적임", "익숙하지 않음", "재밌는", "직업 입력 +",
)

@Composable
fun JoinCultureScreen(
    onPrevious: () -> Unit,
    onNext: () -> Unit,
) {
    val list = List(
        size = cultureList.size,
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

            Body5(text = "지역 문화는 어떤가요?")

            Spacer(modifier = Modifier.height(34.dp))

            QuackLazyVerticalGridTag(
                items = cultureList,
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

@Preview
@Composable
fun PreviewJoinCultureScreen() {
    JoinCultureScreen(onPrevious = { /*TODO*/ }) {

    }
}