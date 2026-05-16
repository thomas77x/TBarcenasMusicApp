package com.example.myappmusic

import kotlinx.serialization.Serializable

@Serializable
data class Album(
    val id: String,
    val title: String,
    val artist: String,
    val description: String,
    val cover_url: String
)

@Serializable
sealed class Screen {
    @Serializable
    data object Home : Screen()
    
    @Serializable
    data class Detail(val albumId: String) : Screen()
}
