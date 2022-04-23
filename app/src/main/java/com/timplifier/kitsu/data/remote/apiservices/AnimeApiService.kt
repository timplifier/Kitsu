package com.timplifier.kitsu.data.remote.apiservices

import com.timplifier.kitsu.data.remote.dtos.anime.AnimeList
import retrofit2.http.GET

interface AnimeApiService {
    @GET("anime")
    suspend fun fetchAnime(): AnimeList


}