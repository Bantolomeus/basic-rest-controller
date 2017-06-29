package com.bantolomeus

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BasicRestControllerApplication

fun main(args: Array<String>) {
    SpringApplication.run(BasicRestControllerApplication::class.java, *args)
}
