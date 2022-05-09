package com.timplifier.kitsu.data.remote.dtos.dto


import com.google.gson.annotations.SerializedName

data class Medium(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?
)