package Arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {
    Array array = new Array();

    @Test
    void arithmeticAverageTest() {
        double[] input = {1, 1};
        assertEquals(1, array.arithmeticAverage(input));
    }

    @Test
    void arithmeticAverageWithNegativeTest() {
        double[] input = {-3, 7, -8, 0};
        assertEquals(-1, array.arithmeticAverage(input));
    }

    @Test
    void arithmeticAverageWithEmptyArrayTest() {
        double[] input = {};
        assertEquals(0, array.arithmeticAverage(input));
    }

    @Test
    void arithmeticAverageComplexTest() {
        double[] input = {88, 123, 9123, 55, 76};
        assertEquals(((88 + 123 + 9123 + 55 + 76)/ input.length), array.arithmeticAverage(input));
    }
}