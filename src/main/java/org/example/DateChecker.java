package org.example;

/**
 * Answers calendar questions about a month.
 */
public class DateChecker {

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
        return month == Month.JANUARY
                || month == Month.MARCH
                || month == Month.MAY
                || month == Month.JULY
                || month == Month.AUGUST
                || month == Month.OCTOBER
                || month == Month.DECEMBER;
    }
}
