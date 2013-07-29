/*
 * DEBUG THIS! Exercise
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program will accept an integer as input and display 
 * whether the number is ODD or EVEN.
 * By defintion, an even number has no remainder when divided by 2.
 *
 * Examples:    Enter an integer : 15
 *              15 is ODD
 * 
 *              Enter an integer : -24
 *              -24 is EVEN
 */
package oddoreven;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int i = input.nextInt();
        String result =  i%2 == 0 ? "EVEN" : "ODD";
        System.out.printf("%d is %s\n",i,result);
    }
}
