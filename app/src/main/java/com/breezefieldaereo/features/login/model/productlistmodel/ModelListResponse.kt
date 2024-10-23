package com.breezefieldaereo.features.login.model.productlistmodel

import com.breezefieldaereo.app.domain.ModelEntity
import com.breezefieldaereo.app.domain.ProductListEntity
import com.breezefieldaereo.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}