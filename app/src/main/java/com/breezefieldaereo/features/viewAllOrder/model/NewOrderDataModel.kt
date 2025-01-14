package com.breezefieldaereo.features.viewAllOrder.model

import com.breezefieldaereo.app.domain.NewOrderColorEntity
import com.breezefieldaereo.app.domain.NewOrderGenderEntity
import com.breezefieldaereo.app.domain.NewOrderProductEntity
import com.breezefieldaereo.app.domain.NewOrderSizeEntity
import com.breezefieldaereo.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

