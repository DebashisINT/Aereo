package com.breezefieldaereo.features.login.model.opportunitymodel

import com.breezefieldaereo.app.domain.OpportunityStatusEntity
import com.breezefieldaereo.app.domain.ProductListEntity
import com.breezefieldaereo.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}