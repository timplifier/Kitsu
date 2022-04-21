package com.timplifier.kitsu.data.remote.apiservices

import com.timplifier.kitsu.common.constants.Constants.GET_ANIME
import com.timplifier.kitsu.common.constants.Constants.GET_ANIME_BY_ID
import com.timplifier.kitsu.data.remote.dtos.anime.Data
import retrofit2.http.GET
import retrofit2.http.Path

interface AnimeApiService {
    @GET(GET_ANIME)
    suspend fun fetchAnime(): List<Data>

    @GET(GET_ANIME_BY_ID)
    suspend fun fetchAnimeById(@Path("id") id: String): Data
}