package com.timplifier.kitsu.data.remote.dtos.dto


import com.google.gson.annotations.SerializedName

data class dt(
    @SerializedName("data")
    val `data`: Data?
)