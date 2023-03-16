package com.globalfsm.features.location.shopRevisitStatus

import com.globalfsm.base.BaseResponse
import com.globalfsm.features.location.model.ShopDurationRequest
import com.globalfsm.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}