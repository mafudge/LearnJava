/** Challenge Activity 2 - Print Bar Chart
 * 
 * In this activity you will implement a text mode bar chart.
 * For example, if you enter a value of 3 the bar chart will
 * contain three #'s ex. ###
 * The implementation is best explained through a sample run.
 * 
 * SAMPLE RUN(S):
 * 
 * Enter value for A : 4
 * Enter value for B : 13
 *  4 : [####]
 * 13 : [#############]
 * 
 * Enter value for A : 15
 * Enter value for B : 1
 * 15 : [###############]
 *  1 : [#]
 * 
 * 
 * your main() method should call the drawBarChart() method for a and b
 * the heavy lifting is done in the drawBarChart() method which requires a for loop
 */
package barchart;

import java.util.Scanner;

public class BarChartRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value for A : ");
        int a = input.nextInt();
        System.out.print("Enter value for B : ");
        int b = input.nextInt();
        
        //TODO: Call drawBarChart for a and b
        drawBarChart(a);                
        drawBarChart(b);                
    }
    
    /**
     * This method will print a value and its corresponding bar chart
     * Example val =4
     *  4: [####]
     * @param val the value of the bar
     * 
     */
    public static void drawBarChart(int val) {
        // TODO: Write implementation here 
        System.out.printf("%2d : [", val);
        for(int i=1;i<=val;i++) {
            System.out.print("#");
        }
        System.out.println("]");
    }
}
