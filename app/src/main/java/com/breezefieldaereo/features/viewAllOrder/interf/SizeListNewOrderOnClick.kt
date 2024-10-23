package com.breezefieldaereo.features.viewAllOrder.interf

import com.breezefieldaereo.app.domain.NewOrderProductEntity
import com.breezefieldaereo.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}