package com.aljaldak.culmix.feature.register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import com.aljaldak.culmix.R
import com.aljaldak.culmix.core.component.BackBar
import com.aljaldak.culmix.core.component.CulmixLargeButton

@Composable
fun Register5Screen(onClick: () -> Unit, viewModel: ViewModel) {

    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BackBar {

        }
        Column(
            modifier = Modifier.padding(start = 30.dp, end = 30.dp).verticalScroll(state = scrollState)
        ) {
            Icon(painter = painterResource(id = R.drawable.culmix), contentDescription = "")

            Text(text = "회원가입 약관 동의")

            Text(
                text = "개인정보 이용약관\n" +
                        "안녕하세요!!\n" +
                        "GCMS 서비스를 이용해주셔서 감사합니다. 고객님들께서 GCMS 서비스에 대해 더 쉽게 이해하실 수 있도록 하나의 약관을 마련하였습니다.\n" +
                        "잠시 시간을 내어 약관을 읽어주시면 더욱 편리하게 서비스 이용을 하실 수 있을 것으로 생각합니다.\n" +
                        "제1조 (목적)\n" +
                        "본 약관은 ('https://gcms.site'이하 'GCMS')이(가) 모바일 앱과 웹 서비스를 통하여 제공하는 서비스와 관련하여 ('https://gcms.site'이하 'GCMS')과 회원간의 권리와 의무, 책임사항 및 회원의 서비스 이용절차에 관한 사항을 규정함을 목적으로 합니다. GCMS는 시스템에 관한 제반 기술과 운영에 대한 모든 권한을 갖고 있습니다.\n" +
                        "제2조 (용어의 정의)\n" +
                        "이 약관에서 사용하는 용어의 정의는 다음과 같습니다.\n" +
                        "'GCMS'는 광주소프트웨어마이스터고 학생들이 이용하는 방과후와 학생들의 동아리들을 관리해 주는 서비스입니다. (이하 문맥에 따라 GCMS' 또는 '서비스'라고 합니다.)\n" +
                        "“회원”이란 본 약관에 따라 ('https://gcms.site'이하 'GCMS')과 이용계약을 체결하고 서비스를 이용하는 이용자를 말합니다.\n" +
                        "“콘텐츠”란 “('https://gcms.site'이하 'GCMS')”이 서비스를 위해 “회원”에게 제공하는 내용물 일체(텍스트, 음성, 영상, 네트워크 서비스를 포함하되 이에 한정되지 아니 합니다)를 의미합니다.\n" +
                        "이 약관에서 사용하는 용어 중 위에서 정하지 아니한 것은, 관계법령 및 서비스별 안내에서 정하는 바에 따르며, 그 외에는 일반 거래관행에 따릅니다.\n" +
                        "제3조 (약관의 효력 및 변경)\n" +
                        "service('https://gcms.site'이하 'GCMS')은(는) 약관 및 개인정보 수집방침을 \"회원\" 이 확 인할 수 있도록 서비스 화면에 게시합니다.\n" +
                        "이 약관은 \"회원\"의 동의와 service('https://gcms.sitem'이하 'GCMS')의 승낙으로 효력을 발 생하며, service('https://gcms.site'이하 'GCMS')은(는) 관련 법령(약관의 규제에 관한 법률, 정보 통신망 이용 촉진 및 정보 보호 등에 관한 법률 등)을 위반하지 않는 범위에서 이 약관을 개정할 수 있습니다.\n" +
                        "service('**https://gcms.site**m'이하 'GCMS')이( 이 약관을 개정할 경우에는 적용일자 및 개정 사유를 명시하여 적용일자 14일 전부터 \"서비스”화면 또는 E-mail 또는 문자메시지 등을 통해 공지합니다.\n" +
                        "공지일로부터 14일 이내에 회원이 명시적으로 거부하지 않는 경우 개정 약관에 동의하신 것으로 봅니다.\n" +
                        "“회원”이 개정약관의 적용에 동의하지 않는 경우 service('https://gcms.site'이하 'GCMS') 또는 “회원”은 이용계약을 해지할 수 있습니다. 이 경우 service('https://gcms.site'이하 'GCMS')은(는) “회원”에게 E-mail 또는 문자메시지를 통해 해지 사유, 해지 일을 통지합니다.\n"
                , modifier = Modifier.padding(top = 120.dp)
            )

            CulmixLargeButton(
                text = "다음",
                onClick = onClick,
            )
        }
    }
}