package com.timplifier.data.remote.dtos.anime


import com.google.gson.annotations.SerializedName
import com.timplifier.domain.models.anime.TitlesModel

data class Titles(
    @SerializedName("en")
    val en: String?,
    @SerializedName("en_jp")
    val enJp: String,
    @SerializedName("ja_jp")
    val jaJp: String
)

fun Titles.toDomain() = TitlesModel(
    en, enJp, jaJp
)