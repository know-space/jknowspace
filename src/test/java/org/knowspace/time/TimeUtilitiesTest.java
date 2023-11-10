package org.knowspace.time;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TimeUtilitiesTest {
    
    @Test
    public void testConvertJulianToString()
    {
        String date = TimeUtilities.jdToString(2460250.0);
        assertEquals("2023-11-01T12:00:00.000000Z", date);
    }

    @Test
    public void testConvertDayToHourMinuteMicrosecond()
    {
        int[] hms = TimeUtilities.dayToHourMinuteMicrosecond(.54284);
        assertEquals(13, hms[0]);
        assertEquals(1, hms[1]);
        assertEquals(41376000, hms[2]);
    }

    @Test
    public void testConvertHourMinuteSecondToDay()
    {
        double day = TimeUtilities.hourMinuteSecondToDay(13, 1, 41.376);
        assertEquals(.54284, day, 1e-6);
    }

    @Test
    public void testConvertDayToTimeString()
    {
        String time = TimeUtilities.dayToTimeString(.54284);
        assertEquals("13:01:41.376000", time);
    }

    @Test
    public void testConvertDateTimeValuesToMJD()
    {
        double mjd = TimeUtilities.dateTimeValuesToMJD(2023, 11, 1, 12, 42, 8.0);
        assertEquals(60249.52925925926, mjd, 1e-6);
    }

    @Test
    public void testConvertStringToDateTimeArray()
    {
        String[] dt = TimeUtilities.stringToDateTimeArray("2023-11-01T12:42:08.000000Z");
        assertEquals("2023", dt[0]);
        assertEquals("11", dt[1]);
        assertEquals("01", dt[2]);
        assertEquals("12", dt[3]);
        assertEquals("42", dt[4]);
        assertEquals("08.000000", dt[5]);
    }

    @Test
    public void testConvertModifiedJulianToString()
    {
        String date = TimeUtilities.mjdToString(60249.52925925926);
        assertEquals("2023-11-01T12:42:08.000000Z", date);
    }

    @Test
    public void testConvertStringToMJD()
    {
        double mjd = TimeUtilities.stringToMJD("2023-11-01T12:42:08.000000Z");
        assertEquals(60249.52925925926, mjd, 1e-6);
    }

    @Test
    public void testGetLeapSeconds()
    {
        //TODO:  Update this test when the leap second table is updated
        double ls = TimeUtilities.getLeapSeconds(60249.52925925926);
        assertEquals(37, ls, 1e-6);
    }
}
