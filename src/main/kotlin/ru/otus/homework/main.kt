package ru.otus.homework

fun main() {
    val ints = arrayOf(1, 2, 3, 4, 5)
    for (i in 0 until ints.size) {
        println("index: $i, value: ${ints[i]}")
    }
}

fun joinStrings(a: String, b: String): String {
    return a + b
}