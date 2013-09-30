package exceptionbasics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionBasics {

    public static void main(String[] args) {
       /* This example will throw an InputMismatchException
          when you enter a non-integer: */
       Scanner input = new Scanner(System.in);
       int i;
       System.out.print("Enter an integer : ");
       try {
           i = input.nextInt();
       } catch ( InputMismatchException ex ) {
           System.out.println("You didn't enter an Integer.");
       } finally {
           System.out.println("This happens whether the exception occurs or not");
       }
    }
}
