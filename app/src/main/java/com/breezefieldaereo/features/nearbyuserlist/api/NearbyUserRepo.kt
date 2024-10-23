package com.breezefieldaereo.features.nearbyuserlist.api

import com.breezefieldaereo.app.Pref
import com.breezefieldaereo.features.nearbyuserlist.model.NearbyUserResponseModel
import com.breezefieldaereo.features.newcollection.model.NewCollectionListResponseModel
import com.breezefieldaereo.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}