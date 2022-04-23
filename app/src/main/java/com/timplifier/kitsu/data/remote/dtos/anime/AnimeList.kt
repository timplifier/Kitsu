package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName

data class AnimeList(
    @SerializedName("data")
    val data: List<AnimeData>,
    @SerializedName("meta")
    val meta: MetaXX,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXX
)