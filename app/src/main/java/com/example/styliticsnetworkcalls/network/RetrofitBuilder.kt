package com.example.styliticsnetworkcalls.network

import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    val networkRequest: APIService =  createRetroFit().create(APIService::class.java)

    private fun createRetroFit(): Retrofit {
        return  Retrofit.Builder()
            .baseUrl("https://widget-api.stylitics.com/")
            .addCallAdapterFactory(NetworkResponseAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
    }
}