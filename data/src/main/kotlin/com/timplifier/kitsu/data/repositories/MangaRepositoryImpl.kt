package com.timplifier.kitsu.data.repositories

import com.timplifier.kitsu.data.remote.apiservices.MangaApiService
import com.timplifier.kitsu.data.remote.dtos.manga.toDomain
import com.timplifier.kitsu.data.repositories.base.BaseRepository
import com.timplifier.kitsu.domain.repositories.MangaRepository
import javax.inject.Inject

class MangaRepositoryImpl @Inject constructor(
    private val mangaApiService: MangaApiService
) : BaseRepository(), MangaRepository {
    override fun fetchManga() = sendRequest {
        mangaApiService.fetchManga().toDomain()
    }
}