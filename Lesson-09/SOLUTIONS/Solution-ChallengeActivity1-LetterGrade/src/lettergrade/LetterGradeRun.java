/** Challenge Activity 1 - Letter Grades
 * 
 * In this challenge activity, You'll ask the user to enter their final 
 * average and then output the corresponding letter grade based on 
 * the following scale:
 * 90 and above ==> A
 * 80 up to 90  ==> B
 * 70 up to 80  ==> C
 * 60 up to 70  ==> D
 * below 60     ==> F 
 * 
 * HINT: Use the "if else ladder pattern" to complete this task.
 * practice clean code blocking patterns! Neatness counts!
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

package lettergrade;

import java.util.Scanner;

public class LetterGradeRun {

    public static void main(String[] args) {
        // TODO: Complete program logic here
       Scanner input = new Scanner(System.in);
        System.out.print("Enter your final average [0-100] : ");
        double finalGrade = input.nextDouble();
        String finalLetter;
        if (finalGrade >=90) {
            finalLetter = "A";
        } else if (finalGrade >=80) {
            finalLetter = "B";
        } else if (finalGrade >=70) {
            finalLetter = "C";
        } else if (finalGrade >=60 ) {
            finalLetter = "D";
        } else {
            finalLetter = "F";
        }
        System.out.printf("A final average of %f translates to a letter grade of %s\n"
                , finalGrade, finalLetter);
        
    }
}
