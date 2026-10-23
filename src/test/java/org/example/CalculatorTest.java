package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    void multiplyPositiveNumbers() {
        assertEquals(12, calculator.multiply(4, 3), "4 * 3");
    }

    @Test
    void multiplyNegativeNumber() {
        assertEquals(-6, calculator.multiply(-2, 3), "-2 * 3");
    }

    @Test
    void multiplyByZero() {
        assertEquals(0, calculator.multiply(5, 0), "5 * 0");
    }

    @Test
    void dividePositiveNumbers() {
        assertEquals(5, calculator.divide(10, 2), "10 / 2");
    }

    @Test
    void divideTruncatesTowardZero() {
        assertEquals(2, calculator.divide(7, 3), "7 / 3");
    }

    @Test
    void divideNegativeNumber() {
        assertEquals(-4, calculator.divide(-8, 2), "-8 / 2");
    }

    @Test
    void divideByZeroThrows() {
        Exception exception = assertThrows(ArithmeticException.class,
                () -> calculator.divide(10, 0),
                "Division by zero is invalid");
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void evenValueReturnsTrue() {
        assertTrue(calculator.isEven(2), "2 is even");
    }

    @Test
    void zeroIsEven() {
        assertTrue(calculator.isEven(0), "0 is even");
    }

    @Test
    void negativeEvenValueReturnsTrue() {
        assertTrue(calculator.isEven(-4), "-4 is even");
    }

    @Test
    void oddValueReturnsFalse() {
        assertFalse(calculator.isEven(3), "3 is odd");
    }

    @Test
    void negativeOddValueReturnsFalse() {
        assertFalse(calculator.isEven(-5), "-5 is odd");
    }
}
