package org.knowspace.bodies;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import org.knowspace.linalg.Vector;
import org.knowspace.time.Epoch;

public class MoonTest {
    
    @Test
    public void testGetPositionECI()
    {
        Vector pos = Moon.getPosition(Epoch.fromUTC("2022-02-25T00:00:00.000000Z"));
        Vector truth = new Vector(-6.454159844478600e4, -3.280761448809440e5, -1.566863311585961e5);

        assertEquals(0.0, truth.angle(pos), 1.5e-3);
    }
}
