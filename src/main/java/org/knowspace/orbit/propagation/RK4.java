package org.knowspace.orbit.propagation;

import org.knowspace.bodies.Earth;
import org.knowspace.bodies.Moon;
import org.knowspace.bodies.Sun;
import org.knowspace.linalg.Vector;
import org.knowspace.time.Epoch;
import org.knowspace.time.TimeConstants;
import org.knowspace.orbit.Perturbations;

public class RK4 {
    
    private Epoch epoch;
    private double stepSize = 300.0;
    private Vector position;
    private Vector velocity;
    private double ONE_SIXTH = 1.0/6.0;
    private double srpScalar;

    public RK4(Epoch epoch, Vector position, Vector velocity, double srpScalar) {
        this.epoch = epoch;
        this.position = position;
        this.velocity = velocity;
        this.srpScalar = srpScalar;
    }

    public Epoch epoch() {
        return epoch;
    }

    public double stepSize() {
        return stepSize;
    }

    public Vector position() {
        return position;
    }

    public Vector velocity() {
        return velocity;
    }

    public void setStepSize(double stepSize) {
        this.stepSize = stepSize;
    }

    public void step() {
        double h = stepSize;
        Epoch epoch0 = epoch;

        Vector[] y = {position, velocity};
        Vector[] k1 = derivative(epoch0, y);

        double dSecs = h*.5;
        double dDays = dSecs * TimeConstants.SECONDS_TO_DAYS;

        Epoch epoch1 = new Epoch(epoch0.MJD() + dDays);
        Vector[] y1 = {y[0].plus(k1[0].scale(dSecs)), y[1].plus(k1[1].scale(dSecs))};
        Vector[] k2 = derivative(epoch1, y1);

        Vector[] y2 = {y[0].plus(k2[0].scale(dSecs)), y[1].plus(k2[1].scale(dSecs))};
        Vector[] k3 = derivative(epoch1, y2);

        Epoch epoch2 = new Epoch(epoch1.MJD() + dDays);
        Vector[] y3 = {y[0].plus(k3[0].scale(h)), y[1].plus(k3[1].scale(h))};
        Vector[] k4 = derivative(epoch2, y3);

        Vector dv = k1[0].plus(k2[0].scale(2.0)).plus(k3[0].scale(2.0)).plus(k4[0]).scale(ONE_SIXTH);
        Vector da = k1[1].plus(k2[1].scale(2.0)).plus(k3[1].scale(2.0)).plus(k4[1]).scale(ONE_SIXTH);

        position = position.plus(dv.scale(h));
        velocity = velocity.plus(da.scale(h));
        epoch = epoch2;

    }

    public void stepToEpoch(Epoch endEpoch) {

        double dt = (endEpoch.MJD() - epoch.MJD()) * TimeConstants.DAYS_TO_SECONDS;

        int numSteps = (int) Math.ceil(Math.abs(dt / stepSize));
        double oldStep = stepSize;
        if (numSteps > 0) {
            stepSize = dt / numSteps;
        }

        int stepN = 0;
        while (stepN < numSteps) {
            step();
            stepN++;
        }

        stepSize = oldStep;
    }

    private Vector[] derivative(Epoch epoch, Vector[] y) {

        Vector[] d = new Vector[2];
        d[0] = y[1];
        d[1] = Perturbations.centralBodyAcceleration(y[0], Earth.MU);
        d[1] = d[1].plus(Perturbations.thirdBodyAcceleration(y[0], Sun.getPosition(epoch), Sun.MU));
        d[1] = d[1].plus(Perturbations.thirdBodyAcceleration(y[0], Moon.getPosition(epoch), Moon.MU));
        d[1] = d[1].plus(Perturbations.srpAcceleration(y[0].minus(Sun.getPosition(epoch)), srpScalar));
        return d;
    }

}
