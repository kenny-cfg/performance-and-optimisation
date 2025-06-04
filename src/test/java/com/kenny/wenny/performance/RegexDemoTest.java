package com.kenny.wenny.performance;

import lombok.val;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RegexDemoTest {
    @ParameterizedTest
    @ValueSource(strings = {
            "Here 1234567890 is a string with 10 digits.",
            "This string has 0987654321, but it's 11 digits!"
    })
    void testMatchingString(String input) {
        val result = new RegexDemo().contains10DigitNumber(input);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "This is a string without digits.",
            "Another string, no numbers here!",
            "Product ID: ABC123456",
    })
    void testNonMatchingString(String input) {
        val result = new RegexDemo().contains10DigitNumber(input);

        assertFalse(result);
    }

}