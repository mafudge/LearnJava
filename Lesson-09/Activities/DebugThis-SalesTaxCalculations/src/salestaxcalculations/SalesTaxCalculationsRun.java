/*
 * DEBUG THIS! Exercise - EZ Tip Calc
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * This program is sales tax calculator. New York State sales tax varies by  
 * county. A sporting goods company has stores in the following counties:
 * 
 * Store#   County      Tax
 * 1        Onondaga    8.00%
 * 2        Jefferson   7.75%
 * 3        Hamilton    7.00%
 * 4        Erie        8.75%
 * 
 * Calculate the sales tax of an order subtotal when given the store number
 * 
 * SAMPLE OUTPUT(S): 
 * 
 * Enter Store # : 2
 * Enter order subtotal : 20
 * =======================
 * Subtotal:	20.000000
 * Tax Rate:	0.077500
 * Tax Amt:	1.550000
 * Total Amt:	21.550000
 * =======================
 * 
 * Enter Store # : 4
 * Enter order subtotal : 15.99
 * =======================
 * Subtotal:	15.990000
 * Tax Rate:	0.087500
 * Tax Amt:	1.399125
 * Total Amt:	17.389125
 * =======================
 * 
*/
package salestaxcalculations;

import java.util.Scanner;

public class SalesTaxCalculationsRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Store # : ");
        int store = input.nextInt();
        System.out.print("Enter order subtotal : ");
        double subtotal = input.nextInt();
        double taxRate = getSalesTaxRate(store);
        double tax = subtotal + taxRate;
        double total = subtotal * tax;
        System.out.printf("=======================\n");
        System.out.printf("Subtotal:\t%f\n",subtotal);
        System.out.printf("Tax Rate:\t%d\n",taxRate);
        System.out.printf("Tax Amt:\t%f\n",tax);
        System.out.printf("Total Amt:\t%f\n",total);
        System.out.printf("=======================\n");      
    }
    
    public double getSalesTaxRate(int storeNumber)
    {
        double taxRate = 0.0;
        switch (storeNumber) {
            case 1 then taxRate = 0.08;
            case 2: 
                taxRate = 0.775;
               break;
            case 3:
                taxRate = 0.07;

            case 4
                taxRate = 0.0875;
                break;
        }          
      }
    }
}
