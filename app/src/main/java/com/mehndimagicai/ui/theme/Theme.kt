package com.mehndimagicai.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = MehndiPrimary,
    secondary = MehndiSecondary,
    tertiary = Pink80,
    background = Color(0xFF121212),
    surface = Color(0xFF1E1E1E),
    surfaceVariant = Color(0xFF2B2B2B),
    onBackground = Color(0xFFFFFFFF),
    onSurface = Color(0xFFFFFFFF),
    onSurfaceVariant = Color(0xFFE7E0F5)
)

private val LightColorScheme = lightColorScheme(
    primary = MehndiPrimary,
    secondary = MehndiSecondary,
    tertiary = Pink40,
    background = Color(0xFFF6F3FF),
    surface = Color(0xFFFFFFFF),
    surfaceVariant = Color(0xFFF0EBFF),
    onBackground = Color(0xFF1A1A1A),
    onSurface = Color(0xFF1A1A1A),
    onSurfaceVariant = Color(0xFF4E4A5E)
)

@Composable
fun MehndiMagicAITheme(
    darkTheme: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
