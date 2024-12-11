package com.github.joaoh4547.ui.components.market_details

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.github.joaoh4547.data.model.Market
import com.github.joaoh4547.ui.theme.Gray400
import com.github.joaoh4547.ui.theme.Typography
import com.github.joaoh4547.R
import com.github.joaoh4547.data.model.mock.mockMarkets
import com.github.joaoh4547.ui.theme.Gray500

@Composable
fun NearbyMarketDetailsInfo(modifier: Modifier = Modifier, market: Market) {
    Column(modifier, verticalArrangement = Arrangement.spacedBy(16.dp)) {
        Text(text = "Informações", style = Typography.headlineSmall, color = Gray400)
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(R.drawable.ic_ticket),
                    tint = Gray500,
                    contentDescription = "Ícone Cupons"
                )
                Text(
                    text = "${market.coupons} cupons disponíveis",
                    color = Gray500,
                    style = Typography.labelMedium
                )
            }

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(R.drawable.ic_map_pin),
                    tint = Gray500,
                    contentDescription = "Ícone Endereço"
                )
                Text(text = market.address, color = Gray500, style = Typography.labelMedium)
            }

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(R.drawable.ic_phone),
                    tint = Gray500,
                    contentDescription = "Ícone Telefone"
                )
                Text(text = market.phone, color = Gray500, style = Typography.labelMedium)
            }
        }
    }
}

@Preview
@Composable
private fun MarketDetailsInfoPreview() {
    NearbyMarketDetailsInfo(modifier = Modifier.fillMaxWidth(), market = mockMarkets.first())
}