
package twittersearchapidemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import net.sf.json.*;
import sun.misc.IOUtils;

 


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
        // define a hashtag topic to search for (this will represent #obama)
        String hashtagTopic = "obama";
        //String hashtagTopic = "ladygaga";

        System.out.println("Tweets retrieved with #" + hashtagTopic);

        // send search request using the Twitter search http encoded URL
        URL url;
        int count = 0;
        String tweetID, tweetDate, tweetText, tweetUserID;
        String json = readUrl("http://search.twitter.com/search.json?q=%23"
                    + hashtagTopic + "&page=" + 1);
        System.out.println(json);
        
    }
}
