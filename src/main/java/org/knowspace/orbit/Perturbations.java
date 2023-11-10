package org.knowspace.orbit;

import org.knowspace.bodies.Earth;
import org.knowspace.bodies.Sun;
import org.knowspace.coordinates.PositionConvert;
import org.knowspace.coordinates.SphericalPosition;
import org.knowspace.linalg.Vector;
import org.knowspace.time.Epoch;

public class Perturbations {
    
    private Perturbations() {}

    public static Vector centralBodyAcceleration(Vector position, double mu) {
        double r = position.magnitude();
        return position.scale(-mu/(r*r*r));
    }

    public static Vector thirdBodyAcceleration(Vector position, Vector thirdBodyPosition, double thirdBodyMu) {
        Vector r = thirdBodyPosition.minus(position);
        double rMag = r.magnitude();
        double sMag = thirdBodyPosition.magnitude();
        Vector vec1 = r.scale(1.0/(rMag*rMag*rMag));
        Vector vec2 = thirdBodyPosition.scale(1.0/(sMag*sMag*sMag));
        return vec1.minus(vec2).scale(thirdBodyMu);
    }

    public static Vector srpAcceleration(Vector sunVector, double srpScalar) {
        Vector sunVec = sunVector.normalized();
        double sMag = sunVec.magnitude();
        return sunVec.scale(-Sun.P * srpScalar / (sMag * sMag * 1e3));
    }

    public static Vector geopotentialAcceleration(Vector position, Epoch epoch) {

        Vector ecef = PositionConvert.inertialToFixed(position, epoch);
        SphericalPosition sphrPos = PositionConvert.cartesianToSpherical(ecef);
        double[][] p = Earth.getLegendrePolynomial(sphrPos.getDeclination());

        int m = 0;
        int n = 2;

        double partialR = 0.0;
        double partialPhi = 0.0;
        double partialLamb = 0.0;
        double recipR = 1.0 / position.magnitude();
        double muOverR = Earth.MU * recipR;
        double rOverR = Earth.RADIUS * recipR;
        double rExponent = 0.0;
        double cLam = 0.0;
        double sLam = 0.0;
        double recipRoot = 1.0 / Math.sqrt(ecef.element(0) * ecef.element(0) + ecef.element(1) * ecef.element(1));
        double rzOverRoot = ecef.element(2) * recipR * recipR * recipRoot;

        while (n < 5) {
            m = 0;
            rExponent = Math.pow(rOverR, n);
            while (m <= n) {
                cLam = Math.cos(m * sphrPos.getRightAscension());
                sLam = Math.sin(m * sphrPos.getRightAscension());
                partialR += rExponent * (n + 1) * p[n][m] * (Earth.C[n][m] * cLam + Earth.S[n][m] * sLam);
                partialPhi += rExponent * (p[n][m + 1] - m * Math.tan(sphrPos.getDeclination()) * p[n][m]) * (Earth.C[n][m] * cLam + Earth.S[n][m] * sLam);
                partialLamb += rExponent * m * p[n][m] * (Earth.S[n][m] * cLam - Earth.C[n][m] * sLam);
                m++;
            }
            n++;
        }

        partialR *= -recipR * muOverR;
        partialPhi *= muOverR;
        partialLamb *= muOverR;

        return PositionConvert.fixedToInertial(
            new Vector(
                (recipR * partialR - rzOverRoot * partialPhi) * ecef.element(0) - recipRoot * recipRoot * partialLamb * ecef.element(1),
                (recipR * partialR - rzOverRoot * partialPhi) * ecef.element(1) + recipRoot * recipRoot * partialLamb * ecef.element(0),
                recipR * partialR * ecef.element(2) + 1.0 / recipRoot * recipR * recipR * partialPhi
            ),
            epoch
        );

    }
}
