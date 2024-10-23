package com.breezefieldaereo.features.viewAllOrder.interf

import com.breezefieldaereo.app.domain.NewOrderGenderEntity
import com.breezefieldaereo.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}