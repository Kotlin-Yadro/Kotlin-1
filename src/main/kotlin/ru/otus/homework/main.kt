package ru.otus.homework

fun main() {
    var a = 1
    if (true) { // if-else - это управляющая констукция
        a = 2
    } else {
        println("This will never be printed")
    }
    a = max(5, 3)
}

fun max(a: Int, b: Int): Int {
    val max = if (a > b) a else b // if-else - это выражение
    println("Max of $a and $b is $max")
    return max
}

fun joinStrings(a: String, b: String): String {
    return a + b
}