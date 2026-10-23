package org.example;

/**
 * Performs integer arithmetic.
 */
public class Calculator {

    /**
     * Returns the sum of two integers.
     *
     * @param x first value
     * @param y second value
     * @return x + y
     */
    public int sum(int x, int y) {
        return x + y;
    }

    /**
     * Returns the difference of two integers.
     *
     * @param x value to subtract from
     * @param y value to subtract
     * @return x - y
     */
    public int subtract(int x, int y) {
        return x - y;
    }

    /**
     * Returns the product of two integers.
     *
     * @param x first value
     * @param y second value
     * @return x * y
     */
    public int multiply(int x, int y) {
        return x * y;
    }

    /**
     * Returns the integer quotient of two integers. The result is truncated toward zero.
     *
     * @param x dividend
     * @param y divisor
     * @return x / y
     * @throws ArithmeticException if y is zero
     */
    public int divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    }
}
