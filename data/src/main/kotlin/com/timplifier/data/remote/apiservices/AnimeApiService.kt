package com.timplifier.data.remote.apiservices

import com.timplifier.data.remote.dtos.anime.AnimeListDto
import retrofit2.http.GET

interface AnimeApiService {
    @GET("anime")
    suspend fun fetchAnime(): AnimeListDto


}