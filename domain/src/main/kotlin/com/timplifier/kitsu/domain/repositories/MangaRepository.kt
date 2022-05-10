package com.timplifier.kitsu.domain.repositories

import com.timplifier.kitsu.domain.either.Either
import com.timplifier.kitsu.domain.models.manga.SingleMangaModel
import kotlinx.coroutines.flow.Flow

interface MangaRepository {
    fun fetchDetailedManga(id: String): Flow<Either<String, SingleMangaModel>>
}