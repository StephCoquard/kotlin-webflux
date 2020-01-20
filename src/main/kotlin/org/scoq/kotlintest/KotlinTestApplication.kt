package org.scoq.kotlintest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinTestApplication

fun main(args: Array<String>) {
    runApplication<KotlinTestApplication>(*args)
}
