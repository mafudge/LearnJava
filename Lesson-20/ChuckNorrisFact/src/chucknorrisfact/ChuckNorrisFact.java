package chucknorrisfact;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class ChuckNorrisFact {

    public static void main(String[] args) {
        String content = getUrlContent("http://api.icndb.com/jokes/random");
        String joke = getJoke(content);
        System.out.println(joke);
    }
    
    public static String getJoke(String content) {
        final String TOKEN = "\"joke\": \"";
        int startIndex = content.indexOf(TOKEN);
        String joke = content.substring(startIndex + TOKEN.length());
        int endIndex = joke.indexOf("\"");
        joke = joke.substring(0, endIndex);
        joke = joke.replace("&quot;", "\"");
        return joke;
    }
    
    public static String getUrlContent(String url) {
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
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        return urlContent;
    }

}

