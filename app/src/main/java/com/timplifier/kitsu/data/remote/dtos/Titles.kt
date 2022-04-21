package com.timplifier.kitsu.data.remote.dtos


import com.google.gson.annotations.SerializedName

data class Titles(
    @SerializedName("en")
    val en: String,
    @SerializedName("en_jp")
    val enJp: String,
    @SerializedName("ja_jp")
    val jaJp: String
)