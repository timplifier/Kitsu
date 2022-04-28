package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.manga.LargeModel

data class Large(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun Large.toDomain() = LargeModel(width, height)