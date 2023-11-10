package org.knowspace.bodies;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.knowspace.linalg.Vector;
import org.knowspace.time.Epoch;

public class SatelliteTest {
    
    // TODO: update this test when geopotential is fixed
    // @Test
    // public void testStepToEpoch(){
    //     Epoch epoch = Epoch.fromTDT("2022-12-20T00:01:09.184000Z");
    //     Vector position = new Vector(42164.0, 0.0, 0.0);
    //     Vector velocity = new Vector(0.0, 3.07375, 0.0);
    //     Satellite sat = new Satellite(epoch, position, velocity);
    //     sat.stepToEpoch(Epoch.fromTDT("2022-12-20T19:01:09.184000Z"));
    //     Vector truthPosition = new Vector(11701.163084, -40487.016256, -2.099302);
    //     assertEquals(sat.getCurrentPosition().minus(truthPosition).magnitude(), 0.0, 1e-6);
    //     assertEquals(sat.getCurrentPosition().element(0), 11701.163084, 1e-6);
    //     assertEquals(sat.getCurrentPosition().element(1), -40487.016256, 1e-6);
    //     assertEquals(sat.getCurrentPosition().element(2), -2.099302, 1e-6);
    //     assertEquals(sat.getCurrentVelocity().element(0), 2.954853, 1e-6);
    //     assertEquals(sat.getCurrentVelocity().element(1), 0.851923, 1e-6);
    //     assertEquals(sat.getCurrentVelocity().element(2), -0.000141, 1e-6);
    // }
}
