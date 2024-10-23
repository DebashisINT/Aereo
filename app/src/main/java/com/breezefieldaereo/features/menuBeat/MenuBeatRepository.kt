package com.breezefieldaereo.features.menuBeat

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldaereo.app.FileUtils
import com.breezefieldaereo.app.Pref
import com.breezefieldaereo.base.BaseResponse
import com.breezefieldaereo.features.addshop.model.*
import com.breezefieldaereo.features.addshop.model.assigntopplist.AddShopUploadImg
import com.breezefieldaereo.features.addshop.model.assigntopplist.AddshopImageMultiReqbody1
import com.breezefieldaereo.features.addshop.presentation.ShopListSubmitResponse
import com.breezefieldaereo.features.addshop.presentation.multiContactRequestData
import com.breezefieldaereo.features.beatCustom.BeatGetStatusModel
import com.breezefieldaereo.features.dashboard.presentation.DashboardActivity
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by saheli on 16-12-2023.
 */
class MenuBeatRepository(val apiService: MenuBeatApi) {

    fun currentTabMenubeat(sessiontoken: String, user_id: String, beat_id: String): Observable<MenuBeatResponse> {
        return apiService.getCurrentTabData(user_id,sessiontoken,beat_id)
    }
    fun hirerchyTabMenubeat(sessiontoken: String, user_id: String): Observable<MenuBeatAreaRouteResponse> {
        return apiService.getHirerchyTabData(user_id,sessiontoken)
    }

}