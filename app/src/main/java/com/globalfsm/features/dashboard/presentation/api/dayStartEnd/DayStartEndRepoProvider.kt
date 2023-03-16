package com.globalfsm.features.dashboard.presentation.api.dayStartEnd

import com.globalfsm.features.stockCompetetorStock.api.AddCompStockApi
import com.globalfsm.features.stockCompetetorStock.api.AddCompStockRepository

object DayStartEndRepoProvider {
    fun dayStartRepositiry(): DayStartEndRepository {
        return DayStartEndRepository(DayStartEndApi.create())
    }

}