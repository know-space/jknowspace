package org.knowspace.bodies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

    private static final double COEFF_A = Angles.degreeMinuteSecondToRadians(0, 0, 46.815);
    private static final double COEFF_B = Angles.degreeMinuteSecondToRadians(0, 0, 0.00059);
    private static final double COEFF_C = Angles.degreeMinuteSecondToRadians(0, 0, 0.001813);
    private static final double COEFF_D = Math.toRadians(-.0048);
    private static final double COEFF_E = Math.toRadians(0.0004); 

    public static final List<List<Double>> C = new ArrayList<List<Double>>() {{
        add(Arrays.asList(1.0));
        add(Arrays.asList(0.0, 0.0));
        add(Arrays.asList(-0.484165143790815e-3 / Math.sqrt(0.2), -0.206615509074176e-9 / Math.sqrt(0.6), 0.243938357328313e-5 / Math.sqrt(2.4)));
        add(Arrays.asList(
            0.957161207093473e-6 / Math.sqrt(1.0 / 7.0),
            0.203046201047864e-5 / Math.sqrt(6.0 / 7.0),
            0.904787894809528e-6 / Math.sqrt(60.0 / 7.0),
            0.721321757121568e-6 / Math.sqrt(360.0 / 7.0)
        ));
        add(Arrays.asList(
            0.539965866638991e-6 / Math.sqrt(24.0 / 216.0),
            -0.536157389388867e-6 / Math.sqrt(10.0 / 9.0),
            0.350501623962649e-6 / Math.sqrt(20.0),
            0.990856766672321e-6 / Math.sqrt(280.0),
            -0.188519633023033e-6 / Math.sqrt(2240.0)
        ));
    }};

    public static final List<List<Double>> S = new ArrayList<List<Double>>() {{
        add(Arrays.asList(0.0));
        add(Arrays.asList(0.0, 0.0));
        add(Arrays.asList(0.0, 0.138441389137979e-8 / Math.sqrt(0.6), -0.140027370385934e-5 / Math.sqrt(2.4)));
        add(Arrays.asList(
            0.0,
            0.248200415856872e-6 / Math.sqrt(6.0 / 7.0),
            -0.619005475177618e-6 / Math.sqrt(60.0 / 7.0),
            0.141434926192941e-5 / Math.sqrt(360.0 / 7.0)
        ));
        add(Arrays.asList(
            0.0,
            -0.473567346518086e-6 / Math.sqrt(10.0 / 9.0),
            0.662480026275829e-6 / Math.sqrt(20.0),
            -0.200956723567452e-6 / Math.sqrt(280.0),
            0.308803882149194e-6 / Math.sqrt(2240.0)
        ));
    }};

    private Earth(){}

    /**
     * Returns the obliquity of the ecliptic at the given epoch.
     * @param epoch The epoch at which to calculate the obliquity.
     * @return The obliquity of the ecliptic at the given epoch.
     */
    public static double getObliquityAtEpoch(Epoch epoch) {
        double t = epoch.julianCenturiesPastJ2000();
        return Earth.OBLIQUITY_J2000 - COEFF_A * t - COEFF_B * t * t + COEFF_C * t * t * t;
    }

    /**
     * Returns the rotation matrix from the inertial frame to the Earth-fixed frame at the given epoch.
     * @param epoch The epoch at which to calculate the rotation matrix.
     * @return The rotation matrix from the inertial frame to the Earth-fixed frame at the given epoch.
     */
    public static Matrix getRotationMatrix(Epoch epoch){
        double d = epoch.MJD();
        double arg1 = Math.toRadians(125.0 - 0.05295 * d);
        double arg2 = Math.toRadians(200.9 + 1.97129 * d);
        double dpsi = COEFF_D * Math.sin(arg1) - COEFF_E * Math.sin(arg2);
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
