/*
 * This class is a wrapper on the Random.Org API
 */
package randomorgapidemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class RandomOrgApi {
    
    private String baseUrl  = "http://www.random.org/integers/?num=10&min=%s&max=%s&col=1&base=10&format=plain&rnd=new";
    
    /**
     * Constructor for Random.Org API Wrapper
     */
    public RandomOrgApi() { }
    
    /**
     * Returns a true-random integer from Random.Org between @min and @max inclusive
     * @param min the lowest integer in the range
     * @param max the highest integer in the range
     * @return the random integer 
     * @throws Exception when it cannot access the remote service
     */
    public int getRandomNumberBetween(int min, int max) throws Exception {
        String urlString = String.format(baseUrl, min, max);
        int random = 0;
        try {
            URL url = new URL(urlString);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            random = Integer.parseInt(reader.readLine());
            reader.close();            
        } catch (Exception e ) {
            throw e;
        } finally  {
            return random;
        }
        
    }
    
}
