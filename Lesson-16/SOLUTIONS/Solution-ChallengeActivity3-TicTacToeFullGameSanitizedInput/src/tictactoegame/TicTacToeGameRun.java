/** Challenge Activity 3 - The Tic-Tac-Toe game with Sanitized input.
 * 
 * We completed this tic-tac toe game in a previous lesson, but we never
 * sanitized the input of the game! 
 * 
 * For example you can place a marker over another marker 
 * or enter invalid marker coordinates throwing an ArrayIndexOutOfBoundsException 
 * it's time to fix these issues.
 * 
 *  1) Create a new custom Exception Class called SpaceNotAvailableException.java
 *     put this class in the tictactoe package.
 *  2) In Board.java:  Modify the Place() method to throw a 
 *     SpaceNotAvailableException when the place on the board is not empty.
 *     HINT: right now it returns false.
 *  3) In TicTacToeGameRun.java, modify the main loop to handle the exceptions
 *     when you attempt to use an occupied space or place a marker outside 
 *     the boundaries of the board. Rather than exit the program they should
 *     print out a message and continue.
 * 
 *  SAMPLE RUN #1 (Demos placing outside the board):
 * 
    X's turn! Enter Row : 4
    X's turn! Enter Col : 5
    That's not a valid space. Choose again.
 * 
 *  SAMPLE RUN #2 (Demos placing over another token):
 *
  0 1 2
0  | | 
  -+-+-
1  |X| 
  -+-+-
2  | | 

O's turn! Enter Row : 1
O's turn! Enter Col : 1
That space is not available. Choose again. 

 */
package tictactoegame;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import tictactoe.*;

public class TicTacToeGameRun {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Board b = new Board(); 
        int row, col;
        boolean winner = false;
        Marker currentPlayer = Marker.X;
        System.out.printf("Let's Play Tic-Tac-Toe!!!\n\n");
        while(true) {

            // Draw Board
            b.Draw();
            
            // Get input for row and column
            System.out.printf("%s's turn! Enter Row : ",currentPlayer);
            row = input.nextInt();
            System.out.printf("%s's turn! Enter Col : ",currentPlayer);
            col = input.nextInt();            

            try {
                // place marker of current player on board at row and col            
                b.Place(currentPlayer, row, col); // place on board
                winner = b.Winner(currentPlayer); // check for winner, 
                if (winner || b.Full()) { // exit loop if winner or board full
                    break;
                }
                // Switch Players
                currentPlayer = currentPlayer == Marker.X ? Marker.O : Marker.X;

            } catch (SpaceNotAvailableException ex) {
                System.out.println("That space is not available. Choose again.");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("That's not a valid space. Choose again.");                
            }            
        } // end while
        
        b.Draw();
        // check again for winner, if not it's a tie.
        if (winner) {            
            System.out.printf("GAME OVER. %s WINS!\n", currentPlayer);
        } else {
            System.out.printf("GAME OVER. It's a TIE!\n");
        }

    }
}
