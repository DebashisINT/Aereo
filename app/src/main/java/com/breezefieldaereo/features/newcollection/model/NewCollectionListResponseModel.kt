package com.breezefieldaereo.features.newcollection.model

import com.breezefieldaereo.app.domain.CollectionDetailsEntity
import com.breezefieldaereo.base.BaseResponse
import com.breezefieldaereo.features.shopdetail.presentation.model.collectionlist.CollectionListDataModel

/**
 * Created by Saikat on 15-02-2019.
 */
class NewCollectionListResponseModel : BaseResponse() {
    //var collection_list: ArrayList<CollectionListDataModel>? = null
    var collection_list: ArrayList<CollectionDetailsEntity>? = null
}