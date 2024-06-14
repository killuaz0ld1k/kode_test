package com.example.test.retrofit

import com.example.test.data.remote.api.WorkersApi
import com.example.test.data.remote.retrofit.RetrofitBuilder
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test

class RetrofitTest {

    private lateinit var mockWebServer: MockWebServer
    private lateinit var api: WorkersApi
    @Before
    fun setup() {
        mockWebServer = MockWebServer()
        mockWebServer.start()

        api = RetrofitBuilder().createApi("https://stoplight.io/mocks/kode-api/trainee-test/331141861/")
    }
    @After
    fun teardown() {
        mockWebServer.shutdown()
    }

    @Test
    fun retrofitTest() = runBlocking {
        val mockResponse = MockResponse()
            .setBody("[{\"id\": 1, \"name\": \"John Doe\"}, {\"id\": 2, \"name\": \"Jane Smith\"}]")
            .setResponseCode(200)
        mockWebServer.enqueue(mockResponse)
        val response = api.loadWorkers()
        println(response)
    }
}