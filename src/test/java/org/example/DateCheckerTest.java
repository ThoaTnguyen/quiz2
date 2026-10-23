package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DateCheckerTest {

    @Test
    void januaryHas31Days() {
        DateChecker checker = new DateChecker();

        assertTrue(checker.has31Days(Month.JANUARY), "January has 31 days");
    }

    @Test
    void aprilDoesNotHave31Days() {
        DateChecker checker = new DateChecker();

        assertFalse(checker.has31Days(Month.APRIL), "April does not have 31 days");
    }
}
