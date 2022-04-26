package com.timplifier.kitsu.data.remote.apiservices

import com.timplifier.kitsu.data.remote.dtos.manga.MangaListDto
import retrofit2.http.GET

interface MangaApiService {
    @GET("manga")
    suspend fun fetchManga(): MangaListDto


}