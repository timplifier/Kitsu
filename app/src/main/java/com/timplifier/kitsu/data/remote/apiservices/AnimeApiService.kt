package com.timplifier.kitsu.data.remote.apiservices

import com.timplifier.kitsu.common.constants.Constants.GET_ANIME
import com.timplifier.kitsu.data.remote.dtos.anime.AnimeList
import retrofit2.http.GET

interface AnimeApiService {
    @GET(GET_ANIME)
    suspend fun fetchAnime(): AnimeList


}