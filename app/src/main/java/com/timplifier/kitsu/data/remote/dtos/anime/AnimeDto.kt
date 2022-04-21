package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName

data class AnimeDto(
    @SerializedName("data")
    val `data`: Data
)