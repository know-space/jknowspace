package org.knowspace.data.library.types;

import org.json.JSONException;
import org.json.JSONObject;
import java.lang.Math;

import org.knowspace.time.Epoch;

public class LiveOpticalOb {

    private static final String UNKNOWN_ID = "UNKNOWN_SATELLITE_ID";
    public static final String Label = "eoobservation";
    private String SatID;
    private Epoch ObEpoch;
    private double az;
    private double el;
    private double range;
    private double senAlt;
    private double senLat;
    private double senLon;
    public LiveOpticalOb(JSONObject QueryLine){
           parseID(QueryLine);
           parseEpoch(QueryLine);
           parseAzimuth(QueryLine);
           parseElevation(QueryLine);
           parseObserverLat(QueryLine);
           parseObserverLon(QueryLine);
           parseObserverAlt(QueryLine);
    }

    private void parseID(JSONObject QueryLine){
        try{
            SatID = QueryLine.getString("origObjectId");
        } catch (JSONException failedID) {
            try {
                SatID = QueryLine.getString("idOnOrbit");
            } catch (JSONException failedOriginID) {
                SatID = LiveOpticalOb.UNKNOWN_ID;
            }
        }  
    }
    
    private void parseEpoch(JSONObject QueryLine){
        ObEpoch = Epoch.fromUTC(QueryLine.getString("obTime"));
    }

    private void parseAzimuth(JSONObject QueryLine){
        az = Math.toRadians(QueryLine.getDouble("azimuth"));
    }

    private void parseElevation(JSONObject QueryLine){
        az = Math.toRadians(QueryLine.getDouble("elevation"));
    }

    private void parseObserverLat(JSONObject QueryLine){
        senLat = Math.toRadians(QueryLine.getDouble("senlat"));
    }

    private void parseObserverLon(JSONObject QueryLine){
        senLat = Math.toRadians(QueryLine.getDouble("senlon"));
    }

    private void parseObserverAlt(JSONObject QueryLine){
        senLat = Math.toRadians(QueryLine.getDouble("senalt"));
    }

    public String getTargetID(){
        return SatID;
    }

    public Epoch getObservedEpoch(){
        return ObEpoch;
    }

    public double getObservedAzimuth(){
        return az;
    }

    public double getObservedElevation(){
        return el;
    }

    public double getObservedRange(){
        return range;
    }

    public double getObserverLatitude(){
        return senLat;
    }

    public double getObseerverLongitude(){
        return senLon;
    }

    public double getObserverAltitude(){
        return senAlt;
    }
}
