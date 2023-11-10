package org.knowspace.time;

import org.knowspace.geometry.Angles;

public class Epoch {
    
    private double mjdValue;

    public Epoch(double val)
    {
        mjdValue = val;
    }

    /**
     * This method returns the Modified Julian Date value of the epoch
     * @return              MJD value of the epoch
     */
    public double MJD()
    {
        return mjdValue;
    }

    /**
     * This method returns the Julian Date value of the epoch
     * @return              JD value of the epoch
     */
    public double JD()
    {
        return mjdValue + TimeConstants.MJD_ZERO_AS_JULIAN;
    }

    /**
     * This method returns the number of centuries past J2000
     * @return              number of centuries past J2000
     */
    public double julianCenturiesPastJ2000()
    {
        return (JD()-TimeConstants.J2000_AS_JULIAN) * TimeConstants.DAYS_IN_CENTURY_INVERSE;
    }

    /**
     * This method creates a new {@link Epoch} object from a Terrestrial Time calendar string
     * @param NewDateTimeString
     * @return
     */
    public static Epoch fromTDT(String NewDateTimeString)
    {
        return new Epoch(TimeUtilities.stringToMJD(NewDateTimeString));
    }

    /**
     * This method creates a new {@link Epoch} object from a Coordinated Universal Time calendar string
     * @param NewDateTimeString     calendar string in the form yyyy-mm-ddThh:mm:ss.ssssssZ
     * @return                      new {@link Epoch} object
     */
    public static Epoch fromUTC(String NewDateTimeString)
    {
        double utcMJD = TimeUtilities.stringToMJD(NewDateTimeString);
        return new Epoch(utcMJD + TimeConstants.TAI_MINUS_UTC + TimeConstants.TDT_MINUS_TAI);
    }

    /**
     * This method returns the Greenwich Mean Sidereal Time or Greenwich Hour 
     * Angle for the calling epoch as defined in Orbit Determination for the
     * Microcomputer on pages 21-23
     * 
     * @return                      double representing the GMST in radians
     */
    public double GMST()
    {
        //TODO: this calculation should be done for UT1 instead of UTC

        //solve for julian centuries since j2000 using equation 2.7
        double utc = MJD() - TimeConstants.TDT_MINUS_UTC;
        double decDay = utc % 1;
        double j0 = utc + TimeConstants.MJD_ZERO_AS_JULIAN - decDay;
        double j = (j0 - TimeConstants.J2000_AS_JULIAN) * TimeConstants.DAYS_IN_CENTURY_INVERSE;
        
        //solve for theta0 using equation 2.6
        double theta0 = 100.4606184 + 36000.77004*j + .000387933*j*j;
        
        //solve for gmst using equation 2.8
        double totalDeg = theta0 + 360.98564724*decDay;

        return Math.toRadians(Angles.getNormalizedAngleInDegrees(totalDeg));
    }
}
