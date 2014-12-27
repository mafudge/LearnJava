
package twittersearchapidemo;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.net.URL;
import java.io.InputStreamReader;
import net.sf.json.*;

 


public class TwitterSearchApiDemo {
    
    private static String readUrl(String urlString) throws Exception {
    BufferedReader reader = null;
    try {
        URL url = new URL(urlString);
        reader = new BufferedReader(new InputStreamReader(url.openStream()));
        StringBuffer buffer = new StringBuffer();
        int read;
        char[] chars = new char[1024];
        while ((read = reader.read(chars)) != -1)
            buffer.append(chars, 0, read); 

        return buffer.toString();
    } finally {
        if (reader != null)
            reader.close();
    }

}

    public static void main(String[] args) throws Exception {
        // send search request using the Twitter search http encoded URL
        URL url;
        String jsonString = readUrl("http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_day.geojson");
        System.out.println(jsonString);
        String[] proplist = jsonString.split("properties");
        
        
    }
}
