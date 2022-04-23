package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class MetaX(
    @SerializedName("dimensions")
    val dimensions: DimensionsX
)