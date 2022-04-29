package com.timplifier.kitsu.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.kitsu.domain.models.anime.AnimeStaffModel

data class AnimeStaff(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXX
)

fun AnimeStaff.toDomain() = com.timplifier.kitsu.domain.models.anime.AnimeStaffModel(
    links.toDomain()
)