package org.knowspace.bodies;

import org.knowspace.geometry.Angles;
import org.knowspace.linalg.Matrix;
import org.knowspace.time.Epoch;
import org.knowspace.linalg.Vector;

public class Earth {

    public static final double MU = 398600.4418; // km^3/s^2
    public static final double RADIUS = 6378.1363; // km
    public static final double OBLIQUITY_J2000 = Math.toRadians(23.43929111); // Mean obliquity of the ecliptic at J2000
    public static final double COS_OBLIQUITY = Math.cos(Earth.OBLIQUITY_J2000);
    public static final double SIN_OBLIQUITY = Math.sin(Earth.OBLIQUITY_J2000);

    private static final double A = Angles.degreeMinuteSecondToRadians(0, 0, 46.815);
    private static final double B = Angles.degreeMinuteSecondToRadians(0, 0, 0.00059);
    private static final double C = Angles.degreeMinuteSecondToRadians(0, 0, 0.001813);
    private static final double D = Math.toRadians(-.0048);
    private static final double E = Math.toRadians(0.0004);

    private Earth(){}

    /**
     * Returns the obliquity of the ecliptic at the given epoch.
     * @param epoch The epoch at which to calculate the obliquity.
     * @return The obliquity of the ecliptic at the given epoch.
     */
    public static double getObliquityAtEpoch(Epoch epoch) {
        double t = epoch.julianCenturiesPastJ2000();
        return Earth.OBLIQUITY_J2000 - A * t - B * t * t + C * t * t * t;
    }

    public static Matrix getRotationMatrix(Epoch epoch){
        double d = epoch.MJD();
        double arg1 = Math.toRadians(125.0 - 0.05295 * d);
        double arg2 = Math.toRadians(200.9 + 1.97129 * d);
        double dpsi = D * Math.sin(arg1) - E * Math.sin(arg2);
        double eps = Earth.getObliquityAtEpoch(epoch);
        double gmst = epoch.GMST();
        double gast = dpsi * Math.cos(eps) + gmst;

        double c = Math.cos(-gast);
        double s = Math.sin(-gast);

        return new Matrix(
            new Vector(c, -s, 0.0),
            new Vector(s, c, 0.0),
            new Vector(0.0, 0.0, 1.0)
        );
    }
}
