package com.timplifier.kitsu.base

import androidx.recyclerview.widget.DiffUtil

class BaseDiffUtil<T : BaseDiffModel> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem.value == newItem.value
    }

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem == newItem
    }

}