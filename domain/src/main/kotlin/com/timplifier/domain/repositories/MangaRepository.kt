package com.timplifier.kitsu.domain.repositories

import com.timplifier.kitsu.domain.either.Either
import com.timplifier.kitsu.domain.models.manga.MangaListModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchManga(): Flow<Either<String, MangaListModel>>
}