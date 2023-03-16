package com.globalfsm.features.location.api

import com.globalfsm.features.location.shopdurationapi.ShopDurationApi
import com.globalfsm.features.location.shopdurationapi.ShopDurationRepository


object LocationRepoProvider {
    fun provideLocationRepository(): LocationRepo {
        return LocationRepo(LocationApi.create())
    }
}