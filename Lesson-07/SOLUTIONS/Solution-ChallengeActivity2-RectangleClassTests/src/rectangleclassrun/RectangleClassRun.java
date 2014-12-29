/** Challenge Activity 1  - RectangleClassTests
 * 
 * In this activity, you will write unit tests for all the methods in 
 * the rectangle class. Your goal is to write code which makes the tests pass
 * and verified the methods of the class were written correctly.
 * 
 * You want to open this file:
 * Test Packages >> shapes >> RectangleTest.java 

 */
package rectangleclassrun;

import java.util.Scanner;
import shapes.Rectangle;

/**
 *
 * Demonstrates use of the Rectangle class
 * 
 * SAMPLE OUTPUT:
 * Enter Rectangle Length : 5
 * Enter Rectangle Width : 3
 * Area : 15; Perimeter : 16
 */
public class RectangleClassRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.print("Enter Rectangle Length : ");
        rect.setLength(input.nextInt());
        System.out.print("Enter Rectangle Width : ");
        rect.setWidth(input.nextInt());        
        System.out.printf("Area : %d; Perimeter : %d\n", rect.area(),rect.perimeter());               
    }
}
