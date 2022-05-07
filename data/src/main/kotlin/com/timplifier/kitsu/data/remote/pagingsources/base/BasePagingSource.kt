package com.timplifier.kitsu.data.remote.pagingsources.base

import android.net.Uri
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.timplifier.kitsu.data.remote.dtos.base.BaseResponseDto
import retrofit2.HttpException
import java.io.IOException

abstract class BasePagingSource<Dto : Any, Model : Any>(
    private val service: suspend (nextPage: Int) -> BaseResponseDto<Dto>,
    private val mappedData: (data: List<Dto>) -> List<Model>

) : PagingSource<Int, Model>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Model> {
        val page = params.key ?: 1
        return try {
            val response = service(page)
            val nextPageNumber = if (response.links.next == null) {
                null
            } else
                Uri.parse(response.links.next).getQueryParameter("page")!!.toInt()
            LoadResult.Page(
                data = mappedData(response.data),
                prevKey = null,
                nextKey = nextPageNumber
            )
        } catch (io: IOException) {
            LoadResult.Error(io)
        } catch (http: HttpException) {
            LoadResult.Error(http)
        }

    }

    override fun getRefreshKey(state: PagingState<Int, Model>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }

    }
}