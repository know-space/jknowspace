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

    public static Vector solve(String from, String to, Vector position, Epoch epoch) {
        
        Vector result = new Vector();
        switch (from) {
            case "J2000":
                result = j2000To(to, position, epoch);
                break;
            case "MOD":
                break;
            case "TOD":
                break;
            case "ITRF":
                break;
        }
        return result;
    }

    private static Vector j2000To(String to, Vector position, Epoch epoch) {
        Vector result = new Vector();
        switch (to) {
            case "MOD":
                result = j2000ToMOD(position, epoch);
                break;
            case "TOD":
                result = j2000ToTOD(position, epoch);
                break;
            case "ITRF":
                break;
        }

        return result;
    }

    private static Vector j2000ToMOD(Vector position, Epoch epoch) {
        return Earth.precession(epoch).multiply(position);
    }

    private static Vector j2000ToTOD(Vector position, Epoch epoch) {
        return Earth.nutation(epoch).multiply(
            Earth.precession(epoch).multiply(position)
        );
    }
}
