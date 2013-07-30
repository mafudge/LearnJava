/*
 * DEBUG THIS! Exercise
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program will generate a random number between 1 and 5 then as you to
 * "guess" the number. It will tell you if you're right or not.
 *
 * Examples:    Pick a number between 1 and 5 : 4
 *              You guessed it!
 * 
 *              Pick a number between 1 and 5 : 4
 *              So close it was 2.
 */
package guessmynumber;

import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {

    public static void main(String[] args ) {
        int number, guess;
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        number = generator.nextInt(6)+1;
        System.out.print("Pick a number between 1 and 5 : ");
        guess = input.nextInt();
        String result = guess == number ? "You guessed it!\n" : "So close it was %d\n";
        System.out.printf(result,number);
    }
}
