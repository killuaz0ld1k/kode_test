package com.example.test.data.remote.dto

import com.google.gson.annotations.SerializedName

data class WorkerDto(
    @SerializedName("id") val workerId: String? = null,
    val avatarUrl: String? = null,
    val firstName: String? = null,
    val lastName: String? = null,
    val userTag: String? = null,
    val department: String? = null,
    val position: String? = null,
    val birthday: String? = null,
    val phone: String? = null
)
