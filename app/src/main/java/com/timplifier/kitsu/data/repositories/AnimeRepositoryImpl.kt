package com.timplifier.kitsu.data.repositories

import com.timplifier.kitsu.base.BaseRepository
import com.timplifier.kitsu.data.remote.apiservices.AnimeApiService
import com.timplifier.kitsu.domain.repositories.AnimeRepository
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val animeApiService: AnimeApiService

) : BaseRepository(), AnimeRepository {
    override fun fetchAnime() = sendRequest {
        animeApiService.fetchAnime()
    }


}