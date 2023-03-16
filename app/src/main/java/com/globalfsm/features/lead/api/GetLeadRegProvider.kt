package com.globalfsm.features.lead.api

import com.globalfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.globalfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}