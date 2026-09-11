package com.example.microservice2

import io.ktor.application.*
import io.ktor.features.*
import io.ktor.gson.*
import io.ktor.routing.*
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main() {
    embeddedServer(Netty, port = 8081) {
        install(ContentNegotiation) {
            gson {
                setPrettyPrinting()
            }
        }
        install(CallLogging)
        routing {
            get("/") {
                call.respondText("Microservicio 2 en funcionamiento")
            }
        }
    }.start(wait = true)
}