package com.github.joaoh4547.data.model

import androidx.annotation.DrawableRes
import com.github.joaoh4547.ui.components.category.NearbyFilterChip

data class NearbyCategory(
    val id: String,
    val name: String
){
    @get:DrawableRes
    val icon: Int?
        get() = NearbyFilterChipView.fromDescription(description = name)?.icon
}
