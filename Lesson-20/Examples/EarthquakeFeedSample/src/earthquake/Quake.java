/*
 * This class holds data about the occurrence of an earthquake as provided
 *      by the US Geological Service RSS feed  the date,
 *  a descriptor string called details that describes the location,
 *  the location in terms of latitude and longitude
 *  the magnitude, as a number on the Richter scale
 *  and a link to further information
 *
 */

package earthquake;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Quake
{
    // fields for quake information
    private Date date;
    private String details;
    private String location;
    private double magnitude;
    private String link;

    // constructor takes initial values
    public Quake(Date date, String details, String location, double magnitude, String link)
    {
        this.date =  date;
        this.details = details;
        this.location = location;
        this.magnitude = magnitude;
        this.link = link;
    }

    public Date getDate() {   
        return this.date;    
    }
    
    public String getDetails() {   
        return details;   
    }
    
    public String getLocation() {
        return location;   
    }
    
    public double getMagnitude()  {   
        return magnitude;   
    }
    
    public String getLink() {
        return link;   
    }

}
