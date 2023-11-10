package org.knowspace.time;

public class TimeUtilities 
{
    
    /**
     * This method converts decimal of day to hours, minutes, and microseconds
     * @param decimalDay    decimal of day
     * @return              array of integers of the form {hours, minutes, microseconds}
     */
    public static int[] dayToHourMinuteMicrosecond(double decimalDay)
    {
    
        int hours = (int) (decimalDay*TimeConstants.DAYS_TO_HOURS);
        double decimalHours = decimalDay*TimeConstants.DAYS_TO_HOURS - hours;
        int minutes = (int) (decimalHours*TimeConstants.HOURS_TO_MINUTES);
        double decimalMinutes = decimalHours*TimeConstants.HOURS_TO_MINUTES - minutes;
        double microsecs = decimalMinutes*TimeConstants.MINUTES_TO_SECONDS*1e6;

        int[] hms = {hours, minutes, (int) Math.round(microsecs)};
        
        return hms;
    }

    /**
     * This method converts decimal of day to a string of the form hh:mm:ss.ssssss
     * @param decimalDay    decimal of day
     * @return              string of the form hh:mm:ss.ssssss
     */
    public static String dayToTimeString(double decimalDay)
    {
        int[] hms = dayToHourMinuteMicrosecond(decimalDay);
        String hh = String.format("%02d", hms[0]);
        String mm = String.format("%02d", hms[1]);
        String ss = String.format("%09.6f", hms[2]*1e-6);
        String TimeString = hh + ":" + mm + ":" + ss;
        
        return TimeString;
    }

    /**
     * This method converts hours, minutes, and seconds to decimal of day
     * @param hour      hours
     * @param minute    minutes
     * @param second    seconds
     * @return          decimal of day
     */
    public static double hourMinuteSecondToDay(int hour, int minute, double second)
    {
        return hour*TimeConstants.HOURS_TO_DAYS + minute*TimeConstants.MINUTES_TO_DAYS + second*TimeConstants.SECONDS_TO_DAYS;
    }

    /**
     * This method converts year, month, day, hour, minute, and second to the Modified Julian Date
     * @param yr        year
     * @param mon       month
     * @param d         day
     * @param hr        hour
     * @param m         minute
     * @param s         second
     * @return          Modified Julian Date
     */
    public static double dateTimeValuesToMJD(int yr, int mon, int d, int hr, int m, double s)
    {
        double y = (float) yr;
        double mth = (float) mon;
        double day = (float) d;

        if(mth <= 2)
        {
            y-=1.0;
            mth+=12.0;
        }

        double b = Math.floor(y*.0025) - Math.floor(y*.01) + Math.floor(y*.25);
        double mjd = 365.0*y - 679004.0 + b + Math.floor(30.6001*(mth+1.0)) + day;

        return mjd + hourMinuteSecondToDay(hr, m, s);
    }

    /**
     * This method parses a string of the form YYYY-MM-DDThh:mm:ss.ssssssZ and returns an array of strings
     * of the form {YYYY, MM, DD, hh, MM, ss.ssssss}
     * 
     * @param NewDateTimeString     string of the form YYYY-MM-DDThh:mm:ss.ssssssZ
     * @return                      array of strings of the form {YYYY, MM, DD, hh, mm, ss.ssssss}
     */
    public static String[] stringToDateTimeArray(String NewDateTimeString)
    {
        String FormattedString = NewDateTimeString.replace("Z", "").replace("T", " ");
        String[] dateTime = FormattedString.split(" ");
        String[] date = dateTime[0].split("-");
        String[] time = dateTime[1].split(":");
        
        return new String[] {
            date[0],
            date[1],
            date[2],
            time[0],
            time[1],
            time[2]
        };
    }

    /**
     * This method converts a Modified Julian Date to a string of the form YYYY-MM-DDThh:mm:ss.ssssssZ
     * 
     * @param mjdVal        Modified Julian Date
     * @return              string of the form YYYY-MM-DDThh:mm:ss.ssssssZ
     */
    public static String mjdToString(double mjdVal)
    {

        double floorMJD = Math.floor(mjdVal);
        double a = floorMJD + 2400001.0;
        double q = mjdVal - floorMJD;
        double b = 0.0;
        double c = a + 1524.0;

        double decimalDay = mjdVal - (int)mjdVal;

        String TimeString = TimeUtilities.dayToTimeString(decimalDay) + "Z";
        
        if(a >= 2299161.0)
        {
            b = Math.floor((a - 1867216.25)*0.00002737907007);
            c = a + b - Math.floor(b*.25) + 1525.0;
        }

        double d = Math.floor((c - 121.1)*TimeConstants.DAYS_IN_YEAR_INVERSE);
        double e = Math.floor(TimeConstants.DAYS_IN_YEAR*d);
        double f = Math.floor((c-e)*0.032679631765909);

        int intDay = (int) (c - e - Math.floor(30.6001*f) + q);
        int intMonth = (int) (f - 1.0 - 12.0*Math.floor(f*0.071428571428571));
        int intYear = (int) (d - 4715.0 - Math.floor((7.0+intMonth)*.1));

        String Day = String.format("%02d", intDay);
        String Month = String.format("%02d", intMonth);
        String Year = String.format("%04d", intYear);

        String DateString = Year + "-" + Month + "-" + Day;

        return DateString + "T" + TimeString;
    }

    /**
     * This method converts a Julian Date to a string of the form YYYY-MM-DDThh:mm:ss.ssssssZ
     * 
     * @param julianVal     Julian Date
     * @return              string of the form YYYY-MM-DDThh:mm:ss.ssssssZ
     */
    public static String jdToString(double julianVal)
    {
        return mjdToString(julianVal - TimeConstants.MJD_ZERO_AS_JULIAN);
    }

    /**
     * This method converts a string of the form YYYY-MM-DDThh:mm:ss.ssssssZ to a Modified Julian Date
     * 
     * @param NewDateTimeString     string of the form YYYY-MM-DDThh:mm:ss.ssssssZ
     * @return                      Modified Julian Date
     */
    public static double stringToMJD(String NewDateTimeString)
    {
        String[] DateTimeArray = TimeUtilities.stringToDateTimeArray(NewDateTimeString);
        System.out.println(DateTimeArray[0] + " " + DateTimeArray[1] + " " + DateTimeArray[2] + " " + DateTimeArray[3] + " " + DateTimeArray[4] + " " + DateTimeArray[5]);
        return dateTimeValuesToMJD(
            Integer.parseInt(DateTimeArray[0]),
            Integer.parseInt(DateTimeArray[1]),
            Integer.parseInt(DateTimeArray[2]),
            Integer.parseInt(DateTimeArray[3]),
            Integer.parseInt(DateTimeArray[4]),
            Double.parseDouble(DateTimeArray[5])
        );
    }

    public static double getLeapSeconds(double julianValue)
    {
        // TODO: add table lookup from file
        return 37.0;
    }
}
