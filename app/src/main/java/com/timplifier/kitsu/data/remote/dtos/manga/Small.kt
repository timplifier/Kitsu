package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class Small(
    @SerializedName("width")
    val width: Any,
    @SerializedName("height")
    val height: Any
)