package com.timplifier.kitsu.data.remote.apiservices

import com.timplifier.kitsu.common.constants.Constants.GET_MANGA
import com.timplifier.kitsu.common.constants.Constants.GET_MANGA_BY_ID
import com.timplifier.kitsu.data.remote.dtos.manga.MangaDto
import com.timplifier.kitsu.data.remote.dtos.manga.MangaList
import retrofit2.http.GET
import retrofit2.http.Path

interface MangaApiService {
    @GET(GET_MANGA)
    suspend fun fetchManga(): MangaList

    @GET(GET_MANGA_BY_ID)
    suspend fun fetchMangaById(@Path("id") id: String): MangaDto
}