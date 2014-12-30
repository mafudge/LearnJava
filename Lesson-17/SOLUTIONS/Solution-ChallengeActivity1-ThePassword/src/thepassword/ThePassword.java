/** Challenge Activity 1 - The Password
 * 
 * In this project folder you will find a text file called password.txt
 * inside the file is the password.
 * 
 * Write a program to load this password from the file into a string, 
 * then build a loop which asks the user to enter the password until they 
 * do so correctly 
 * 
 * Note: don't forget to close the file!
 * 
 * SAMPLE RUN: 
Enter Password: snake
Invalid Password!
Enter Password: testing
Invalid Password!
Enter Password: rhubarb
Password Accepted!
 */

package thepassword;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ThePassword {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("password.txt");
        Scanner fileinput = new Scanner(file);
        Scanner input = new Scanner(System.in);
        String password = fileinput.nextLine();
        fileinput.close();
        while(true) {
            System.out.print("Enter Password: ");
            String pw = input.nextLine();
            if (pw.equals(password)) {
                System.out.println("Password Accepted!");
                break;
            } else {
                System.out.println("Invalid Password!");
            }
        }                     
    }
}
