package ru.otus.homework

import ru.otus.homework.vasya.MyClass as FromVasya
import ru.otus.homework.petya.MyClass as FromPetya

fun main() {
    println("From Vasya: ${FromVasya()}")
    println("From Petya: ${FromPetya()}")
}