/* Challenge Activity 3 - Hello your name, object style

In this challenge activity, You'll write the familiar "hello your name" program
only using an object of the custom class YourName. 

The main program should:
1) ask for your first name
2) ask for your last name
3) create a YourName object using first and last name
4) print "Hello (your full name)"
5) print "Or should I say: (your name last, first)

NOTE: before you complete this program you must first implement YourName.java!!!

EXAMPLE:

Enter your FIRST name: Michael
Enter your LAST name: Fudge
Hello, Michael Fudge!
Or should I say: Fudge, Michael

 */
package yournameobjectstyle;

import java.util.Scanner;

public class HelloYourName {

    public static void main(String[] args) {
        // TODO: Code your application logic here.
        Scanner input = new Scanner(System.in);
        String firstName, lastName;
        System.out.print("Enter your FIRST name: ");
        firstName = input.nextLine();
        System.out.print("Enter your LAST name: ");
        lastName = input.nextLine();
        YourName yourname = new YourName(firstName, lastName);
        System.out.printf("Hello, %s!\n", yourname.fullName());
        System.out.printf("Or should I say: %s\n", yourname.nameLastFirst());        
    }
}
