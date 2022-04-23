package com.timplifier.kitsu.data.repositories

import com.timplifier.kitsu.base.BaseRepository
import com.timplifier.kitsu.data.remote.apiservices.MangaApiService
import javax.inject.Inject

class MangaRepositoryImpl @Inject constructor(
    private val mangaApiService: MangaApiService
) : BaseRepository() {
    fun fetchManga() = sendRequest {
        mangaApiService.fetchManga()
    }
}