package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void sumOfPositiveNumbers() {
        assertEquals(5, calculator.sum(2, 3), "2 + 3");
    }

    @Test
    void sumOfNegativeNumbers() {
        assertEquals(-5, calculator.sum(-4, -1), "-4 + -1");
    }

    @Test
    void sumWithZero() {
        assertEquals(0, calculator.sum(-2, 2), "-2 + 2");
    }

    @Test
    void subtractPositiveResult() {
        assertEquals(5, calculator.subtract(9, 4), "9 - 4");
    }

    @Test
    void subtractNegativeResult() {
        assertEquals(-5, calculator.subtract(2, 7), "2 - 7");
    }
}
