package com.example.superheroes.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.superheroes.R


// Define la fuente descargada
val BlackOps = FontFamily(
    Font(R.font.blackops, FontWeight.Normal)
)

// Set de estilos de tipografía para comenzar
val Typography = Typography(
    // Estilos de tipografía personalizados utilizando la nueva fuente
    bodyLarge = TextStyle(
        fontFamily = BlackOps,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    displayLarge = TextStyle(
        fontFamily = BlackOps,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    displayMedium = TextStyle(
        fontFamily = BlackOps,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    displaySmall = TextStyle(
        fontFamily = BlackOps,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    )
)