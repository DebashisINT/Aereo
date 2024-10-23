package com.breezefieldaereo.features.viewAllOrder.interf

import com.breezefieldaereo.app.domain.NewOrderColorEntity
import com.breezefieldaereo.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}