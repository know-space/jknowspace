package org.knowspace.bodies;

import org.knowspace.linalg.Vector;
import org.knowspace.time.Epoch;
import org.knowspace.geometry.Angles;

public class Sun {

    public static final double MU = 1.327124400419e11; // km^3/s^2
    public static final double RADIUS = 695700.0; // km
    public static final double P = 4.56e-6; // N/m^2
    
    private static final double EXP_A = Angles.degreeMinuteSecondToRadians(0, 0, 6892.0);
    private static final double EXP_B = Angles.degreeMinuteSecondToRadians(0, 0, 72.0);
    private static final double W_PLUS_W = Math.toRadians(282.94);
    
    private Sun() {}

    /**
     * Returns the position of the Sun in the Earth-centered inertial frame at the given epoch.
     * @param posTime The epoch at which to calculate the position.
     * @return The position of the Sun in the Earth-centered inertial frame at the given epoch.
     */
    public static Vector getPosition(Epoch posTime) {

        double t = posTime.julianCenturiesPastJ2000();
        double meanAnomaly = Math.toRadians(357.5256 + 35999.049*t);

        //Equation 3.43
        double lambda = W_PLUS_W + meanAnomaly + EXP_A*Math.sin(meanAnomaly) + EXP_B*Math.sin(2.0*meanAnomaly);
        double r = (149.619 - 2.499*Math.cos(meanAnomaly) - .021*Math.cos(2.0*meanAnomaly))*1e6;

        //Equation 3.46
        double x = r*Math.cos(lambda);
        double slam = Math.sin(lambda);
        double y = r*slam*Earth.COS_OBLIQUITY;
        double z = r*slam*Earth.SIN_OBLIQUITY;
        return new Vector(x, y, z);
    }
    
}
