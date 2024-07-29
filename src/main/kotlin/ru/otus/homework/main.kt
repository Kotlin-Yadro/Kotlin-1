package ru.otus.homework

import kotlin.random.Random

fun main() {
    val a: String = when(Random.nextInt(0, 5)) {
        0 -> "Hello"
        in 3 .. 4 -> "World"
        else -> "!"
    }
    println(a)
}

fun joinStrings(a: String, b: String): String {
    return a + b
}