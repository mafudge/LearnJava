/** Challenge Activity 1 - Hourly Wage
 * 
 * Write a program which does the following
 * 
 *  Asks you to enter your hourly wage (double value)
 *  Until you enter a valid value
 *  Then prints out how much you will make weekly, at 40 hours / week.
 * 
SAMPLE RUN: 

* Enter your hourly wage : sfe
You didn't enter an a valid number.
Enter your hourly wage : 4r
You didn't enter an a valid number.
Enter your hourly wage : 7.85
You make $314.00 weekly.
 * 
 */
package hourlywage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HourlyWage {

    public static void main(String[] args) {
       ///TODO: Write code here
       double hourlywage;
       while(true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter your hourly wage : ");
                hourlywage = input.nextDouble();
                break;
            } catch ( InputMismatchException ex ) {
                System.out.println("You didn't enter an a valid number.");
            }
       }
       System.out.printf("You make $%.2f weekly.\n", 40* hourlywage);
    }
}
