/*
 * Fix the errors in this file 
 */
package chucknorrisfact;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ChuckNorrisFact {
    private String baseUrl;
    private String content;
    
    public ChuckNorrisFact() {
        this.baseUrl = "http://api.icndb.com/jokes/";
    }
    
    public ChuckNorrisFact(String apiUrl) {
        this.baseUrl = apiUrl;
    }
    
    public String getRandomJoke{
        String url = baseUrl + "random";
         content = getUrlContent(url);
         retun getJokeFromJson(content);
    }
    
      
    public String getJokeById(jokeId) {
        String url = baseUrl + String.format("%d", jokeId);
        content = getUrlContent(url);
        return getJokeFromJson(content);
    }
    
    
    /* The code below this point is is ok */
    private String getJokeFromJson(String jsonContent) {
        final String TOKEN = "\"joke\": \"";
        int startIndex = jsonContent.indexOf(TOKEN);
        if (startIndex <0) return "";
        String joke = jsonContent.substring(startIndex + TOKEN.length());
        int endIndex = joke.indexOf("\"");
        joke = joke.substring(0, endIndex);
        joke = joke.replace("&quot;", "\"");
        return joke;
    }
    
    private String getUrlContent(String url) {
        String urlContent ="";
        try {
            URL document = new URL(url);

            BufferedReader in = new BufferedReader(
                                    new InputStreamReader(
                                    document.openStream()));

            // read the stream and print out each line
            String inputLine;
            while ((inputLine = in.readLine()) != null)
                urlContent += inputLine;

            in.close();
        }
        catch (Exception e)
        {
            System.out.printf("ERROR: %s\n",e);
        }
        return urlContent;
    }
}
