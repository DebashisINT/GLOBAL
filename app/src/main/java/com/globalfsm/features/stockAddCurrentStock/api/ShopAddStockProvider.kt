package com.globalfsm.features.stockAddCurrentStock.api

import com.globalfsm.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.globalfsm.features.location.shopRevisitStatus.ShopRevisitStatusRepository

object ShopAddStockProvider {
    fun provideShopAddStockRepository(): ShopAddStockRepository {
        return ShopAddStockRepository(ShopAddStockApi.create())
    }
}