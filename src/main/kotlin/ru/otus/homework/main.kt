package ru.otus.homework

fun main() {
    val a1 = arrayOf(1, 2, 3, 4, 5)   // Создание массива из 5 произвольных элементов
    println("Array size: " + a1.size) // Array size: 5
    println("Element 0: " + a1[0])    // Element 0: 1
    a1[0] = 100                       // Изменение элемента массива
    println("Element 0: " + a1[0])    // Element 0: 100
}

fun joinStrings(a: String, b: String): String {
    return a + b
}