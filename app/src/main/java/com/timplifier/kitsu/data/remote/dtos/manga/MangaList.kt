package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName

data class MangaList(
    @SerializedName("data")
    val data: List<MangaData>,
    @SerializedName("meta")
    val meta: MetaXX,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXX
)