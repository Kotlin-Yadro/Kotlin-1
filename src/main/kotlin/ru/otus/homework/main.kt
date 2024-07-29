package ru.otus.homework

fun main() {
    val ints = arrayOf(1, 2, 3, 4, 5)
    for ((i, v) in ints.withIndex()) { // Перебор массива с индексами
        println("index: $i, value: $v")                     // index: 0, value: 1
    }
}

fun joinStrings(a: String, b: String): String {
    return a + b
}