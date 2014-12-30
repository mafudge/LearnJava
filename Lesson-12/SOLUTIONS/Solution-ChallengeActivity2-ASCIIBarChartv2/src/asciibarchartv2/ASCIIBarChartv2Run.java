/** Challenge Activity 2 - ASCII Bar Chart v2.0
 * 
 * In this challenge activity, you will implement an array-based text 
 * (ASCII) bar chart. In order to complete this activity you must do the 
 * following:
 * 
 *  1) In DataPoint.java:
 *  - Implement the plot() method which will draw plot one data point like this:
 *      Apple : [#####################] (21)
 * 
 *  2) In this java file:
 *  - complete the 2 sections of the main() method below
 * 

 *  SAMPLE OUTPUT:
 * 
 
Enter 5 data points to be plotted :
Data point 1 : Enter Label : Microsoft
Data point 1 : Enter Value : 9
Data point 2 : Enter Label : Apple
Data point 2 : Enter Value : 21
Data point 3 : Enter Label : Oracle
Data point 3 : Enter Value : 4
Data point 4 : Enter Label : Google
Data point 4 : Enter Value : 24
Data point 5 : Enter Label : Facebook
Data point 5 : Enter Value : 6

Plotting Bar Chart:
 Microsoft : [#########] (9)
     Apple : [#####################] (21)
    Oracle : [####] (4)
    Google : [########################] (24)
  Facebook : [######] (6)
  
  * 
 */
package asciibarchartv2;

import java.util.Scanner;

public class ASCIIBarChartv2Run {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataPoint[] dp = new DataPoint[5];
        int count=1;
        System.out.printf("Enter 5 data points to be plotted :\n");
        
        // TODO: write a loop to accept label and value inputs then store
        //       each as a new DataPoint in the dp array.
        while (count <=5) {
            String label;
            int value;            
            System.out.printf("Data point %d : Enter Label : ",count);
            label = input.next();
            System.out.printf("Data point %d : Enter Value : ",count);
            value = input.nextInt();
            dp[count-1] = new DataPoint(label, value);
            count++;
        }
        
        // TODO: use a for loop to call the plot() method for each of the 
        //       data points in the dp array.
        System.out.printf("\nPlotting Bar Chart:\n");
        for (DataPoint d : dp){
            d.plot();
        }
    }
}
