package com.timplifier.kitsu.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.kitsu.base.BaseDiffUtil
import com.timplifier.kitsu.common.extensions.loadImageWithGlide
import com.timplifier.kitsu.data.remote.dtos.anime.AnimeData
import com.timplifier.kitsu.databinding.ItemAnimeBinding


class AnimeAdapter
    : ListAdapter<AnimeData, AnimeAdapter.AnimeViewHolder>(BaseDiffUtil()) {


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
        fun onBind(animeData: AnimeData) {
            val amountOfEpisodes: Int = animeData.animeDto.episodeCount
            binding.apply {
                tvAverageRating.text = animeData.animeDto.averageRating
                imAnime.loadImageWithGlide(animeData.animeDto.posterImage.original)
                tvEnglishTitle.text = animeData.animeDto.titles.en
                tvJapaneseTitle.text = animeData.animeDto.titles.jaJp
                tvAmountOfEpisodes.text = "Episodes: $amountOfEpisodes TV"
                tvStartDate.text = animeData.animeDto.startDate
                tvEndDate.text = animeData.animeDto.endDate


            }

        }

    }

}

