package com.timplifier.data.repositories

import com.timplifier.data.repositories.base.BaseRepository
import com.timplifier.data.remote.apiservices.AnimeApiService
import com.timplifier.domain.repositories.AnimeRepository
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val animeApiService: AnimeApiService
) : BaseRepository(), AnimeRepository {
    override fun fetchAnime() = sendRequest {
        animeApiService.fetchAnime().toDomain()
    }

}