/* Challenge Activity 3

This challenge activitiy should ask for the following inputs:
- a basketball player's name
- average points per game
- height in inches

and then display the player name, average points per game, 
and height in ft and inches

There are 12 inches in 1 ft. so 75 inches is 6ft 3inches

 */
package basketballplayer;

import java.util.Scanner;


/**
 *
 * @author mafudge
 */
public class BasketballPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String playerName;
        int heightInInches;
        double avgPtsPerGame;
        System.out.print("Enter Basketball Player's Name: ");
        playerName = input.nextLine();
        System.out.printf("Enter %s's Average Points Per Game: ", playerName);
        avgPtsPerGame = input.nextDouble();
        System.out.printf("Enter %s's Height In Inches  ", playerName);
        heightInInches = input.nextInt();
        int heightInFeet = heightInInches / 12;
        int remainingInches = heightInInches % 12;

        System.out.printf(
            "%s is %d feet %d inches tall and averages %f points per game.\n",
            playerName,
            heightInFeet,
            remainingInches,
            avgPtsPerGame
        );        
    }
}