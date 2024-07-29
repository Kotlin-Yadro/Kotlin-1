package ru.otus.homework

import kotlin.random.Random

fun main() {
    var a: String = "Hello"
    when(Random.nextInt(0, 5)) {
        0 -> a = "Hello"
        in 3 .. 4 -> a = "World"
    }
    println(a)
}

fun joinStrings(a: String, b: String): String {
    return a + b
}