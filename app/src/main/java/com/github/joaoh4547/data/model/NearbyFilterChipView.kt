package com.github.joaoh4547.data.model

import androidx.annotation.DrawableRes
import com.github.joaoh4547.R

enum class NearbyFilterChipView(
    val description: String,
    @DrawableRes val icon: Int
) {
    ALIMENTACAO(description = "Alimentação", icon = R.drawable.ic_tools_kitchen_2),
    COMPRAS(description = "Compras", icon = R.drawable.ic_shopping_bag),
    HOSPEDAGEM(description = "Hospedagem", icon = R.drawable.ic_bed),
    SUPERMERCADO(description = "Supermercado", icon = R.drawable.ic_shopping_cart),
    ENTRATERIMENTO(description = "Cinema", icon = R.drawable.ic_movie),
    FARMACIA(description = "Farmacia", icon = R.drawable.ic_first_aid_kit),
    COMBUSIVEL(description = "Combustivel", icon = R.drawable.ic_gas_station),
    PADARIA(description = "Padaria", icon = R.drawable.ic_bakery);

    companion object {
        fun fromDescription(description: String): NearbyFilterChipView? {
            return entries.find { it.description == description }
        }
    }
}