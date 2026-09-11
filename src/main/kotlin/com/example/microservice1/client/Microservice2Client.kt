package com.example.microservice1.client

import io.ktor.client.*
import io.ktor.client.engine.apache.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class Microservice2Client {
    private val client = HttpClient(Apache)

    suspend fun getMicroservice2Status(): String {
        return client.get<String>("http://localhost:8081/")
    }
}