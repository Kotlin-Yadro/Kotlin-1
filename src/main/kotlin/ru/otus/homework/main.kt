package ru.otus.homework

fun main() {
    val ints = arrayOf(1, 2, 3, 4, 5)
    for (i: Int in ints) { // Перебор массива
        println(i)         // Вывод элемента массива
    }
}

fun joinStrings(a: String, b: String): String {
    return a + b
}