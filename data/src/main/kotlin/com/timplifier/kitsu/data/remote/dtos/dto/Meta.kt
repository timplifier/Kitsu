package com.timplifier.kitsu.data.remote.dtos.dto


import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("dimensions")
    val dimensions: Dimensions?
)