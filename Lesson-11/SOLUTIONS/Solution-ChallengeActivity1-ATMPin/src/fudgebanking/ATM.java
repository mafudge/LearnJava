/* Challenge Activity 1 - ATM PIN

Let's re-write the ATM example to first prompt for a pin before it shows the menu.
It should loop until you enter a valid pin or you've attempted to use the pin 3 times.

Here's the pseudocode

make a new BankAccount object with pin "1234" and an opening balance of 500
attempts = 0 
loop    
    prompt to enter pin
    accept input for pin
    add one to attempts
    if pin was entered is the same as BankAccount pin then
        exit loop with success
    if attempts >=3 then 
        exit loop with failure
end loop
if success
    show main atm menu
else
    show error message "too many invalid pins"


NOTE: be sure to use proper blocking while writing your code. neatness counts!

SAMPLE RUN (Successful pin)

*********************************
*** Welcome to FudgeBank ATM! ***
*********************************

Enter PIN # ==> 1234
*********************************
***         Main Menu         ***
*********************************

[d=Deposit,w=Withdrawl,b=Balance,q=Quit] ? q
You selected: Quit

SAMPLE RUN (three invalid attempts)

*********************************
*** Welcome to FudgeBank ATM! ***
*********************************

Enter PIN # ==> 1112
Enter PIN # ==> 3313
Enter PIN # ==> 0023
You entered an invalid pin 3 times!

 */
package fudgebanking;

import java.util.Scanner;

public class ATM {
    
    public static void main(String[] args) {    
        System.out.printf("*********************************\n");
        System.out.printf("*** Welcome to FudgeBank ATM! ***\n");
        System.out.printf("*********************************\n\n");
        Scanner input = new Scanner(System.in);
        //TODO: Write your code here.
        BankAccount myacct = new BankAccount("1234", 500);
        int attempts = 0;
        boolean success= false;
        while(true) {
            System.out.print("Enter PIN # ==> ");
            String pin = input.nextLine();
            attempts++;
            if (pin.equals(myacct.Pin())) {
                success = true;
                break;
            }
            if (attempts >= 3) {
                success = false;
                break;
            }
        }
        if (success) {
            menu();
        } else {
            System.out.println("You entered an invalid pin 3 times!");
        }        

    }

    /**  main menu of ATM  */
    public static void menu() {
        Scanner input = new Scanner(System.in);
        ATMMenu option;
        
        System.out.printf("*********************************\n");
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
