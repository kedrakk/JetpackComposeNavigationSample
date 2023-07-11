package com.example.jetpackcomposenavigationsample.pages

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SingUpPage() {
    Scaffold {
        Button(onClick = {}, modifier = Modifier.padding(it)) {
            Text(text = "SignUp")
        }
    }
}