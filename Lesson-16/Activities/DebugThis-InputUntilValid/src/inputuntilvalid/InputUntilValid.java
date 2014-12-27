/*
 * DEBUG THIS! Exercise - Input until valid
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program uses custom exceptions to ensure that the user inputs a valid
 * grade point average  between 0 and 4. Two type of exceptions can be thrown:
 * 1) a custom InputOUtOfRange exception or 
 * 2) an InputMismatch exception when the user enters a non-double value.
 * 
 * SAMPLE OUTPUT: 
 * 
 * 
Enter your GPA between 0.0 and 4.0 ==>  mike
Input mismatch error. You must enter a number.
Enter your GPA between 0.0 and 4.0 ==>  99
Input out of range. You must enter a valid value.
Enter your GPA between 0.0 and 4.0 ==>  4.0
You entered a gpa of 4.000000

*/
package inputuntilvalid;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUntilValid {

    public static void main(String[] args) {
        // This program uses exceptions to handle invalid input
        double gpa;
        while (true) {
            try 
                Scanner input = new Scanner(System.in);
                System.out.print("Enter your GPA between 0.0 and 4.0 ==>  ");
                gpa = input.nextDouble();
                if (gpa < 0 && gpa > 4) {
                    throw InputOutOfRangeException();
                } else {
                    break;
                }
            } catch (InputMismatchException) {
                System.out.println("Input mismatch error. You must enter a number.");
            } catch (InputOutOfRangeexception e) {
                System.out.println("Input out of range. You must enter a valid value.");
            }
        }
        System.out.printf("You entered a gpa of %s\n",gpa);
    }
}
