package com.timplifier.kitsu.data.remote.dtos


import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("synopsis")
    val synopsis: String,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String,
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<String>
)