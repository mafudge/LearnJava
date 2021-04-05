/* Challenge Activity 2
 * 
 * When I was in college my MET100 Professor only gave us 3 exams. 
 * There were 150 questions on each exam. 
 * Your final grade in the course was the sum of the number of questions
 * you got right on each of exam1, exam2 and exam3 divided by 450 (the 
 * maximum possible points) 
 * 
 * Write a program which given 3 exam scores displays your total of all 3
 * exam scores and percentage (as a whole number) 
 * 
 * SAMPLE RUN: 
 *  Exam 1 Score : 120
 *  Exam 2 Score : 135
 *  Exam 3 Score : 130
 *  Total points : 385
 *  Percentage : 85
 *  
 */

package finalgradeinmet100;

import java.util.Scanner;

public class FinalGradeInMET100 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a,b,c,sum,perc;
        System.out.println("ENTER SCORES IN THREE EXAMS=");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>150&&b>150&&c>150)
        {
            System.out.println("MARKS NOT APPLICABLE");
            System.exit(0);
        }
        else
        {
            sum=a+b+c;
            perc=(sum/450)*100;
            System.out.println("SUM="+sum);
            System.out.println("PERCENTAGE="+perc);
        }
             
    }
}
