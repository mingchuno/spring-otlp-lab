package dev.mcor.springotlplab

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController(private val greetingService: GreetingService) {

    @GetMapping("/greeting")
    fun greeting(@RequestParam who: String): String {
        return greetingService.greeting(who)
    }
}
