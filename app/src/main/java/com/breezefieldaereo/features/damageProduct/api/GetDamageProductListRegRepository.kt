package com.breezefieldaereo.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.breezefieldaereo.app.FileUtils
import com.breezefieldaereo.base.BaseResponse
import com.breezefieldaereo.features.NewQuotation.model.*
import com.breezefieldaereo.features.addshop.model.AddShopRequestData
import com.breezefieldaereo.features.addshop.model.AddShopResponse
import com.breezefieldaereo.features.damageProduct.model.DamageProductResponseModel
import com.breezefieldaereo.features.damageProduct.model.delBreakageReq
import com.breezefieldaereo.features.damageProduct.model.viewAllBreakageReq
import com.breezefieldaereo.features.login.model.userconfig.UserConfigResponseModel
import com.breezefieldaereo.features.myjobs.model.WIPImageSubmit
import com.breezefieldaereo.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}