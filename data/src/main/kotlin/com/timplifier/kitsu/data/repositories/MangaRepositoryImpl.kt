package com.timplifier.kitsu.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.timplifier.kitsu.data.remote.apiservices.MangaApiService
import com.timplifier.kitsu.data.remote.dtos.manga.toDomain
import com.timplifier.kitsu.data.remote.pagingsources.MangaPagingSource
import com.timplifier.kitsu.data.repositories.base.BaseRepository
import com.timplifier.kitsu.domain.repositories.MangaRepository
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MangaRepositoryImpl @Inject constructor(
    private val mangaApiService: MangaApiService
) : BaseRepository(), MangaRepository {
    override fun fetchManga() = sendRequest {
        TODO()
    }

    fun fetchPagedManga() = Pager(
        PagingConfig(
            pageSize = 20,
            initialLoadSize = 10
        )
    ) { MangaPagingSource(mangaApiService) }.flow.map { data -> data.map { it.toDomain() } }
}