package com.example.styliticsnetworkcalls.network

import com.example.example.OutfitItems
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface APIService {

    @GET("api/outfits")
    @JvmSuppressWildcards
    suspend fun outfits(@QueryMap param:Map<String,Any>
    ): NetworkResponse<List<OutfitItems>>

}