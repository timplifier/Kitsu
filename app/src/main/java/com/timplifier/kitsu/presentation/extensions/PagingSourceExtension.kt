package com.timplifier.kitsu.presentation.extensions

import androidx.paging.PagingSource


fun <T : Any> PagingSource.LoadResult.Page.Companion.loadResult(data: T, prevKey: Any, nextKey: Any) {
    PagingSource.LoadResult.Page.Companion(data,prevKey,nextKey)
}