package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.base.BaseDiffModel

data class Data(
    @SerializedName("id")
    override val value: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("links")
    val links: Links,
    @SerializedName("animeDto")
    val animeDto: AnimeDto,
    @SerializedName("relationships")
    val relationships: Relationships
) : BaseDiffModel<String>