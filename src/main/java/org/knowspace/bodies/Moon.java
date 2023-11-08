package org.knowspace.bodies;

import org.knowspace.geometry.Angles;
import org.knowspace.time.Epoch;
import org.knowspace.linalg.Vector;

public class Moon {
    
    public static final double MU = 4902.8005821478; // km^3/s^2
    public static final double RADIUS = 1737.4; // km

    private static final double A0 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 22640.0);
    private static final double A1 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 769.0);
    private static final double A2 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 4586.0);
    private static final double A3 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 2370.0);
    private static final double A4 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 668.0);
    private static final double A5 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 412.0);
    private static final double A6 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 212.0);
    private static final double A7 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 206.0);
    private static final double A8 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 192.0);
    private static final double A9 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 165.0);
    private static final double A10 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 148.0);
    private static final double A11 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 125.0);
    private static final double A12 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 110.0);
    private static final double A13 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 55.0);
    private static final double B0 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 18520.0);
    private static final double B1 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 412.0);
    private static final double B2 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 541.0);
    private static final double B3 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 526.0);
    private static final double B4 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 44.0);
    private static final double B5 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 31.0);
    private static final double B6 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 25.0);
    private static final double B7 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 23.0);
    private static final double B8 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 21.0);
    private static final double B9 = Angles.convertDegreeMinuteSecondToRadians(0, 0, 11.0);

    private Moon(){}

    public static Vector getPositionECI(Epoch epoch) {
        //Equation 3.47
        double t = epoch.getJulianCenturiesPastJ2000();
        double l0 = Math.toRadians(218.31617 + 481267.88088*t - 1.3972*t);
        double l = Math.toRadians(134.96292 + 477198.86753*t);
        double lp = Math.toRadians(357.52543 + 35999.04944*t);
        double f = Math.toRadians(93.27283 + 483202.01873*t);
        double d = Math.toRadians(297.85027 + 445267.11135*t);

        //Equation 3.48
        double lam = l0+A0*Math.sin(l) + A1*Math.sin(2*l)
            -A2*Math.sin(l-2.0*d) + A3*Math.sin(2.0*d)
            -A4*Math.sin(lp) - A5*Math.sin(2.0*f)
            -A6*Math.sin(2.0*l-2.0*d) - A7*Math.sin(l+lp-2.0*d)
            +A8*Math.sin(l+2.0*d) - A9*Math.sin(lp-2.0*d)
            +A10*Math.sin(l-lp) - A11*Math.sin(d)
            -A12*Math.sin(l+lp) - A13*Math.sin(2.0*f-2.0*d);

        //Equation 3.49
        double beta = B0*Math.sin(f+lam-l0+B1*Math.sin(2.0*f+B2*Math.sin(lp)))
            -B3*Math.sin(f-2.0*d) + B4*Math.sin(l+f-2.0*d)
            -B5*Math.sin(-l+f-2.0*d)-B6*Math.sin(-2.0*l+f)
            -B7*Math.sin(lp+f-2.0*d) + B8*Math.sin(-l+f)
            +B9*Math.sin(-lp+f-2.0*d);

        //Equation 3.50
        double r = (385000.0-20905.0*Math.cos(l)-3699.0*Math.cos(2.0*d-l)
            -2956.0*Math.cos(2.0*d)-570.0*Math.cos(2.0*l)+246.0*Math.cos(2.0*l-2.0*d)
            -205.0*Math.cos(lp-2.0*d) - 171.0*Math.cos(l+2.0*d)
            -152.0*Math.cos(l+lp-2.0*d));

        //Equation 3.51
        double x = r*Math.cos(lam)*Math.cos(beta);
        double y = r*Math.sin(lam)*Math.cos(beta);
        double z = r*Math.sin(beta);
        return new Vector(
            x, 
            Earth.COS_OBLIQUITY * y - Earth.SIN_OBLIQUITY * z, 
            Earth.SIN_OBLIQUITY * y + Earth.COS_OBLIQUITY * z
        );
    }
}
