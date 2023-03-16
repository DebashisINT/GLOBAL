package com.globalfsm.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.globalfsm.app.FileUtils
import com.globalfsm.base.BaseResponse
import com.globalfsm.features.NewQuotation.model.*
import com.globalfsm.features.addshop.model.AddShopRequestData
import com.globalfsm.features.addshop.model.AddShopResponse
import com.globalfsm.features.damageProduct.model.DamageProductResponseModel
import com.globalfsm.features.damageProduct.model.delBreakageReq
import com.globalfsm.features.damageProduct.model.viewAllBreakageReq
import com.globalfsm.features.login.model.userconfig.UserConfigResponseModel
import com.globalfsm.features.myjobs.model.WIPImageSubmit
import com.globalfsm.features.photoReg.model.*
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