package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.manga.MediumModel

data class Medium(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun Medium.toDomain() = com.timplifier.kitsu.domain.models.manga.MediumModel(width, height)