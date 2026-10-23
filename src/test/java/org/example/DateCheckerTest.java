package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

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

    @ParameterizedTest
    @EnumSource(value = Month.class, names = {
            "JANUARY", "MARCH", "MAY", "JULY", "AUGUST", "OCTOBER", "DECEMBER"
    })
    void monthsWith31Days(Month month) {
        DateChecker checker = new DateChecker();

        assertTrue(checker.has31Days(month), month + " has 31 days");
    }
}
