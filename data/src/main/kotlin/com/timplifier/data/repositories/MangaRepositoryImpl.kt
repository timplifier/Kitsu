package com.timplifier.data.repositories

import com.timplifier.data.repositories.base.BaseRepository
import com.timplifier.data.remote.apiservices.MangaApiService
import com.timplifier.kitsu.data.remote.dtos.manga.toDomain
import com.timplifier.domain.repositories.MangaRepository
import javax.inject.Inject

class MangaRepositoryImpl @Inject constructor(
    private val mangaApiService: MangaApiService
) : BaseRepository(), MangaRepository {
    override fun fetchManga() = sendRequest {
        mangaApiService.fetchManga().toDomain()
    }
}