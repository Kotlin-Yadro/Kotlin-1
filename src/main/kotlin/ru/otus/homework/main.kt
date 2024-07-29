package ru.otus.homework

fun main() {
    var a = 1
    a = 2 + 3
    a = someInt()
}

fun someInt(): Int {
    return 100500
}

fun joinStrings(a: String, b: String): String {
    return a + b
}