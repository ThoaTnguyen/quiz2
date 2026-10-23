# Quiz 2

Maven project for a JUnit 5 test-driven development, using the same setup as the Lecture 16 walkthrough: Java 14 and JUnit Jupiter 5.10.2. 
## Layout

- `src/main/java/org/example/` holds `Calculator`, `DateChecker`, and `Month`
- `src/test/java/org/example/` holds `CalculatorTest` and `DateCheckerTest`

## Run the tests

From this directory:

```
mvn test
```

In IntelliJ, open the Maven tool window and run the `test` goal. A passing run reports 32 tests and `BUILD SUCCESS`.

## Calculator

`Calculator` uses `int` values.

- `sum` returns `x + y`
- `subtract` returns `x - y`
- `multiply` returns `x * y`
- `divide` returns the integer quotient, truncated toward zero. A divisor of zero throws `ArithmeticException` with the message `Cannot divide by zero`
- `isEven` returns true for even values, including zero and negative even values, and false for odd values

## DateChecker

`Month` is an enum of the twelve calendar months. `has31Days` returns true for January, March, May, July, August, October, and December.

February returns false. It does not have 31 days. April, June, September, and November also return false.

A null month is invalid. `has31Days(null)` throws `IllegalArgumentException` with the message `Month must not be null`.

## Reflection

See `REFLECTION.md`.
