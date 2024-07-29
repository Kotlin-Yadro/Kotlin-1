package ru.otus.homework

import kotlin.random.Random

fun main() {
    var x = 10
    var y: Int = -1

    loop1@ while (x > 0) { // Метка loop1
        x--
        y = 10
        while (y > 0) {
            y--
            if (Random.nextBoolean()) {
                continue@loop1 // Продолжение по метке loop1
            }
        }
    }
    println("x = $x, y = $y") // x = 0, y = 7
}


fun joinStrings(a: String, b: String): String {
    return a + b
}