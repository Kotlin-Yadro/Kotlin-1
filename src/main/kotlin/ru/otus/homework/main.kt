package ru.otus.homework

fun main() {
    println(joinStrings("Hello, ", "World!"))
}

fun joinStrings(a: String, b: String): String {
    return a + b
}