package com.dina.idnnews.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object ApiConfig {

    const val baseUrl = "http://192.168.33.218/api_blog_idn/"

    fun getRetrofit() : Retrofit{
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

    fun getService() : ApiService{
        return getRetrofit().create(ApiService::class.java)
    }


}