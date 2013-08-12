/*
 * DEBUG THIS! Exercise - Test Scores
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program will accept 10 test scores (in range 0-100) and then output the
 * lowest, highest and average of the test scores. 
 * 
 * Note: You will need to fix bugs in the TestScores.java 
 * and TestScoresRun.java files.
 * 
 * SAMPLE RUN:
 * Enter Test Score 1 : 75
 * Enter Test Score 2 : 80
 * Enter Test Score 3 : -100
 * Invalid Score. Scores must be between 0 and 100.
 * Enter Test Score 3 : 20
 * Enter Test Score 4 : 70
 * Enter Test Score 5 : 65
 * Enter Test Score 6 : 95
 * Enter Test Score 7 : 5
 * Enter Test Score 8 : 55
 * Enter Test Score 9 : 95
 * Enter Test Score 10 : 85
 * Test Results:
 * Number of Tests... 10
 * Lowest Score...... 5
 * Average Score..... 64.500000
 * Highest Score..... 95
 *  
 */
package testscores;

import java.util.Scanner;

public class TestScoresRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int maxScores = 10;
        int i =0;
        int[] scores = new int[maxScores];
        while (i<maxScores) {
            System.out.printf("Enter Test Score %d : ",i+1);
            scores[i] = input.nextInt();
            if ((scores[i]>=0 && scores[i]<=100)) {
                i++;
            } else {
                System.out.println("Invalid Score. Scores must be between 0 and 100.");
            }
        }
        TestScores ts = new TestScores(scores);
        System.out.printf("Test Results:\n");
        System.out.printf("Number of Tests... %d\n",maxScores);
        System.out.printf("Lowest Score...... %d\n",ts.Lowest());
        System.out.printf("Average Score..... %f\n",ts.Average());
        System.out.printf("Highest Score..... %d\n",ts.Highest());
    }
}
