package ru.otus.homework

fun main() {
    val a1 = Array(5) { i: Int -> i + 1 }
    println("Array contents: ${a1.joinToString()}")
}

fun joinStrings(a: String, b: String): String {
    return a + b
}