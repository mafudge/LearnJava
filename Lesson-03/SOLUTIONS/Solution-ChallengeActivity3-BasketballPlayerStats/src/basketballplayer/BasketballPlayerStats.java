/* Challenge Activity 3 - Basketball Player Stats

This challenge activitiy should ask for the following inputs:
- a basketball player's name and the following "stats" (all integers)
- total free throws made / attempted
- total field goals made / attempted

and then display the player's "Stats"

player name, total points, free throw pct, field goal pct

For example:

Enter player's name: Tony
Free throws attempted: 4
Free throws made: 3
Field goals attempted: 10
Field goals made: 5

Tony's stats:
Points: 13 
FT %: 0.75
FG %: 0.50

 */
package basketballplayer;

import java.util.Scanner;


/**
 *
 * @author mafudge
 */
public class BasketballPlayerStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String playerName;
        int freeThrowAttempts, freeThrowsMade;
        int fieldGoalAttempts, fieldGoalsMade;
        System.out.print("Enter Player's Name: ");
        playerName = input.nextLine();
        System.out.print("Free throws attempted: ");
        freeThrowAttempts = input.nextInt();
        System.out.print("Free throws made: ");
        freeThrowsMade = input.nextInt();
        System.out.print("Field goals attempted: ");
        fieldGoalAttempts = input.nextInt();
        System.out.print("Field goals made: ");
        fieldGoalsMade = input.nextInt();
        double freeThrowPercentage = freeThrowsMade / (double)freeThrowAttempts;
        double fieldGoalPercentage = fieldGoalsMade / (double)fieldGoalAttempts;
        int totalPoints = freeThrowsMade + 2 * fieldGoalsMade;
        System.out.printf("%s's Stats:\n",playerName);
        System.out.printf("Total Points: %d\n", totalPoints);
        System.out.printf("Free-Throw Pct: %.2f\n",freeThrowPercentage);
        System.out.printf("Field Goal Pct: %.2f\n",fieldGoalPercentage);
    }
    
}
