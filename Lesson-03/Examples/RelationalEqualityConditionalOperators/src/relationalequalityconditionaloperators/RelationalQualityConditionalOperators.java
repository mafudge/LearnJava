package relationalequalityconditionaloperators;

import java.util.Scanner;

public class RelationalQualityConditionalOperators {

    public static void main(String[] args) {
        // demonstrates the relational, equality and conditional operators
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value for X : ");
        int x = input.nextInt();
        System.out.print("Enter an integer value for Y : ");        
        int y = input.nextInt();
        
        System.out.printf(" X == Y ? %s\n", x == y);
        System.out.printf(" X != Y ? %s\n", x != y);
        System.out.printf(" X > Y ? %s\n", x > y);
        System.out.printf(" X <= Y ? %s\n", x <= y);
        System.out.printf(" X >= Y ? %s\n", x >= y);
        System.out.printf(" X < Y ? %s\n", x < y);
        System.out.printf(" X == Y ? booyah : no-dice ? %s\n", x==y? "booyah" : "no-dice");
        
        
    }
}
