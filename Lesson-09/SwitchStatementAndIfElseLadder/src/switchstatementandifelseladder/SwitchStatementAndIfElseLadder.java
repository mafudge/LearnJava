package switchstatementandifelseladder;

import java.util.Scanner;

public class SwitchStatementAndIfElseLadder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Month [1-12] : ");
        int month = input.nextInt();
        System.out.print("Enter Day of Month [1-31] : ");
        int day = input.nextInt();
        System.out.printf("That's the %s of %s\n"
                ,getDayName(day),getMonthName(month));
    }
    
    public static String getMonthName(int month) {
        String result = "Unknown";
        switch (month)
        {
            case 1:
                result = "January";
                break;
            case 2:
                result = "February";
                break;
            case 3:
                result = "March";
                break;
            case 4:
                result = "April";
                break;
            case 5:
                result = "May";
                break;
            case 6:
                result = "June";
                break;
            case 7:
                result = "July";
                break;
            case 8:
                result = "August";
                break;
            case 9:
                result = "September";
                break;
            case 10:
                result = "October";
                break;
            case 11:
                result = "November";
                break;
            case 12:
                result = "December";
                break;
        }
        return result;
    }
    
    public static String getDayName(int day) {
        String result;
        if (day != 11 && day %10==1) {
            result = day + "st";
        } else if (day !=12 && day%10==2) {
            result = day + "nd";
        } else if (day != 13 && day%10==3) {
            result = day + "rd";
        } else {
            result = day + "th";
        }
        return result;        
    }
    
    // Think about it- how would you test the two above methods?
    // How can you ensure they're "correct for all cases"?
}
