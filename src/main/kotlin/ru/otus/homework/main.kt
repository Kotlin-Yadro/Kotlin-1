package ru.otus.homework

fun main() {
    val a1 = arrayOf(1, 2, 3)
    val a2 = arrayOf(4, 5)
    val a3 = a1 + a2 // a3 - новый массив!
    val a4 = a3 + 6  // a4 - новый массив!
    println("Array contents: ${a4.joinToString()}")
}

fun joinStrings(a: String, b: String): String {
    return a + b
}