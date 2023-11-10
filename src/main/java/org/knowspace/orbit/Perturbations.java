package org.knowspace.orbit;

import org.knowspace.bodies.Sun;
import org.knowspace.linalg.Vector;

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
}
