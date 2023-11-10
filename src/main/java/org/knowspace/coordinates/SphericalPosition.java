package org.knowspace.coordinates;

public class SphericalPosition {

    private double r;
    private double declination;
    private double rightAscension;

    public SphericalPosition(double r, double rightAscension, double declination) {
        this.r = r;
        this.declination = declination;
        this.rightAscension = rightAscension;
    }

    public double getR() {
        return r;
    }

    public double getDeclination() {
        return declination;
    }

    public double getRightAscension() {
        return rightAscension;
    }

}
