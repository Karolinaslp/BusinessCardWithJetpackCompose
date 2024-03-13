package com.example.mypostcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.mypostcard.ui.theme.MyPostCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyPostCardTheme {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.Black),
                    contentAlignment = Alignment.Center
                ) {
                    MyCustomCard(
                        modifier = Modifier.fillMaxWidth(0.8f),
                        image = R.drawable.desktop_wallpaper_about_music_in_my_black_violin_thumbnail,
                        title = "Regular Software Engineer",
                        text = "A software engineer with commercial experience since April 2023 at Harman Connected Services, specializing in automotive software development. Proficient in Java and Android for backend, AOSP, and Android projects.",
                        publisher = Publisher(
                            name = "Karolina Slemp-Rejowska",
                            job = "Software Engineer",
                            image = R.drawable.me
                        )
                    )
                }
            }
        }
    }
}
