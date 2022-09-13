package com.board.kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BoardApplication

fun main(args: Array<String>) {
    runApplication<BoardApplication>(*args)
}