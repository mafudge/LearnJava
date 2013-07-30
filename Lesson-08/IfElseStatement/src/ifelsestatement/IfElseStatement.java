package ifelsestatement;

import java.util.Scanner;

public class IfElseStatement {

    /**
     * A Simple demonstration of the if and if else statements
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your grade a number between 0 and 100) : ");
        int grade = input.nextInt();
        if (grade > 100 || grade < 0) {
            System.out.printf("%d, eh? You're not very good following instructions!\n", grade);           
        } else {
            if (grade <70 ) {
                System.out.println("Ouch. You're not a very smart student!");
            }
            System.out.println("Thank you for entering your grade.");
        }
    }
}
