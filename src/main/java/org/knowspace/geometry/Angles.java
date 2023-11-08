package org.knowspace.geometry;

import org.knowspace.time.TimeConstants;

public class Angles {
    
    // Normalize an angle to be within 0° and 360°
    public static double getNormalizedAngleInDegrees(double angle) {
        return angle % 360.0;
    }

    public static double convertDegreeMinuteSecondToRadians(int degs, int minutes, double seconds) {
        return Math.toRadians(degs + minutes * TimeConstants.MINUTES_TO_HOURS + seconds * TimeConstants.SECONDS_TO_HOURS);
    }
}
