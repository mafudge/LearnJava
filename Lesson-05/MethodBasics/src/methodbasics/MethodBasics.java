package methodbasics;

import java.util.Scanner;

public class MethodBasics {

    public static void main(String[] args) {
        // TODO code application logic here
        int length, width;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length : ");
        length = input.nextInt();
        System.out.print("Enter Width : ");
        width = input.nextInt();
        int per = rectanglePerimeter(length, width);
        int area = rectangleArea(length, width);
        System.out.printf("Area: %d; Perimeter: %d\n",area,per);
    }
    
    public static int rectangleArea( int someLength, int someWidth) {
        return someLength*someWidth;
    }
    
    public static int rectanglePerimeter( int someLength, int someWidth) {
        return 2*(someLength + someWidth);
    }
}
