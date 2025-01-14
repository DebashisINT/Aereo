package com.breezefieldaereo.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.breezefieldaereo.app.FileUtils
import com.breezefieldaereo.app.Pref
import com.breezefieldaereo.base.BaseResponse
import com.breezefieldaereo.features.addshop.model.AddLogReqData
import com.breezefieldaereo.features.addshop.model.AddShopRequestData
import com.breezefieldaereo.features.addshop.model.AddShopResponse
import com.breezefieldaereo.features.addshop.model.LogFileResponse
import com.breezefieldaereo.features.addshop.model.UpdateAddrReq
import com.breezefieldaereo.features.contacts.CallHisDtls
import com.breezefieldaereo.features.contacts.CompanyReqData
import com.breezefieldaereo.features.contacts.ContactMasterRes
import com.breezefieldaereo.features.contacts.SourceMasterRes
import com.breezefieldaereo.features.contacts.StageMasterRes
import com.breezefieldaereo.features.contacts.StatusMasterRes
import com.breezefieldaereo.features.contacts.TypeMasterRes
import com.breezefieldaereo.features.dashboard.presentation.DashboardActivity
import com.breezefieldaereo.features.login.model.WhatsappApiData
import com.breezefieldaereo.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}