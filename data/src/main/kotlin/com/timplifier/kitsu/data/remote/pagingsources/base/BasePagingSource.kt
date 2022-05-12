package com.timplifier.kitsu.data.remote.pagingsources.base

import androidx.paging.PagingSource
import androidx.paging.PagingState
import retrofit2.HttpException
import retrofit2.Response
import java.io.IOException

//abstract class BasePagingSource<Dto : Any, Domain : Any>(
//    private val request: suspend (position: Int) -> Response<Dto>,
//    private val mappedData: (data: List<Dto>) -> List<Domain>
//) : PagingSource<Int, Domain>() {
//
//    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Domain> {
//        val position = params.key ?: BASE_STARTING_PAGE_INDEX
//
//        return try {
//            val response = request(position)
//            val data = response.body()!!
//
//            LoadResult.Page(
//                data = mappedData(data.data),
//                prevKey = null,
//                nextKey = 1
//            )
//        } catch (exception: IOException) {
//            LoadResult.Error(exception)
//        } catch (exception: HttpException) {
//            LoadResult.Error(exception)
//        }
//    }
//
//    override fun getRefreshKey(state: PagingState<Int, Domain>): Int? {
//        return state.anchorPosition?.let { anchorPosition ->
//            val anchorPage = state.closestPageToPosition(anchorPosition)
//            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
//        }
//    }
//
//    companion object {
//        const val BASE_STARTING_PAGE_INDEX = 1
//    }
//}