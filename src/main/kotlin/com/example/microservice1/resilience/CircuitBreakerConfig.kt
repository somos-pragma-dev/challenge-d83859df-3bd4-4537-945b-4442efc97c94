package com.example.microservice1.resilience

import io.github.resilience4j.circuitbreaker.CircuitBreaker
import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry

object CircuitBreakerConfig {
    val circuitBreaker = CircuitBreaker.of("microservice2", CircuitBreakerConfig.custom()
       .failureRateThreshold(50)
       .waitDurationInOpenState(10000)
       .ringBufferSizeInHalfOpenState(10)
       .ringBufferSizeInClosedState(100)
       .build())
}