package com.timplifier.kitsu.common.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImageWithGlide(url: String) = Glide.with(this).load(url).into(this)
fun ImageView.setAnimeStatus(status: String) {
    when (status) {
        "finished" -> this.setImageResource()

    }

}