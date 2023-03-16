package com.globalfsm.features.stockCompetetorStock.api

import com.globalfsm.base.BaseResponse
import com.globalfsm.features.orderList.model.NewOrderListResponseModel
import com.globalfsm.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.globalfsm.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}