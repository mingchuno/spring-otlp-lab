package dev.mcor.springotlplab

import io.opentelemetry.instrumentation.annotations.SpanAttribute
import io.opentelemetry.instrumentation.annotations.WithSpan
import org.springframework.stereotype.Component

interface GreetingService {
    fun greeting(who: String): String
}

@Component
class GreetingServiceImpl(private val echoClient: EchoClient) : GreetingService {
    @WithSpan
    override fun greeting(@SpanAttribute who: String): String {
        return echoClient.echo()
    }
}
