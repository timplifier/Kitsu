package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.manga.TinyModel

data class Tiny(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any

)

fun Tiny.toDomain() = com.timplifier.kitsu.domain.models.manga.TinyModel(width, height)