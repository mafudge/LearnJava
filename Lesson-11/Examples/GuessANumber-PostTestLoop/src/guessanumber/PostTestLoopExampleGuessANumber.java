/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guessanumber;

import java.util.Random;
import java.util.Scanner;

public class PostTestLoopExampleGuessANumber {

    public static void main(String[] args) {
        /* Guess a number between 1 and 10!
         * Post-Test Loop Edition.
         * Post-Test loops will execute at least ONE TIME
         * useful for "sanitizing input"
         */
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int number = generator.nextInt(10) +1;
        int guess = 0;
        int attempt =1;
        System.out.println("I'm thinking of a number between 1 and 10. What is it?!?!?");
        do {
            System.out.printf("Attempt %d : Your Guess ==> ",attempt);
            guess = input.nextInt();  
            attempt++;
        } while (guess != number);
        System.out.printf("Finally! You guessed it. It was %d.\n",guess);
    }
}
