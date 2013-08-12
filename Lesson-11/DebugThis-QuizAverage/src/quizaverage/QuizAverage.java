/*
 * DEBUG THIS! Exercise - Quiz Average
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program will ask you to enter a series of quiz grades with acceptable
 * values between 0 and 100. When you're done entering grades input a -1.
 * At the end of the program it will report the total points earned, count of quizzes 
 * taken and display the average grade of all quizzes.
 * 
 * SAMPLE RUN(S):
 * 
 * Enter Quiz 1 grade (a value between 0 and 100 or a -1 to quit) => 80
 * Enter Quiz 2 grade (a value between 0 and 100 or a -1 to quit) => 90
 * Enter Quiz 3 grade (a value between 0 and 100 or a -1 to quit) => -1
 * Quiz Count :         2
 * Total Points:	170
 * Average Grade:	85.000000
 * 
 * 
 * Enter Quiz 1 grade (a value between 0 and 100 or a -1 to quit) => 75
 * Enter Quiz 2 grade (a value between 0 and 100 or a -1 to quit) => -2
 * Invalid Grade!
 * Enter Quiz 2 grade (a value between 0 and 100 or a -1 to quit) => 0
 * Enter Quiz 3 grade (a value between 0 and 100 or a -1 to quit) => 100
 * Enter Quiz 4 grade (a value between 0 and 100 or a -1 to quit) => -1
 * Quiz Count :         3
 * Total Points:	175
 * Average Grade:	58.333333
 * 
 * 
 * Enter Quiz 1 grade (a value between 0 and 100 or a -1 to quit) => -1
 * No Quiz Grades Entered!
 * 
 * 
 */
package quizaverage;

import java.util.Scanner;

public class QuizAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0, grade=0, total=0;
        double average=0.0;
        while (true) 
            System.out.printf("Enter Quiz %d grade (a value between 0 and 100 or a -1 to quit) => ", count);
            grade=input.nextInt();
            if (grade <-1 || grade > 100 ) {
                System.out.println("Invalid Grade!");
            } else { //Acceptable Grade
                count++;
                total += grade;
            }
        }
        if (!count=0) { 
            average = total / (double)count 
            System.out.printf("Quiz Count :\t%d\n",count);
            System.out.printf("Total Points:\t%d\n",total);
            System.out.printf("Average Grade:\t%f\n",average);
        } else {
            System.out.println("No Quiz Grades Entered!");
        }
    }
}
