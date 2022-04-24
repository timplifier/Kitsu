package com.timplifier.kitsu.data.remote.dtos.manga


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.base.BaseDiffModel
import com.timplifier.kitsu.domain.models.manga.MangaDataModel

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

fun MangaData.toDomain() =
    MangaDataModel(id, type, links.toDomain(), mangaDto.toDomain(), relationships.toDomain())