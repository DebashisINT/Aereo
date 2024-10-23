package com.breezefieldaereo.features.viewAllOrder.orderOptimized

import com.breezefieldaereo.app.domain.ProductOnlineRateTempEntity
import com.breezefieldaereo.base.BaseResponse
import com.breezefieldaereo.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}