package org.knowspace.data.library;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONTokener;
import org.knowspace.messages.Console;
import org.knowspace.time.Epoch;

import org.knowspace.data.library.types.LiveOpticalOb;

public class RequestManager {

    private final String LoginCredentials;
    private int maxResults = 10000;
    private final String BASE_URL = "https://unifieddatalibrary.com/udl/";
    private HashMap<String, String> EPOCH_MAP = new HashMap<>();
    private final String EO_OBS = LiveOpticalOb.Label;
    private String DataType;
    private Epoch QueryStart;
    private Epoch QueryEnd;
    private String DataSource;
    private String SatID;
    private boolean filterSource = true;
    private boolean filterID = true;
    
    public RequestManager(String B64Credentials){
        LoginCredentials = B64Credentials;
        EPOCH_MAP.put("statevector", "?epoch=");
        EPOCH_MAP.put(EO_OBS, "?obTime=");
        EPOCH_MAP.put("maneuver", "?eventStartTime=");
    }

    private String buildQueryURL(){
        String QueryString = timeQuery(QueryStart, QueryEnd, DataType);
        if(filterSource){
            QueryString = addSource(QueryString, DataSource);
        }
        if(filterID){
            QueryString = addID(QueryString, SatID);
        }
        return QueryString;
    }

    private String addSource(String QueryString, String qSource){
        return String.join("&source=", QueryString, qSource);
    }

    private String addID(String QueryString, String qID){
        return String.join("&idOnOrbit=", QueryString, qID);
    }

    private String timeQuery(Epoch qStart, Epoch qEnd, String qType){
        String Timeframe = String.join("..", qStart.toString(), qEnd.toString());
        return String.join("", BASE_URL, qType, EPOCH_MAP.get(qType), Timeframe, "&dataMode=REAL");
    }
    public void setMaxResults(int newMax){
        maxResults = newMax;
    }

    public LiveOpticalOb[] getExoObservationsForSatID(Epoch qStart, Epoch qEnd, String qID) throws Exception {
        QueryStart = qStart;
        QueryEnd = qEnd;
        SatID = qID;
        DataSource = "EXO";
        DataType = EO_OBS;
        filterSource = true;
        filterID = true;
        JSONArray results = submitQuery(buildQueryURL());
        LiveOpticalOb[] ObResults = new LiveOpticalOb[results.length()];
        for(int i = 0; i < results.length(); i++){
            ObResults[i] = new LiveOpticalOb(results.getJSONObject(i));
        }
        return ObResults;
    }

    public LiveOpticalOb[] getOpticalObservationsForSatID(Epoch qStart, Epoch qEnd, String qID) throws Exception {
        QueryStart = qStart;
        QueryEnd = qEnd;
        SatID = qID;
        DataType = EO_OBS;
        filterSource = false;
        filterID = true;
        JSONArray results = submitQuery(buildQueryURL());
        LiveOpticalOb[] ObResults = new LiveOpticalOb[results.length()];
        for(int i = 0; i < results.length(); i++){
            ObResults[i] = new LiveOpticalOb(results.getJSONObject(i));
        }
        return ObResults;
    }

    public LiveOpticalOb[] getAllOpticalObservations(Epoch qStart, Epoch qEnd) throws Exception {
        QueryStart = qStart;
        QueryEnd = qEnd;
        DataType = EO_OBS;
        filterSource = false;
        filterID = false;
        JSONArray results = submitQuery(buildQueryURL());
        LiveOpticalOb[] ObResults = new LiveOpticalOb[results.length()];
        for(int i = 0; i < results.length(); i++){
            ObResults[i] = new LiveOpticalOb(results.getJSONObject(i));
        }
        return ObResults;
    }

    private JSONArray submitQuery(String QueryStringURL) throws IOException{

        Console.printStatus(" Query Started ", QueryStringURL);
        URL queryURL = new URL(String.join("&maxResults=", QueryStringURL, Integer.toString(maxResults)));
        HttpURLConnection connection = (HttpURLConnection) queryURL.openConnection();
        connection.setRequestProperty("Authorization", LoginCredentials);
        connection.setRequestMethod("GET");

        JSONArray results = new JSONArray(new JSONTokener(connection.getInputStream()));
        //JSONArray results = new JSONArray(new JSONTokener(connection.getInputStream()));
        int returnCount = results.length();
        if(returnCount == maxResults){
            Console.printWarning("Query limit of " + Integer.toString(returnCount) + " returned.  Results may be missing.");
        }
        else if(returnCount > 0){
            Console.printSuccess(Integer.toString(returnCount) + " results returned.");
        }
        else if(returnCount == 0){
            Console.printWarning("0 results returned.");
        }

        return results;
    }
}
