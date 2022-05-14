package com.timplifier.kitsu.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.kitsu.databinding.ItemAnimeBinding
import com.timplifier.kitsu.presentation.base.BaseDiffUtil
import com.timplifier.kitsu.presentation.extensions.loadImageWithGlide
import com.timplifier.kitsu.presentation.models.anime.AnimeDataUI

class AnimeAdapter(
    private val onItemClick: (id: String) -> Unit
) : PagingDataAdapter<AnimeDataUI, AnimeAdapter.AnimeViewHolder>(BaseDiffUtil()) {


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
        fun onBind(animeDataDto: AnimeDataUI) {
            binding.imAnime.loadImageWithGlide(animeDataDto.animeDto.posterImage?.original)

            binding.root.setOnClickListener {
                onItemClick(animeDataDto.id)
            }
        }
    }
}