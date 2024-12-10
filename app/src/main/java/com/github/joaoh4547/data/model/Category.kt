package com.github.joaoh4547.data.model

import androidx.annotation.DrawableRes

data class Category(
    val id: String,
    val name: String
){
    @get:DrawableRes
    val icon: Int?
        get() = NearbyFilterChipView.fromDescription(description = name)?.icon
}
