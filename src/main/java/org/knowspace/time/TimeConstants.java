package org.knowspace.time;

public class TimeConstants {

    public static final double J2000_AS_JULIAN = 2451545.0;
    public static final double MJD_ZERO_AS_JULIAN = 2400000.5;
    public static final double DAYS_IN_CENTURY = 36525.0;
    public static final double DAYS_IN_CENTURY_INVERSE = 1.0 / DAYS_IN_CENTURY;
    public static final double DAYS_IN_YEAR = 365.25;
    public static final double DAYS_IN_YEAR_INVERSE = 1.0 / DAYS_IN_YEAR;
    public static final double DAYS_TO_HOURS = 24.0;
    public static final double DAYS_TO_MINUTES = 1440.0;
    public static final double DAYS_TO_SECONDS = 86400.0;
    public static final double HOURS_TO_SECONDS = 3600.0;
    public static final double MINUTES_TO_SECONDS = 60.0;
    public static final double MINUTES_TO_HOURS = 1.0/60.0;
    public static final double SECONDS_TO_HOURS = 1.0/HOURS_TO_SECONDS;
    public static final double HOURS_TO_MINUTES = 60.0;
    public static final double HOURS_TO_DAYS = 1.0/DAYS_TO_HOURS;
    public static final double MINUTES_TO_DAYS = 1.0/DAYS_TO_MINUTES;
    public static final double SECONDS_TO_DAYS = 1.0/DAYS_TO_SECONDS;
    public static final double TDT_MINUS_TAI = 32.184 * SECONDS_TO_DAYS;
    public static final double TAI_MINUS_UTC = 37.0 * SECONDS_TO_DAYS;
    public static final double TDT_MINUS_UTC = TDT_MINUS_TAI + TAI_MINUS_UTC;

    private TimeConstants(){}
}
