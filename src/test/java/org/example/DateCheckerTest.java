package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DateCheckerTest {

    @Test
    void januaryHas31Days() {
        DateChecker checker = new DateChecker();

        assertTrue(checker.has31Days(Month.JANUARY), "January has 31 days");
    }
}
