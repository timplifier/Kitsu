package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.TinyModel

data class Tiny(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun Tiny.toDomain() = com.timplifier.kitsu.domain.models.anime.TinyModel(width, height)