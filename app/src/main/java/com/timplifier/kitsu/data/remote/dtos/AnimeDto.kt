package com.timplifier.kitsu.data.remote.dtos


import com.google.gson.annotations.SerializedName

data class AnimeDto(
    @SerializedName("data")
    val data: List<Data>
)