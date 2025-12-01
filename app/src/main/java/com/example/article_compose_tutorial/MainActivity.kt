package com.example.article_compose_tutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.article_compose_tutorial.ui.theme.Article_compose_tutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Article_compose_tutorialTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    Article(
                        title = stringResource(R.string.title_Jetpack_compose),
                        middleText = stringResource(R.string.article_mid_text),
                        bottomText = stringResource(R.string.article_bottom_text),
                        modifier = Modifier.padding(it)
                    )
                }
            }
        }
    }
}


@Composable
fun Article(title: String, middleText: String, bottomText: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_jetpackcompose1_2_social)
    Column (modifier = modifier, verticalArrangement = Arrangement.Center) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier.fillMaxWidth(),
        )

        Text(
            text = title,
            modifier = Modifier.padding(all=16.dp),
            fontSize = 24.sp,
        )

        Text(
            text = middleText,
            modifier = Modifier.padding(all=16.dp),
            textAlign = TextAlign.Justify,
        )

        Text(
            text = bottomText,
            modifier = Modifier.padding(all=16.dp),
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ArticlePreview() {
    Article_compose_tutorialTheme {
        Article(
            title = stringResource(R.string.title_Jetpack_compose),
            middleText = stringResource(R.string.article_mid_text),
            bottomText = stringResource(R.string.article_bottom_text)
        )
    }
}