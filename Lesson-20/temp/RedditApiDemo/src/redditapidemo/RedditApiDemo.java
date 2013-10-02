package redditapidemo;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class RedditApiDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        String json = readUrl("http://api.reddit.com/hot");
        
    Gson gson = new Gson();        
    Reddit reddit = gson.fromJson(json, Reddit.class);

    for (Item item : page.items)
        System.out.println("    " + item.title);
    }
    
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
}
