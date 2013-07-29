/*
 * Challenge Activity II - Palindrome Detector.
 * 
 * Write a program which given a string input will detect whether that
 * string is a palindrome.
 * https://en.wikipedia.org/wiki/Palindrome 
 * 
 * HINT: use the reverse method of StringBuilder to assist you.
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter phrase : abba 
 *   That's a palindrome!
 * 
 *   Enter phrase : mike 
 *   That's not a palindrome!
 * 
 */
package palindromedetector;

import java.util.Scanner;

public class PalindromeDetector {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter phrase : ");
        String text = input.nextLine();
        StringBuilder sb = new StringBuilder(text);
        String reverse = sb.reverse().toString();
        String result = text.equals(reverse)
                ? "That's a palindrome!" 
                : "That's not a palindrome!";
        System.out.println(result);        
    }
}
