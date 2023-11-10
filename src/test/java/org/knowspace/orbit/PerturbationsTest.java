package org.knowspace.orbit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.knowspace.bodies.Earth;
import org.knowspace.bodies.Sun;
import org.knowspace.bodies.Moon;
import org.knowspace.linalg.Vector;
import org.knowspace.time.Epoch;

public class PerturbationsTest {
    
    @Test
    public void testGeopotentialAcceleration() {
        Epoch epoch = Epoch.fromTDT("2021-12-25T04:43:51.608000Z");
        Vector earthSurface = new Vector(6378.0, 0.0, 0.0);

        Vector result = Perturbations.geopotentialAcceleration(earthSurface, epoch);
        assertEquals(1.5990836818112354e-05, result.magnitude(), 1e-9); // TODO: update to 1e-15 when geopotential is fixed
    }

    @Test
    public void testAccelerationFromEarth() {
        Vector earthSurface = new Vector(6378.0, 0.0, 0.0);

        Vector result = Perturbations.centralBodyAcceleration(earthSurface, Earth.MU);
        assertEquals(0.00979870641977297, result.magnitude(), 1e-15);
    }

    @Test
    public void testAccelerationFromSun() {
        Epoch epoch = Epoch.fromTDT("2021-12-25T04:43:51.608000Z");
        Vector pos = new Vector(10000.0, 40000.0, -5000.0);
        Vector result = Perturbations.thirdBodyAcceleration(pos, Sun.getPosition(epoch), Sun.MU);
        assertEquals(3.00696687920662e-9, result.magnitude(), 1e-15);
    
    }

    @Test
    public void testAccelerationFromMoon() {
        Epoch epoch = Epoch.fromTDT("2021-12-25T04:43:51.608000Z");
        Vector pos = new Vector(10000.0, 40000.0, -5000.0);
        Vector result = Perturbations.thirdBodyAcceleration(pos, Moon.getPosition(epoch), Moon.MU);
        assertEquals(3.4064259486775476e-9, result.magnitude(), 1e-15);
    }
}
