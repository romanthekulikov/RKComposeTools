package com.roman_kulikov.tools.extentions

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

val CurrentContext: Context
    @Composable
    get() = LocalContext.current
