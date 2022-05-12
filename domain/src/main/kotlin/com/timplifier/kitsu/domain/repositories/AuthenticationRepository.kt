package com.timplifier.kitsu.domain.repositories

import com.timplifier.kitsu.domain.either.Either
import com.timplifier.kitsu.domain.models.anime.AnimeModel
import kotlinx.coroutines.flow.Flow

interface AuthenticationRepository {
    fun authenticate(username : String, password : String) : Flow<Either<String, AnimeModel>>
}