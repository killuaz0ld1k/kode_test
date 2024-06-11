package com.example.test.data.remote.retrofit

import com.example.test.data.remote.api.WorkersApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilder {
    fun createApi(baseUrl : String): WorkersApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(WorkersApi::class.java)
    }
}