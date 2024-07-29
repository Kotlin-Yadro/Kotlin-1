package ru.otus.homework

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MainKtTest {
    @Test
    fun `joinStrings concatenates strings and returns a result`() {
        assertEquals("Hello, World!", joinStrings("Hello, ", "World!"))
    }
}