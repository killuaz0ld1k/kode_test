package com.example.test.data.remote.api

import com.example.test.data.remote.dto.ListWorkersDto
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers


interface WorkersApi {
    @GET("users")
    @Headers(
        "Accept: application/json, application/xml",
        "Prefer: code=200, dynamic=true"
    )
    suspend fun loadWorkers() : ListWorkersDto
}