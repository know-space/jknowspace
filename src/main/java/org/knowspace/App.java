package org.knowspace;

import org.knowspace.data.library.RequestManager;
import org.knowspace.data.library.types.LiveOpticalOb;
import org.knowspace.time.Epoch;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        RequestManager udl = new RequestManager("Basic YnJhbmRvbi5zZXh0b24yOlRvbW1pZVR1bmFidXJnZXIhMQ==");
        Epoch qStart = Epoch.fromStringUTC("2023-10-16T23:00:00.000000Z");
        Epoch qEnd = Epoch.fromStringUTC("2023-10-17T00:00:00.000000Z");
        LiveOpticalOb[] obs = udl.getAllOpticalObservations(qStart, qEnd);
        System.out.println(obs[0].getTargetID());
    }
}
