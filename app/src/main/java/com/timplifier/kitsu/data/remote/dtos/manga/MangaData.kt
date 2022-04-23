package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.base.BaseDiffModel

data class MangaData(
    @SerializedName("id")
    override val id: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("links")
    val links: Links,
    @SerializedName("attributes")
    val mangaDto: MangaDto,
    @SerializedName("relationships")
    val relationships: Relationships
) : BaseDiffModel<String>