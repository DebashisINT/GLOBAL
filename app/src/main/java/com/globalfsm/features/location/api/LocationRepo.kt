package com.globalfsm.features.location.api

import com.globalfsm.app.Pref
import com.globalfsm.base.BaseResponse
import com.globalfsm.features.location.model.AppInfoInputModel
import com.globalfsm.features.location.model.AppInfoResponseModel
import com.globalfsm.features.location.model.GpsNetInputModel
import com.globalfsm.features.location.model.ShopDurationRequest
import com.globalfsm.features.location.shopdurationapi.ShopDurationApi
import io.reactivex.Observable

/**
 * Created by Saikat on 17-Aug-20.
 */
class LocationRepo(val apiService: LocationApi) {
    fun appInfo(appInfo: AppInfoInputModel?): Observable<BaseResponse> {
        return apiService.submitAppInfo(appInfo)
    }

    fun getAppInfo(): Observable<AppInfoResponseModel> {
        return apiService.getAppInfo(Pref.session_token!!, Pref.user_id!!)
    }

    fun gpsNetInfo(appInfo: GpsNetInputModel?): Observable<BaseResponse> {
        return apiService.submitGpsNetInfo(appInfo)
    }
}