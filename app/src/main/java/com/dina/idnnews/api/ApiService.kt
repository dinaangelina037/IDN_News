package com.dina.idnnews.api

import com.dina.idnnews.model.ResponseNewsIdn
import retrofit2.Call
import retrofit2.http.GET




interface ApiService {

    @GET("list_artikel.php")
    fun getNewsIdn(): Call<ResponseNewsIdn>
}