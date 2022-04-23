package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class LargeX(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)