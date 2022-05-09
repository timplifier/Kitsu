package com.timplifier.kitsu.domain.repositories

import com.timplifier.kitsu.domain.either.Either
import com.timplifier.kitsu.domain.models.anime.AnimeDataModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchSingleAnime(id: String): Flow<Either<String, AnimeDataModel>>
}