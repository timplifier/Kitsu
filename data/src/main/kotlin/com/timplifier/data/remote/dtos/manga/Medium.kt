package com.timplifier.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.domain.models.manga.MediumModel

data class Medium(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)

fun Medium.toDomain() = MediumModel(width, height)