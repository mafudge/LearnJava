/* Challenge Activity 2 - Palindrome Detector.
 * 
 * Write a program which given a string input will detect whether that
 * string is a palindrome. see: https://en.wikipedia.org/wiki/Palindrome 
 * for details.
 * 
 * HINT: use the reversePhrase method of StringBuilder to assist you.
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
        String phrase = input.nextLine();
        StringBuilder sb = new StringBuilder(phrase);
        String reversePhrase = sb.reverse().toString();
        String result = phrase.equals(reversePhrase)
                ? "That's a palindrome!" 
                : "That's not a palindrome!";
        System.out.println(result);        
    }
}
