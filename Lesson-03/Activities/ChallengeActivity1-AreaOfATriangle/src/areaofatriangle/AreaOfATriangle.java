/* Challenge Activity 1 - Area of a triangle
 * 
 * The area of a triangle is (base * height) /2
 * 
 * Write a program to accept the base and height as integer values,
 * then calculate the area of the triangle, as a double..
 * 
 * Use either an explicit or implicit cast to obtain an accurate answer.
 * Remember to format the area output to 1 decimal place.
 * 
 * SAMPLE OUTPUT:
 * 
 *   Enter triangle base : 5
 *   Enter triangle height : 3
 *   Triangle area : 7.5
 */
package areaofatriangle;

import java.util.Scanner;

public class AreaOfATriangle {

    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int base,height,area;
	System.out.println("Enter triangle base:");
	base=sc.nextInt();
	System.out.println("Enter triangle height:");
	height=sc.nextInt();
	area=(base*height)/2;
	System.out.println("Triangle area:"+area);	

    }
}
