package guessanumber;

import java.util.Random;
import java.util.Scanner;

public class MidTestLoopExampleGuessANumber {

    public static void main(String[] args) {
        /* Guess a number between 1 and 10!
         * Mid-Test Loop Edition.
         * Mid-Test loops are the most flexible but with great power comes great 
         * responsibility YOU must determine when the loop should complete.
         */
        Scanner input = new Scanner(System.in);
        Random generator = new Random();
        int number = generator.nextInt(10) +1;
        int guess = 0;
        int attempt =1;
        System.out.println("I'm thinking of a number between 1 and 10. What is it?!?!?");
        while(true)
        {
             System.out.printf("Attempt %d : Your Guess ==> ",attempt);
             guess = input.nextInt();  
             attempt++;
             if ( guess > 10 || guess < 1) {
               System.out.printf("Come on! That's not between 1 and 10!\n");
             } else if (guess != number ) {
                 System.out.printf("Nope. That's not it!\n");
             } else  {
                 System.out.printf("Finally! You guessed it. It was %d.\n",guess);
                 break; //this will exit the loop
             }
         }
    }
}
