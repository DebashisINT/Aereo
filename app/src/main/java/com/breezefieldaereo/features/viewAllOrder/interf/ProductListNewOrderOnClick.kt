package com.breezefieldaereo.features.viewAllOrder.interf

import com.breezefieldaereo.app.domain.NewOrderGenderEntity
import com.breezefieldaereo.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}