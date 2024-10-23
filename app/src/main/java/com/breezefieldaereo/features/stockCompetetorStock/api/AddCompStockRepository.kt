package com.breezefieldaereo.features.stockCompetetorStock.api

import com.breezefieldaereo.base.BaseResponse
import com.breezefieldaereo.features.orderList.model.NewOrderListResponseModel
import com.breezefieldaereo.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldaereo.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}