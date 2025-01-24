package org.example.sandbox.hello.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmTest {

    @Test
    void testFibonacci() {
        assertEquals(0, Algorithm.fibonacci(0));
        assertEquals(1, Algorithm.fibonacci(1));
        assertEquals(1, Algorithm.fibonacci(2));
        assertEquals(2, Algorithm.fibonacci(3));
        assertEquals(3, Algorithm.fibonacci(4));
        assertEquals(5, Algorithm.fibonacci(5));
        assertEquals(8, Algorithm.fibonacci(6));
        assertEquals(13, Algorithm.fibonacci(7));
        assertEquals(21, Algorithm.fibonacci(8));
        assertEquals(34, Algorithm.fibonacci(9));
        assertEquals(55, Algorithm.fibonacci(10));
    }

    @Test
    void testFibonacciReccursive() {
        assertEquals(0, Algorithm.fibonacciReccursive(0));
        assertEquals(1, Algorithm.fibonacciReccursive(1));
        assertEquals(1, Algorithm.fibonacciReccursive(2));
        assertEquals(2, Algorithm.fibonacciReccursive(3));
        assertEquals(3, Algorithm.fibonacciReccursive(4));
        assertEquals(5, Algorithm.fibonacciReccursive(5));
        assertEquals(8, Algorithm.fibonacciReccursive(6));
        assertEquals(13, Algorithm.fibonacciReccursive(7));
        assertEquals(21, Algorithm.fibonacciReccursive(8));
        assertEquals(34, Algorithm.fibonacciReccursive(9));
        assertEquals(55, Algorithm.fibonacciReccursive(10));
    }

    @Test
    void testFibonacciNegative() {
        assertThrows(IllegalArgumentException.class, () -> Algorithm.fibonacci(-1));
    }

    @Test
    void testFibonacciReccursiveNegative() {
        assertThrows(IllegalArgumentException.class, () -> Algorithm.fibonacciReccursive(-1));
    }
}

