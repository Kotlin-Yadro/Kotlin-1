package ru.otus.homework

fun main() {
    val a: Int = 1             // Сразу указываем тип
    val b = 2                  // Тип `Int` угадывается из контекста
    val c: Int                 // Тип `Int` необходимо указать при отложенном присваивании
    c = 3                      // Отложенное присваивание
    val d = sum(a, b)          // Вызов функции и присваивание результата
    val (e, f) = arrayOf(5, 6) // Деструктуризация массива
}

fun sum(a: Int, b: Int): Int = a + b

fun joinStrings(a: String, b: String): String {
    return a + b
}