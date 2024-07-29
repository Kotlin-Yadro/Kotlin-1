package ru.otus.homework

fun main() {
    println(sumOrThrow(-1, -2)) // IllegalArgumentException: Only positive numbers are allowed
    println(sumOrThrow(Int.MAX_VALUE, Int.MAX_VALUE)) // IllegalStateException: Sum overflow
}

fun sumOrThrow(a: Int, b: Int): Int {
    if (a < 0 || b < 0) {
        throw IllegalArgumentException("Only positive numbers are allowed")
    }
    val sum = a + b
    if (sum < 0) {
        throw IllegalStateException("Sum overflow")
    }
    return sum
}


fun joinStrings(a: String, b: String): String {
    return a + b
}