package org.knowspace.orbit;

import org.knowspace.linalg.Vector;
import org.knowspace.time.Epoch;

public class State {

    private Vector position;
    private Vector velocity;
    private Epoch epoch;

    public State(Vector position, Vector velocity, Epoch epoch) {
        this.position = position;
        this.velocity = velocity;
        this.epoch = epoch;
    }

    public Vector getPosition() {
        return position;
    }

    public Vector getVelocity() {
        return velocity;
    }

    public Epoch getEpoch() {
        return epoch;
    }
    
}
