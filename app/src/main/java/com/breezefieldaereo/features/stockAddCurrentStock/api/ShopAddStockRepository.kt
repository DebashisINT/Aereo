package com.breezefieldaereo.features.stockAddCurrentStock.api

import com.breezefieldaereo.base.BaseResponse
import com.breezefieldaereo.features.location.model.ShopRevisitStatusRequest
import com.breezefieldaereo.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.breezefieldaereo.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.breezefieldaereo.features.stockAddCurrentStock.model.CurrentStockGetData
import com.breezefieldaereo.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}