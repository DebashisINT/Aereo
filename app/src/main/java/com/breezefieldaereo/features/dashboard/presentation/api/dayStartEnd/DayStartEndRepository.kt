package com.breezefieldaereo.features.dashboard.presentation.api.dayStartEnd

import com.breezefieldaereo.app.Pref
import com.breezefieldaereo.base.BaseResponse
import com.breezefieldaereo.features.dashboard.presentation.model.DaystartDayendRequest
import com.breezefieldaereo.features.dashboard.presentation.model.StatusDayStartEnd
import com.breezefieldaereo.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.breezefieldaereo.features.stockCompetetorStock.api.AddCompStockApi
import io.reactivex.Observable

class DayStartEndRepository (val apiService: DayStartEndApi){
    fun dayStart(daystartDayendRequest: DaystartDayendRequest): Observable<BaseResponse> {
        return apiService.submitDayStartEnd(daystartDayendRequest)
    }

    fun dayStartEndStatus(date:String): Observable<StatusDayStartEnd> {
        return apiService.statusDayStartEnd(Pref.session_token!!, Pref.user_id!!,date)
    }

    fun daystartendDelete(sessionToken:String,usrID:String,date:String,dayStDel:String,dayEndDel:String): Observable<BaseResponse> {
        return apiService.submitDayStartEndDelApi(sessionToken,usrID,date,dayStDel,dayEndDel)
    }


}