package com.timplifier.kitsu.data.remote.apiservices

import com.timplifier.kitsu.data.remote.dtos.anime.AnimeListDto
import retrofit2.http.GET

interface AnimeApiService {
    @GET("anime")
    suspend fun fetchAnime(): AnimeListDto
}