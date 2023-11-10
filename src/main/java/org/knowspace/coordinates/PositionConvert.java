package org.knowspace.coordinates;

import org.knowspace.bodies.Earth;
import org.knowspace.linalg.Vector;
import org.knowspace.time.Epoch;

public class PositionConvert {
    
    private PositionConvert() {}

    public static Vector inertialToFixed(Vector position, Epoch epoch) {
        return Earth.rotation(epoch).multiply(
            Earth.nutation(epoch).multiply(
                Earth.precession(epoch).multiply(position)
            )
        );
    }
}
