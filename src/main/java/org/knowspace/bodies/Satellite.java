package org.knowspace.bodies;

import org.knowspace.linalg.Vector;
import org.knowspace.time.Epoch;
import org.knowspace.orbit.propagation.RK4;

public class Satellite {
    
    private Epoch epoch;
    private Vector position;
    private Vector velocity;
    private RK4 integrator;
    private double albedo = 0.3; // unitless
    private double radius = .005; // km
    private double mass = 800.0; // kg
    private double massInverse = 1.0 / mass;

    public Satellite(Epoch epoch, Vector position, Vector velocity) {
        this.epoch = epoch;
        this.position = position;
        this.velocity = velocity;
        this.integrator = new RK4(epoch, position, velocity, getSolarRadiationPressureScalar());
    }

    public void resetState() {
        this.integrator = new RK4(epoch, position, velocity, getSolarRadiationPressureScalar());
    }

    public Epoch getCurrentEpoch() {
        return integrator.epoch();
    }

    public Vector getCurrentPosition() {
        return integrator.position();
    }

    public Vector getCurrentVelocity() {
        return integrator.velocity();
    }

    public Vector getSunVector() {
        return Sun.getPosition(getCurrentEpoch()).minus(getCurrentPosition());
    }

    public Vector getMoonVector() {
        return Moon.getPosition(getCurrentEpoch()).minus(getCurrentPosition());
    }

    public Vector getEarthVector() {
        return getCurrentPosition().scale(-1.0);
    }

    public void step() {
        integrator.step();
    }

    public void stepToEpoch(Epoch epoch) {
        integrator.stepToEpoch(epoch);
    }

    public double getSolarRadiationPressureScalar() {
        return ((albedo + 1.0) * getArea() * 1e6 * massInverse);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}
