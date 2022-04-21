package com.timplifier.kitsu.data.repositories

import com.timplifier.kitsu.base.BaseRepository
import com.timplifier.kitsu.data.remote.apiservices.AnimeApiService
import javax.inject.Inject

class AnimeRepository @Inject constructor(
    private val animeApiService: AnimeApiService

) : BaseRepository() {
    fun fetchAnime() = sendRequest {
        animeApiService.fetchAnime()
    }

    fun fetchAnimeById(id: String) = sendRequest {
        animeApiService.fetchAnimeById(id)
    }


}