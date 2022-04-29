package com.timplifier.kitsu.data.repositories.base

import com.timplifier.kitsu.domain.either.Either
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

abstract class BaseRepository {
    protected fun <T> sendRequest(
        gatherIfSucceed: ((T) -> Unit)? = null,
        request: suspend () -> T
    ) = flow<com.timplifier.kitsu.domain.either.Either<String, T>> {
        request().also { data ->
            gatherIfSucceed?.invoke(data)
            emit(com.timplifier.kitsu.domain.either.Either.Right(value = data))
        }

    }.flowOn(Dispatchers.IO).catch { exception ->
        emit(com.timplifier.kitsu.domain.either.Either.Left(exception.localizedMessage ?: "An error occurred"))

    }
}