package dev.mcor.springotlplab

import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.getForObject

interface EchoClient {
    fun echo(): String
}

@Component
class EchoClientImpl(private val restTemplate: RestTemplate) : EchoClient {
    override fun echo(): String {
        return restTemplate.getForObject("https://postman-echo.com/get")
    }
}
