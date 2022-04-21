package com.timplifier.kitsu.base

import com.timplifier.kitsu.common.either.Either
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

abstract class BaseRepository {
    protected fun <T> sendRequest(
        gatherIfSucceed: ((T) -> Unit)? = null,
        request: suspend () -> T
    ) = flow<Either<String, T>> {
        request().also { data ->
            gatherIfSucceed?.invoke(data)
            emit(Either.Right(value = data))


        }

    }.flowOn(Dispatchers.IO).catch { exception ->
        emit(Either.Left(exception.localizedMessage ?: "An error occurred"))


    }
}