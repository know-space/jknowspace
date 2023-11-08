package org.knowspace.data.loaders;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.net.URISyntaxException;
import java.net.URL;

public class Finals 
{
    
    private static String[] DataLines = new String[0];
    private static HashMap<Integer, Long> ut1utcMap = new HashMap<>();
    private static Finals instance = null;

    final String DEFAULT_DATAPATH = "finals.all";

    private Finals()
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

    public static Finals getInstance()
    {
        if(instance == null)
        {
            instance = new Finals();
        }
        return instance;
    }

    private static void readLines(String DataFilePath) throws IOException
    {
        ArrayList<String> lines = new ArrayList<String>();
        try(BufferedReader br = new BufferedReader(new FileReader(DataFilePath)))
        {
            String line = br.readLine();
            while(line != null)
            {
                String DayString = line.substring(7, 12);
                String UT1toUTCString = line.substring(58, 69);
                if(!DayString.isBlank() && !UT1toUTCString.isBlank())
                {
                    lines.add(line);
                    int mjd = Integer.parseInt(DayString);
                    long ut1utc = (long) (Float.parseFloat(UT1toUTCString)*1e3);
                    ut1utcMap.put(mjd, ut1utc);
                }
                line = br.readLine();
            }
        }

        DataLines = lines.toArray(new String[0]);
    }

    public void printLines()
    {
        for (String line: DataLines)
        {
            System.out.println(line);
        }
    }

    public long getUT1minusUTC(int modifiedJulianDate)
    {
        return ut1utcMap.get(modifiedJulianDate);
    }
}
