/*
 * This class shows how to get recent earthquakes from the US Geological Service RSS feed.
 *    This RSS feed gives earthquakes within the last 24 hours over magnitude 2.5.
 *    The parsing of the XML document is taken from
 *      Professional Android 2 Application Development by Reto Meier
 *  This version prints parts of the earthquake information.
 */

package earthquake;

import java.net.*;
import java.io.*;
import java.text.*;
import java.util.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

/**
 *
 * @author njmccracken
 */
public class Main {

    public static void main(String[] args)
    {
        ArrayList<Quake> earthquakes = getQuakes("http://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/2.5_day.atom");

        System.out.println("TODAY'S EARTHQUAKES 2.5 AND HIGHER");
        SimpleDateFormat df = new SimpleDateFormat("HH:MM");
        System.out.printf("%s\t%-25s\t%s\t%s\n","WHEN","LAT / LONG", "MAGNITUDE","DETAILS");
        for (Quake q : earthquakes)
        {
            System.out.printf("%s\t%-25s\t%f\t%s\n", df.format(q.getDate()),q.getLocation(),q.getMagnitude(),q.getDetails()  );
        }

    }
    
    public static ArrayList<Quake> getQuakes(String url) {
        ArrayList<Quake> quakes = new ArrayList<Quake>();
        try {
            URL eqcenterURL = new URL(url);
            URLConnection connection = eqcenterURL.openConnection();

            HttpURLConnection httpConnection = (HttpURLConnection) connection;
            int responseCode = httpConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                InputStream in = httpConnection.getInputStream();

                // creates an XML parser
                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();

                // parse the earthquake feed xml document
                Document dom = db.parse(in);
                // the dom Document is a tree of XML elements
                Element docElement = dom.getDocumentElement();

                // get a list of sll earthquakes - each has tag "entry"
                NodeList nl = docElement.getElementsByTagName("entry");
                if (nl != null && nl.getLength() > 0) {
                    // go over each earthquake on the list
                    for (int i = 0; i < nl.getLength(); i++) {
                        // this section has a series of Document accessing methods
                        //   to get the parts of the XML document item for each earthquake
                        Element entry = (Element) nl.item(i);
                        Element title = (Element) entry.getElementsByTagName("title").item(0);
                        Element g = (Element) entry.getElementsByTagName("georss:point").item(0);
                        Element when = (Element) entry.getElementsByTagName("updated").item(0);
                        Element link = (Element) entry.getElementsByTagName("link").item(0);
                        String details = title.getFirstChild().getNodeValue();
                        String hostname = "http://earthquake.usgs.gov";
                        String linkString = hostname + link.getAttribute("href");

                        String point = g.getFirstChild().getNodeValue();
                        String dt = when.getFirstChild().getNodeValue();
                        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'");
                        Date qdate = new GregorianCalendar(0, 0, 0).getTime();
                        qdate = sdformat.parse(dt);

                        String[] locationPair = point.split(" ");
                        String location = "Lat: " + locationPair[0] + " Lng: " + locationPair[1];

                        String magnitudeString = details.split(" ")[1];
                        double magnitude = Double.parseDouble(magnitudeString);

                        details = details.split("-")[1].trim();

                        // put all the earthquake info into a Quake structure
                        Quake quake = new Quake(qdate, details, location, magnitude, linkString);

                        //  add the quake to the ArrayList of Quakes
                        quakes.add(quake);
                    }
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        return quakes;
    }

}
