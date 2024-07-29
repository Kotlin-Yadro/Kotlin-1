package ru.otus.homework

import kotlin.random.Random

fun main() {
    var x = 10
    while (x > 0) { // Сначала проверяем условие, потом выполняем тело цикла
        x--
    }

    do { // Сначала выполняется тело цикла, потом проверяется условие
        val y = retrieveData()
    } while (y != null) // y не видна за пределами цикла
}

fun retrieveData(): String? {
    return if (Random.nextBoolean()) "data" else null
}

fun joinStrings(a: String, b: String): String {
    return a + b
}