package com.timplifier.kitsu.common.extensions

import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

fun <T, D : RecyclerView.ViewHolder> ListAdapter<T, D>.submitData(data: List<T>) {
    val newList = ArrayList<T>(currentList)
    newList.addAll(data)
    submitList(
        newList
    )
}
