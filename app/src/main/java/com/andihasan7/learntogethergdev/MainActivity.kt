package com.andihasan7.learntogethergdev

import android.content.res.Resources
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.andihasan7.learntogethergdev.ui.theme.LearnTogetherGDevTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherGDevTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    PageMain()
                }
            }
        }
    }
}

@Composable
fun PageMain() {
    Column {
        Image(painter = painterResource(R.drawable.bg_compose_background), contentDescription = null)
        Text(
            text = stringResource(R.string.jetpack_compose_tutorial),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(R.string.text_kedua),
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            style = TextStyle(
                textAlign = TextAlign.Justify
            )
        )
        Text(
            text = stringResource(R.string.text_ketiga),
            modifier = Modifier.padding(16.dp),
            style = TextStyle(
                textAlign = TextAlign.Justify
            )
        )
    }
}


@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearnTogetherGDevTheme {
        PageMain()
    }
}