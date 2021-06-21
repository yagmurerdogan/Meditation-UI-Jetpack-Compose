package com.yagmurerdogan.composeintro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import com.yagmurerdogan.composeintro.ui.HomeScreen
import com.yagmurerdogan.composeintro.ui.theme.ComposeIntroTheme


class MainActivity : ComponentActivity() {
    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeIntroTheme {
                HomeScreen()
            }
        }
    }
}

