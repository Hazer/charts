package com.github.tehras.charts.ui

import androidx.compose.Composable
import androidx.ui.animation.Crossfade
import androidx.ui.material.MaterialTheme
import androidx.ui.material.Surface
import com.github.tehras.charts.theme.ChartsTheme
import com.github.tehras.charts.ui.pie.PieChartScreen
import com.github.tehras.charts.ui.selector.SelectChartScreen

@Composable
fun ChartsApp() {
    ChartsTheme {
        AppContent()
    }
}

@Composable
fun AppContent() {
    Crossfade(ChartScreenStatus.currentChart) { screen ->
        Surface(color = MaterialTheme.colors.background) {
            when(screen) {
                ChartScreen.SelectChart -> SelectChartScreen()
                ChartScreen.Pie -> PieChartScreen()
                ChartScreen.Line -> TODO()
            }
        }
    }
}
