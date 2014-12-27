package customexceptionexample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionExample {

    public static void main(String[] args) {
       /* This example will throw an InputMismatchException
          when you enter a non-integer: */
       Scanner input = new Scanner(System.in);
       int i;
       System.out.print("Enter an integer between 1 and 10: ");
       try {
           i = input.nextInt();
           if (i<1 || i>10) throw new IntegerOutOfRangeException();
       } catch ( InputMismatchException ex ) {
           System.out.println("You didn't enter an Integer.");
       } catch (IntegerOutOfRangeException ex ) {
           System.out.println("Your input value is not in the specified range");
       }  
    }
}
