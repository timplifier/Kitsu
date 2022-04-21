package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("links")
    val links: Links,
    @SerializedName("animeDto")
    val animeDto: AnimeDto,
    @SerializedName("relationships")
    val relationships: Relationships
)