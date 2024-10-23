package com.breezefieldaereo.features.viewAllOrder.interf

import com.breezefieldaereo.app.domain.NewOrderGenderEntity
import com.breezefieldaereo.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}