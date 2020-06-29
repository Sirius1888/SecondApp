package com.example.second.extension

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.second.R

fun ImageView.loadImage(url: String, context: Context) {
    Glide.with(context)
        .load(url)
        .placeholder(R.drawable.ic_launcher_background)
        .into(this);
}

