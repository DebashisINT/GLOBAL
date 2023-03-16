package com.globalfsm.features.nearbyuserlist.api

import com.globalfsm.app.Pref
import com.globalfsm.features.nearbyuserlist.model.NearbyUserResponseModel
import com.globalfsm.features.newcollection.model.NewCollectionListResponseModel
import com.globalfsm.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}