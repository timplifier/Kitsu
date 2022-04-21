package com.timplifier.kitsu.presentation.ui.adapters.anime

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.kitsu.base.BaseDiffUtil
import com.timplifier.kitsu.data.remote.dtos.anime.AnimeDto
import com.timplifier.kitsu.databinding.ItemAnimeBinding


class AnimeAdapter : ListAdapter<AnimeDto, AnimeAdapter.AnimeViewHolder>(BaseDiffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            ItemAnimeBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }
    }

    inner class AnimeViewHolder(private val binding: ItemAnimeBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(animeDto: AnimeDto) {

        }

    }

}

