package com.example.androidtutorial

// Optimized imports > A~Z
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidtutorial.ui.theme.AndroidTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // onCreate == main()
        super.onCreate(savedInstanceState)
        // setContent > 레이아웃의 정의에 사용
        setContent {
            AndroidTutorialTheme {
                // A surface container using the 'background' color from the theme
                whatIsRemember()
            }
        }
    }
}

@Composable
fun whatIsRemember() {
    // remember 안쓰면 TextField에 입력값이 안뜸
    /* 값이 입력될 때마다 state가 바뀌어 재구성이 일어나 textState에 mutableStateOf("")가 세팅된다.
    * [mutableStateOf]
    * 1. 단순 remember 2. 구조 분해 3. by 사용(Delegation) */
    var textState by remember { mutableStateOf("") }
    TextField(value = textState, onValueChange = { textValue -> textState = textValue })
}