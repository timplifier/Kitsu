package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.TinyXModel

data class TinyX(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun TinyX.toDomain() = TinyXModel(width, height)