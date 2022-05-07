package com.timplifier.kitsu.data.repositories.base

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.timplifier.kitsu.data.remote.pagingsources.base.BasePagingSource
import com.timplifier.kitsu.domain.either.Either
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

    protected fun <Dto : Any, Model : Any> sendPagingRequest(

        pagingSource: BasePagingSource<Dto, Model>,
        pageSize: Int = 20
    ) = flow<Either<String, Model>> {
        Pager(
            PagingConfig(pageSize), pagingSourceFactory =
            { pagingSource }).flow
    }

    protected fun <Dto : Any, Model : Any> sendPagingRequest(
        pagingSource: Dto,

        pageSize: Int = 20
    ) = flow<Either<String, Model>> {
        Pager(
            PagingConfig(pageSize), pagingSourceFactory = { pagingSource }).flow
    }


}