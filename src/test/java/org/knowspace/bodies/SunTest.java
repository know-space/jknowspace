package org.knowspace.bodies;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.knowspace.linalg.Vector;
import org.knowspace.time.Epoch;

public class SunTest {

    
    @Test
    public void testGetPositionECI()
    {
        Vector pos = Sun.getPosition(Epoch.fromUTC("2022-02-25T00:00:00.000000Z"));
        Vector truth = new Vector(
            1.353158384133262e8, 
            -5.514968448042840e7, 
            -2.390803633125914e7
        );

        assertEquals(0.0, truth.angle(pos), 1.5e-3);
    }
}
