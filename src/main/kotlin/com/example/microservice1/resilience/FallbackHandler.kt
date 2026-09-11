package com.example.microservice1.resilience

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker

class FallbackHandler {
    @CircuitBreaker(name = "microservice2", fallbackMethod = "fallback")
    suspend fun callMicroservice2(): String {
        // Simulate a call to microservice 2
        throw Exception("Microservice 2 is down")
    }
    suspend fun fallback(throwable: Throwable): String {
        return "Microservicio 2 no está disponible"
    }
}