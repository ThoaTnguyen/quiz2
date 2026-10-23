package org.example;

import java.util.EnumSet;
import java.util.Set;

/**
 * Answers calendar questions about a month.
 */
public class DateChecker {

    /**
     * Months with 31 days. February is absent, so {@link #has31Days(Month)} returns false for it.
     */
    private static final Set<Month> MONTHS_WITH_31_DAYS = EnumSet.of(
            Month.JANUARY,
            Month.MARCH,
            Month.MAY,
            Month.JULY,
            Month.AUGUST,
            Month.OCTOBER,
            Month.DECEMBER
    );

    /**
     * Returns whether the given month has 31 days.
     * February returns false. April, June, September, and November also return false.
     *
     * @param month month to check
     * @return true for January, March, May, July, August, October, and December
     * @throws IllegalArgumentException if month is null
     */
    public boolean has31Days(Month month) {
        if (month == null) {
            throw new IllegalArgumentException("Month must not be null");
        }
        return MONTHS_WITH_31_DAYS.contains(month);
    }
}
