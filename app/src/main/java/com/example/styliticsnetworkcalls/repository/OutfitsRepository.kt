package com.example.styliticsnetworkcalls.repository

import com.example.example.OutfitItems
import com.example.styliticsnetworkcalls.network.NetworkResponse
import com.example.styliticsnetworkcalls.network.RetrofitBuilder

class OutfitsRepository {

            suspend fun getOutfits(): NetworkResponse<List<OutfitItems>> {

            val map = mapOf<String,Any>("total" to 3, "username" to "demo" , "item_number" to 389998022)

            //Outfit Network call
            val result = RetrofitBuilder.networkRequest.outfits(map)

            return result
    }
}