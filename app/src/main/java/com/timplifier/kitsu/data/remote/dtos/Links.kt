package com.timplifier.kitsu.data.remote.dtos


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("self")
    val self: String
)