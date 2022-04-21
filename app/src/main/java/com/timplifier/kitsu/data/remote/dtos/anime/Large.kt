package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName

data class Large(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)