/*Challenge Activity 2 - degrees of a triangle
 * 
 * The sum of the 3 angles of any triangle should total 180 degrees.
 * Any more or any less then the figure cannot be a triangle.
 * 
 * Write a program to accept 3 integer angles as input and checks 
 * whether it is a valid triangle by checking the sum against 180 degrees
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter degrees for angle 1 : 50
 *   Enter degrees for angle 2 : 40
 *   Enter degrees for angle 3 : 90
 *   180 degrees. That's a GOOD triangle!
 * 
 *   Enter degrees for angle 1 : 51
 *   Enter degrees for angle 2 : 40
 *   Enter degrees for angle 3 : 90
 *   181 degrees. That's a BAD triangle!
 */
package degreesofatriangle;

import java.util.Scanner;

public class DegreesOfATriangle {

    public static void main(String[] args) {
        int a1, a2, a3, sum;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter degrees for angle 1 : ");
        a1 = input.nextInt();
        System.out.print("Enter degrees for angle 2 : ");
        a2 = input.nextInt();
        System.out.print("Enter degrees for angle 3 : ");
        a3 = input.nextInt();
        sum = a1 + a2 + a3;
        String result = sum == 180 ? "GOOD" : "BAD";
        System.out.printf("%d degrees. That's a %s triangle!\n", sum, result);
    }
}
