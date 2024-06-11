package com.example.test.data.remote.dto

import com.google.gson.annotations.SerializedName

data class ListWorkersDto (
    @SerializedName("items") val listWorkers: List<WorkerDto>
)