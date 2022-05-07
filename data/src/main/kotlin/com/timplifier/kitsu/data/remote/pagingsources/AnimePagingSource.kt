package com.timplifier.kitsu.data.remote.pagingsources

import android.net.Uri
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.timplifier.kitsu.data.remote.apiservices.AnimeApiService
import com.timplifier.kitsu.data.remote.dtos.anime.AnimeDataDto
import com.timplifier.kitsu.domain.models.anime.AnimeDataModel
import retrofit2.HttpException
import java.io.IOException

class AnimePagingSource(
    private val animeApiService: AnimeApiService,
    private val mappedData: (data: List<AnimeDataDto>) -> List<AnimeDataModel>

) : PagingSource<Int, AnimeDataModel>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, AnimeDataModel> {
        val page = params.key ?: 1
        return try {
            val response = animeApiService.fetchAnime(page)
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

    override fun getRefreshKey(state: PagingState<Int, AnimeDataModel>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }

    }
}