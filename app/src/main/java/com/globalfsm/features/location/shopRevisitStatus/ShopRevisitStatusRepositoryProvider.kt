package com.globalfsm.features.location.shopRevisitStatus

import com.globalfsm.features.location.shopdurationapi.ShopDurationApi
import com.globalfsm.features.location.shopdurationapi.ShopDurationRepository

object ShopRevisitStatusRepositoryProvider {
    fun provideShopRevisitStatusRepository(): ShopRevisitStatusRepository {
        return ShopRevisitStatusRepository(ShopRevisitStatusApi.create())
    }
}