/*
 * Challenge Activity II - MET 100 grades version 2.0
 * 
 * When I was in college my MET100 Professor only gave us 3 exams. 
 * There were 150 questions on each exam. 
 * Your final grade in the course was the sum of the number of questions
 * you got right on each of exam1, exam2 and exam3 divided by 450 (the 
 * maximum possible points) 
 * 
 * Write a program which given 3 exam scores displays 
 * - your total of all 3 exam scores 
 * - your final percentage (as a double) 
 * - a final grade rounded up to the nearest whole number
 * 
 * SAMPLE RUNS (2): 
 *  Exam 1 Score : 120
 *  Exam 2 Score : 135
 *  Exam 3 Score : 130
 *  Total points : 385 / 450
 *  Percentage : 85.5555555 / 100
 *  Final Grade : 86 / 100
 *  
 *  Exam 1 Score : 115
 *  Exam 2 Score : 135
 *  Exam 3 Score : 130
 *  Total points : 380 out of 450
 *  Percentage : 84.444444 out of 100
 *  Final Grade : 84 out of 100

 */
package finalgradeinmet100v2;

import java.util.Scanner;

public class FinalGradeInMET100v2 {

    public static void main(String[] args) {
        int exam1, exam2, exam3, total, fin;
        double pct;
        Scanner input = new Scanner(System.in);
        System.out.print("Exam 1 Score : ");
        exam1 = input.nextInt();
        System.out.print("Exam 2 Score : ");
        exam2 = input.nextInt();
        System.out.print("Exam 3 Score : ");
        exam3 = input.nextInt();
        total = exam1 + exam2 + exam3;
        pct = 100.0 * total / 450;
        fin = (int) Math.round(pct);
        System.out.printf("Total points : %d out of 450\n", total);
        System.out.printf("Percentage : %f out of 100\n", pct);
        System.out.printf("Final Grade : %d out of 100\n", fin);
    }
}
