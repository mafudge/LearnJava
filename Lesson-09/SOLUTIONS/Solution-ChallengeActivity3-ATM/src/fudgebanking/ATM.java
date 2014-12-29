/* Challenge Activity 3 - ATM

Let's use the ATMMenu enum and switch statement to a main menu for an ATM.

    1) Print the ATM menu
    2) Prompt for a menu choice: d = deposit, w = withdrawl, b = balance and q = quit.
    3) use the switch statement to determine the choice 
    4) print the output back to the user

SAMPLE EXECUTION:

*********************************
*** Welcome to FudgeBank ATM! ***
***         Main Menu         ***
*********************************

[d=Deposit,w=Withdrawl,b=Balance,q=Quit] ? w
You selected: Withdrawl

 */
package fudgebanking;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        // TODO : code here
        Scanner input = new Scanner(System.in);
        ATMMenu option;
        
        System.out.printf("*********************************\n");
        System.out.printf("*** Welcome to FudgeBank ATM! ***\n");
        System.out.printf("***         Main Menu         ***\n");
        System.out.printf("*********************************\n\n");
        System.out.printf("[%s=%s,%s=%s,%s=%s,%s=%s] ? ", 
                    ATMMenu.Deposit.Value(),ATMMenu.Deposit,
                    ATMMenu.Withdrawl.Value(),ATMMenu.Withdrawl,
                    ATMMenu.Balance.Value(),ATMMenu.Balance,
                    ATMMenu.Quit.Value(),ATMMenu.Quit
                    );
        String choice = input.nextLine();
        switch (choice)
        {
            case "d":
                option = ATMMenu.Deposit;
                break;
            case "w":
                option = ATMMenu.Withdrawl;
                break;          
            case "b":
                option = ATMMenu.Balance;
                break;          
            case "q":
                option = ATMMenu.Quit;
                break;          
            default:
                option = ATMMenu.Quit;
                break;          
        }
        System.out.printf("You selected: %s\n", option);
    }
    
}
