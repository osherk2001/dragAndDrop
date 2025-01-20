package org.example.project

//import androidx.compose.ui.draw.EmptyBuildDrawCacheParams.layoutDirection
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalFoundationApi::class)
@Composable
@Preview

fun App() {
    MaterialTheme {
        DragAndDropScreen()
    }
}