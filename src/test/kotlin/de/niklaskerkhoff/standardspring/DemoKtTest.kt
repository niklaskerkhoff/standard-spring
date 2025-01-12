package de.niklaskerkhoff.standardspring

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DemoKtTest {
    @Test
    fun `it should return Hello World!`() {
        val actual = helloWorld()
        assertEquals("Hello World!", actual)
    }
}
