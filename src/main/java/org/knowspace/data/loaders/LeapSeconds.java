package org.knowspace.data.loaders;

import java.time.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.net.URISyntaxException;
import java.net.URL;

public class LeapSeconds 
{
    private static final String DEFAULT_DATAPATH = "leapseconds.dat";
    private static String[] DataLines = new String[0];
    private static ArrayList<Long> validityMillis = new ArrayList<Long>();
    private static ArrayList<Double> leapSeconds = new ArrayList<Double>();
    private static LeapSeconds instance = null;

    private LeapSeconds(String DataFilePath)
    {
        try 
        {
            readLines(DataFilePath);
        } 
        catch (IOException e) 
        {
            System.out.println(e.getMessage());
        }
    }

    private LeapSeconds()
    {
        try
        {
            URL url = ClassLoader.getSystemResource(DEFAULT_DATAPATH);
            try
            {
                String path = new File(url.toURI()).getAbsolutePath();
                readLines(path);
            }
            catch (URISyntaxException e)
            {
                System.out.println(e.getMessage());
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    private static LeapSeconds getInstance(String DataFilePath) 
    {
        if(instance == null)
        {
            instance = new LeapSeconds(DataFilePath);
        }
        return instance;
    }

    private static void readLines(String DataFilePath) throws IOException
    {
        ArrayList<String> lines = new ArrayList<String>();
        validityMillis.clear();
        leapSeconds.clear();

        double currentLeapSecond = 10;
        try(BufferedReader br = new BufferedReader(new FileReader(DataFilePath)))
        {
            String line = br.readLine();
            while(line != null)
            {
                Instant t = Instant.parse(line).atOffset(ZoneOffset.UTC).toInstant();
                validityMillis.add(t.toEpochMilli());
                leapSeconds.add(currentLeapSecond);
                currentLeapSecond++;
                lines.add(line);
                line = br.readLine();
            }
            DataLines = lines.toArray(new String[0]);
        }

        
    }
    public static double getLeapSeconds(long posixMils)
    {
        
        getInstance(DEFAULT_DATAPATH);
        
        double t = 0;

        for(int i = validityMillis.size() - 1; i >= 0; i--)
        {
            if(posixMils > validityMillis.get(i))
            {
                t = leapSeconds.get(i);
                break;
            }
        }

        return t;
    }

    public void printLines()
    {
        for(String line: DataLines)
        {
            System.out.println(line);
        }

    }

}