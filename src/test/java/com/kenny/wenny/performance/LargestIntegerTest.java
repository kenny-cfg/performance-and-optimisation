package com.kenny.wenny.performance;

import lombok.val;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestIntegerTest {
    @Test
    void worksWithSingleNumber() {
        int[] source = {0};
        val expected = 0;

        val result = new LargestInteger().findLargest(source);

        assertEquals(expected, result);
    }

    @Test
    void worksWithMultipleNumbers() {
        int[] source = {12, 456, 7, -9};
        val expected = 456;

        val result = new LargestInteger().findLargest(source);

        assertEquals(expected, result);
    }

    @Test
    void worksWithEmptyArray() {
        int[] source = {};

        val result = new LargestInteger().findLargest(source);

        assertNull(result);
    }
}