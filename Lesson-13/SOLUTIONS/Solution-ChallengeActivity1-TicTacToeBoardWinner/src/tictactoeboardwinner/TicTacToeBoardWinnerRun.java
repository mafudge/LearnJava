/** Challenge Activity 1 - Detect 3 in a row for Tic-Tac-Toe!
 * 
 * In this example you will implement the Winner() method inside Board.java
 * This method detects when a marker has "won" the game.
 * 
 * Note: you win the game when you get 3 of the same marker in a row on the 
 * horizontal, vertical or on the angles. You must figure out the logic to detect
 * when there is a winner.
 * 
 * To verify you wrote the Winner() method correctly, DO NOT execute this code.
 * Instead press CTRL + F6 to run the unit tests I've created. These tests inspect 
 * all possible board win combinations. 
 * 
 * When you've written the method correctly, 
 * all tests should pass. Kudos, you did it!
 * 
 * When a test fails, it should provide insight as to 
 * which win case is not correct. Verify your code for accuracy.
 *  

 */
package tictactoeboardwinner;

import tictactoe.*;

public class TicTacToeBoardWinnerRun {

    public static void main(String[] args) {
        Board b = new Board(new Marker[][] { 
                { Marker.X, Marker.X, Marker.X },
                {Marker.EMPTY, Marker.EMPTY, Marker.EMPTY },
                {Marker.O, Marker.O, Marker.O}
        });
            
        b.Draw();
        System.out.printf("\n%s is a winner : %s \n",Marker.X, b.Winner(Marker.X));
        System.out.printf("%s is a winner : %s \n",Marker.O, b.Winner(Marker.O));
        
    }
}
