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
import androidx.compose.ui.graphics.painter.Painter
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
                    ComposeArticelApp()
                }
            }
        }
    }
}

@Composable
fun ComposeArticelApp() {
    ArticelCard(
        title = stringResource(R.string.jetpack_compose_tutorial),
        shortDescription = stringResource(R.string.text_kedua),
        longDescription = stringResource(R.string.text_ketiga),
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )
}
@Composable
fun ArticelCard(
    title: String,
    shortDescription: String,
    longDescription: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier,
) {
    Column(modifier = modifier) {
        Image(painter = imagePainter, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = shortDescription,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = longDescription,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify

        )
    }
}


@Preview(showBackground = true,
    showSystemUi = true)
@Composable
fun GreetingPreview() {
    LearnTogetherGDevTheme {
        ComposeArticelApp()
    }
}