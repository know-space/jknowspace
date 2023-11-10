package org.knowspace.coordinates;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.knowspace.linalg.Vector;
import org.knowspace.time.Epoch;

public class PositionConvertTest {
    
    @Test
    public void testInertialToFixed()
    {
        Vector pos = new Vector(10000.0, 40000.0, -5000.0);
        Epoch epoch = Epoch.fromTDT("2021-12-25T04:43:51.608000Z");
        Vector truth = new Vector(1173.544602365, -41216.97127606, -4978.360362079);
        Vector result = PositionConvert.inertialToFixed(pos, epoch);
        assertEquals(0.0, result.minus(truth).magnitude(), 1e-6);
        assertEquals(truth.element(0), result.element(0), 1e-6);
        assertEquals(truth.element(1), result.element(1), 1e-6);
        assertEquals(truth.element(2), result.element(2), 1e-6);
    }
}
