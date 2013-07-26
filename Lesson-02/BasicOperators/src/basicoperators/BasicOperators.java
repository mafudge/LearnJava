package basicoperators;

import java.util.Scanner;

public class BasicOperators {

    public static void main(String[] args) {
        // Demonstrates basic arithmetic operators
        Scanner input = new Scanner(System.in);        
        int x,y, result;
        System.out.print("Enter value for X : ");
        x = input.nextInt();
        System.out.print("Enter value for Y : ");
        y = input.nextInt();
        
        result = x + y;
        System.out.printf(" X + Y = %d\n", result );                
        result = x - y;
        System.out.printf(" X - Y = %d\n", result );
        result = x * y;
        System.out.printf(" X * Y = %d\n", result );
        result = x / y;
        System.out.printf(" X / Y = %d\n", result );
        result = x % y;
        System.out.printf(" X mod Y = %d\n", result );

    }
}
