
/*
 * Challenge Activity II - Letter Grades with Enumerations
 * 
 * Solve the same problem as the previous challenge activity, but
 * this time use the custom java Enum in the Grade.java 
 * 
 * First, complete Grade.java, specifically:
 *  => Implement the Enum values for letter grade an minimum score for
 *     that letter grade ex. A (90), B(80),....
 *  => Implement the constructor
 *  => Implement the Min() property
 * Next, implement the Main() routine below.

 * 
 * PROGRAM OUTPUT SAMPLES:
 *  Enter your final average [0-100] : 67.8
 *  A final average of 67.800000 translates to a letter grade of D
 * 
 *  Enter your final average [0-100] : 90.0
 *  A final average of 90.000000 translates to a letter grade of A
 * 
 * Enter your final average [0-100] : 89.999999
 * A final average of 89.999999 translates to a letter grade of B
 */
package lettergradeenums;

import java.util.Scanner;

public class LetterGradeEnumsRun {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your final average [0-100] : ");
        double finalGrade = input.nextDouble();
        Grade finalLetter;
        /* TODO: Re-write the if code to use the Grade Enum
         *  to figure out letter grade 
         *  
         *  Example:
         *  if (finalGrade >=Grade.A.Min()) {
         *      finalLetter = Grade.A;
         *   ... etc....
         */

        System.out.printf("A final average of %f translates to a letter grade of %s\n"
                , finalGrade, finalLetter);
    }
}
