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
                break@loop1 // Прерывание по метке loop1
            }
        }
    }
    println("x = $x, y = $y") // x = 9, y = 8
}


fun joinStrings(a: String, b: String): String {
    return a + b
}