package ru.otus.homework

enum class TestEnum {
    HELLO,
    WORLD
}

fun main() {
    // r может принимать значения только из TestEnum
    val r: TestEnum = TestEnum.entries.random()
    // when знает обо всех значениях TestEnum
    var a: String = when (r) {
        TestEnum.HELLO -> "Hello"
        TestEnum.WORLD -> "World"
    }
}

fun joinStrings(a: String, b: String): String {
    return a + b
}