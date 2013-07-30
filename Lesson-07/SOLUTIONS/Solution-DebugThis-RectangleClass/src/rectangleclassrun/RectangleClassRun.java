/*
 * DEBUG THIS! Exercise - Rectangle Class
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program is simular to a previous exercise only you will calculate 
 * area and perimeter using a Java class. Be sure to correct the syntax 
 * and semantic errors in both the Rectangle.java and main 
 * RectangleClassRun.java files
 * 
 * SAMPLE OUTPUT:
 * 
 * Enter Rectangle Length : 5
 * Enter Rectangle Width : 3
 * Area : 15; Perimeter : 16

*/
package rectangleclassrun;

import java.util.Scanner;
import shapes.Rectangle;

public class RectangleClassRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.print("Enter Rectangle Length : ");
        rect.setLength(input.nextInt());
        System.out.print("Enter Rectangle Width : ");
        rect.setWidth(input.nextInt());        
        System.out.printf("Area : %d; Perimeter : %d\n", rect.area(), rect.perimeter());               
    }
}
