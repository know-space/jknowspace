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

    private static final double COEFF_A = Angles.degreeMinuteSecondToRadians(0, 0, 46.815);
    private static final double COEFF_B = Angles.degreeMinuteSecondToRadians(0, 0, 0.00059);
    private static final double COEFF_C = Angles.degreeMinuteSecondToRadians(0, 0, 0.001813);
    private static final double COEFF_D = Math.toRadians(-.0048);
    private static final double COEFF_E = Math.toRadians(0.0004); 
    private static final double COEFF_F = Angles.degreeMinuteSecondToRadians(0, 0, 2306.2181);
    private static final double COEFF_G = Angles.degreeMinuteSecondToRadians(0, 0, 0.30188);
    private static final double COEFF_H = Angles.degreeMinuteSecondToRadians(0, 0, 0.017998);
    private static final double COEFF_I = Angles.degreeMinuteSecondToRadians(0, 0, 2004.3109);
    private static final double COEFF_J = Angles.degreeMinuteSecondToRadians(0, 0, 0.42665);
    private static final double COEFF_K = Angles.degreeMinuteSecondToRadians(0, 0, 0.041833);
    private static final double COEFF_L = Angles.degreeMinuteSecondToRadians(0, 0, 0.7928);
    private static final double COEFF_M = Angles.degreeMinuteSecondToRadians(0, 0, 0.000205);
    private static final double COEFF_N = Math.toRadians(0.0026);
    private static final double COEFF_O = Math.toRadians(0.0002);

    public static final double[][] C = new double[][]{
        new double[]{1.0},
        new double[]{0.0, 0.0},
        new double[]{
            -0.484165143790815e-3 / Math.sqrt(0.2),
            -0.206615509074176e-9 / Math.sqrt(0.6),
            0.243938357328313e-5 / Math.sqrt(2.4)
        },
        new double[]{
            0.957161207093473e-6 / Math.sqrt(1.0 / 7.0),
            0.203046201047864e-5 / Math.sqrt(6.0 / 7.0),
            0.904787894809528e-6 / Math.sqrt(60.0 / 7.0),
            0.721321757121568e-6 / Math.sqrt(360.0 / 7.0)
        },
        new double[]{
            0.539965866638991e-6 / Math.sqrt(24.0 / 216.0),
            -0.536157389388867e-6 / Math.sqrt(10.0 / 9.0),
            0.350501623962649e-6 / Math.sqrt(20.0),
            0.990856766672321e-6 / Math.sqrt(280.0),
            -0.188519633023033e-6 / Math.sqrt(2240.0)
        }
    };

    public static final double[][] S = new double[][]{
        new double[]{0.0},
        new double[]{0.0, 0.0},
        new double[]{
            0.0,
            0.138441389137979e-8 / Math.sqrt(0.6),
            -0.140027370385934e-5 / Math.sqrt(2.4)
        },
        new double[]{
            0.0,
            0.248200415856872e-6 / Math.sqrt(6.0 / 7.0),
            -0.619005475177618e-6 / Math.sqrt(60.0 / 7.0),
            0.141434926192941e-5 / Math.sqrt(360.0 / 7.0)
        },
        new double[]{
            0.0,
            -0.473567346518086e-6 / Math.sqrt(10.0 / 9.0),
            0.662480026275829e-6 / Math.sqrt(20.0),
            -0.200956723567452e-6 / Math.sqrt(280.0),
            0.308803882149194e-6 / Math.sqrt(2240.0)
        }
    };

    private Earth(){}

    /**
     * Returns the obliquity of the ecliptic at the given epoch.
     * @param epoch The epoch at which to calculate the obliquity.
     * @return The obliquity of the ecliptic at the given epoch.
     */
    public static double getObliquityAtEpoch(Epoch epoch) {
        double t = epoch.centuriesPastJ2000();
        return Earth.OBLIQUITY_J2000 - COEFF_A * t - COEFF_B * t * t + COEFF_C * t * t * t;
    }

    /**
     * Returns the rotation matrix from the inertial frame to the Earth-fixed frame at the given epoch.
     * @param epoch The epoch at which to calculate the rotation matrix.
     * @return The rotation matrix from the inertial frame to the Earth-fixed frame at the given epoch.
     */
    public static Matrix rotation(Epoch epoch){
        double d = epoch.daysPastJ2000();
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
    
    /**
     * Creates a matrix that can be used to transform a TOD position to MOD and vice versa.
     * @param epoch The valid time of the state.
     * @return The transformation matrix.
     */
    public static Matrix precession(Epoch epoch) {

        double t = epoch.centuriesPastJ2000();

        double x = COEFF_F * t + COEFF_G * t * t + COEFF_H * t * t * t;
        double y = COEFF_I * t - COEFF_J * t * t - COEFF_K * t * t * t;
        double z = x + COEFF_L * t * t + COEFF_M * t * t * t;

        double sz = Math.sin(z);
        double sy = Math.sin(y);
        double sx = Math.sin(x);
        double cz = Math.cos(z);
        double cy = Math.cos(y);
        double cx = Math.cos(x);

        return new Matrix(
            new Vector(-sz * sx + cz * cy * cx, -sz * cx - cz * cy * sx, -cz * sy),
            new Vector(cz * sx + sz * cy * cx, cz * cx - sz * cy * sx, -sz * sy),
            new Vector(sy * cx, -sy * sx, cy)
        );
    }

    public static Matrix nutation(Epoch epoch) {
        double d = epoch.daysPastJ2000();
        double arg1 = Math.toRadians(125.0 - 0.05295 * d);
        double arg2 = Math.toRadians(200.9 + 1.97129 * d);
        double dpsi = COEFF_D * Math.sin(arg1) - COEFF_E * Math.sin(arg2);
        double deps = COEFF_N * Math.cos(arg1) + COEFF_O * Math.cos(arg2);
        double eps = Earth.getObliquityAtEpoch(epoch);

        double ce = Math.cos(eps);
        double se = Math.sin(eps);

        return new Matrix(
            new Vector(1.0, -dpsi * ce, -dpsi * se),
            new Vector(dpsi * ce, 1.0, -deps),
            new Vector(dpsi * se, deps, 1.0)
        );
    }

    public static double[][] getLegendrePolynomial(double phi){
        double cosPhi = Math.cos(phi);
        double sinPhi = Math.sin(phi);
        double cosPhiSquared = cosPhi * cosPhi;
        double sinPhiSquared = sinPhi * sinPhi;

        double[][] p = new double[5][];
        p[0] = new double[]{1.0, 0.0};
        p[1] = new double[]{sinPhi, cosPhi, 0.0};
        p[2] = new double[]{
            (3.0 * sinPhiSquared - 1.0) * 0.5,
            3.0 * sinPhi * cosPhi,
            3.0 * cosPhiSquared,
            0.0
        };
        p[3] = new double[]{
            sinPhi * (5.0 * sinPhiSquared - 3.0) * 0.5,
            (15.0 * sinPhiSquared - 3.0) * cosPhi * 0.5,
            15.0 * sinPhi * cosPhiSquared,
            15.0 * cosPhiSquared * cosPhi,
            0.0
        };
        p[4] = new double[]{
            0.125 * (35.0 * sinPhiSquared * sinPhiSquared - 30.0 * sinPhiSquared + 3.0),
            2.5 * (7.0 * sinPhiSquared * sinPhi - 3.0 * sinPhi) * cosPhi,
            (7.0 * sinPhiSquared - 1.0) * cosPhiSquared * 7.5,
            105.0 * cosPhi * cosPhiSquared * sinPhi,
            105.0 * cosPhiSquared * cosPhiSquared,
            0.0
        };

        return p;
    }
}
