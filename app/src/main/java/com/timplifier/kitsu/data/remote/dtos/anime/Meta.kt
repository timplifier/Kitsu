package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("dimensions")
    val dimensions: Dimensions
)