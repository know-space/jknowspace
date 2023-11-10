package org.knowspace.coordinates;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.knowspace.linalg.Vector;
import org.knowspace.time.Epoch;

public class PositionConvertTest {
    
    @Test
    public void testSolve()
    {
        Vector gcrf = new Vector(10000.0, 40000.0, -5000.0);
        Vector mod = new Vector(9813.907183667, 40048.700077099, -4978.840018011);
        Vector tod = new Vector(9816.34413386, 40048.169137333, -4978.306598902);
        Epoch epoch = Epoch.fromTDT("2021-12-25T04:43:51.608000Z");
        
        Vector result = PositionConvert.solve("J2000", "MOD", gcrf, epoch);
        assertEquals(0.0, result.minus(mod).magnitude(), 1e-3);
        assertEquals(mod.element(0), result.element(0), 1e-3);
        assertEquals(mod.element(1), result.element(1), 1e-3);
        assertEquals(mod.element(2), result.element(2), 1e-3);

        result = PositionConvert.solve("J2000", "TOD", gcrf, epoch);
        assertEquals(0.0, result.minus(tod).magnitude(), .1); 
        assertEquals(tod.element(0), result.element(0), .05);
        assertEquals(tod.element(1), result.element(1), .05);
        assertEquals(tod.element(2), result.element(2), .05);

    }

    @Test
    public void testInertialToFixed()
    {
        Vector pos = new Vector(10000.0, 40000.0, -5000.0);
        Epoch epoch = Epoch.fromTDT("2021-12-25T04:43:51.608000Z");
        Vector truth = new Vector(1173.544602365, -41216.97127606, -4978.360362079);
        Vector result = PositionConvert.inertialToFixed(pos, epoch);
        assertEquals(0.0, result.minus(truth).magnitude(), .5);
        assertEquals(truth.element(0), result.element(0), .5);
        assertEquals(truth.element(1), result.element(1), .5);
        assertEquals(truth.element(2), result.element(2), .5);
    }
}
