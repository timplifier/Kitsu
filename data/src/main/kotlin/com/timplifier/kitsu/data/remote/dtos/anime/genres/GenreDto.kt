package com.timplifier.kitsu.data.remote.dtos.anime.genres


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.genres.GenreModel

data class GenreDto(
    @SerializedName("createdAt")
    val createdAt: String?,
    @SerializedName("updatedAt")
    val updatedAt: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("slug")
    val slug: String?,
    @SerializedName("description")
    val description: String?
)

fun GenreDto.toDomain() = GenreModel(createdAt, updatedAt, name, slug, description)