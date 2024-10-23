package com.breezefieldaereo.features.orderList.model

import com.breezefieldaereo.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}