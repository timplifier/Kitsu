package com.timplifier.kitsu.domain.repositories

import com.timplifier.kitsu.domain.either.Either
import com.timplifier.kitsu.domain.models.anime.AnimeDataModel
import com.timplifier.kitsu.domain.models.anime.AnimeModel
import kotlinx.coroutines.flow.Flow

interface AnimeRepository {
    fun fetchAnimeDetails(id: String): Flow<Either<String, AnimeDataModel>>
}