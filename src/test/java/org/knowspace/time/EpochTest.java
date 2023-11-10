package org.knowspace.time;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EpochTest {
    
    @Test
    public void testFromStringUTC()
    {
        Epoch ep = Epoch.fromUTC("2023-11-01T11:58:50.816000Z");
        assertEquals(2460250.0, ep.JD(), 1e-6);
    }

    @Test
    public void testFromStringTDT()
    {
        Epoch ep = Epoch.fromTDT("2023-11-01T12:00:00.000000Z");
        assertEquals(2460250.0, ep.JD(), 1e-6);
        Epoch ep2 = Epoch.fromTDT("2023-11-20T03:39:46.000000Z");
        assertEquals(2460268.652615740741, ep2.JD(), 1e-6);
    }

    @Test
    public void testGetGreenwichSiderealTime()
    {
        //TODO:  Update the tolerance when UT1 is added to the GHA calculation
        Epoch ep = Epoch.fromTDT("2022-12-19T12:01:09.184000Z");
        assertEquals(Math.toRadians(268.0707472726), ep.GMST(), 1e-7);
    }
}
