package com.timplifier.kitsu.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.kitsu.base.BaseDiffUtil
import com.timplifier.kitsu.common.extensions.loadImageWithGlide
import com.timplifier.kitsu.data.remote.dtos.anime.AnimeDataDto
import com.timplifier.kitsu.databinding.ItemAnimeBinding


class AnimeAdapter
    : ListAdapter<AnimeDataDto, AnimeAdapter.AnimeViewHolder>(BaseDiffUtil()) {


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
        fun onBind(animeDataDto: AnimeDataDto) {
            val amountOfEpisodes: Int = animeDataDto.animeDto.episodeCount
            binding.apply {
                tvAverageRating.text = animeDataDto.animeDto.averageRating
                imAnime.loadImageWithGlide(animeDataDto.animeDto.posterImage.original)
                tvEnglishTitle.text = animeDataDto.animeDto.titles.en
                tvJapaneseTitle.text = animeDataDto.animeDto.titles.jaJp
                tvAmountOfEpisodes.text = "Episodes: $amountOfEpisodes TV"
                tvStartDate.text = animeDataDto.animeDto.startDate
                tvEndDate.text = animeDataDto.animeDto.endDate


            }

        }

    }

}

