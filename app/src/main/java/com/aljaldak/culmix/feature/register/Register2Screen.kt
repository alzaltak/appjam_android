package com.aljaldak.culmix.feature.register

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton
import com.aljaldak.culmix.core.component.LanguageItem
import com.aljaldak.culmix.core.component.StepsProgressBar
import com.aljaldak.culmix.core.theme.notoSansFamily

@Composable
fun Register2Screen(onClick: () -> Unit) {

//    val languageList = remember {
//        mutableListOf(
//            "English", "한국어", "日本語", "中国人", "La France", "italiano", "brazilian", "Polskie"
//        ).toMutableStateList()
//    }

//    val selectedList = remember {
//        mutableListOf("한국어")
//    }
//
//    val isSelected: (String) -> Boolean = { selectedList.contains(it) }



    Column(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.padding(start = 30.dp, end = 30.dp)
        ) {
            BackBar {

            }
            StepsProgressBar(
                numberOfSteps = 5, currentStep = 2, modifier = Modifier.padding(vertical = 30.dp)
            )
            Text(
                text = "회원가입",
                textAlign = TextAlign.Center,
                fontFamily = notoSansFamily,
                fontSize = 18.sp,
                color = Color.Black,
                modifier = Modifier.padding(vertical = 40.dp)
            )

            LazyVerticalGrid(columns = GridCells.Fixed(4), content = {
//                items(languageList.size) {
//                    LanguageItem(
//                        text = languageList[it],
//                        selected = isSelected(languageList[it]),
//                        onClick = {
//                            if (isSelected(languageList[it])) selectedList.remove(languageList[it])
//                            else selectedList.add(languageList[it])
//                            Log.d("TAG", "Register2Screen: $selectedList")
//
//                        }
//                    )
//                }
            })
        }

        Spacer(modifier = Modifier.weight(1f))

//        CulmixLargeButton(
//            text = "다음", onClick = onClick, enabled = selectedList.isNotEmpty()
//        )
    }
}