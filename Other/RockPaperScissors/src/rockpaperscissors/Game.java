/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 *
 * @author mafudge
 */
public class Game {
    
    
    public GameResult  Play(Player p1, Player p2) {
        String message = String.format("%s throws %s, %s throws %s and... ", p1.Name, p1.Throw, p2.Name, p2.Throw); 
        GameResult gameResult = new GameResult();
        
        gameResult.WinnerName =  "";
        gameResult.ResultText = message + " It's a Tie!";
        
        if (p1.Throw == Throw.PAPER && p2.Throw == Throw.ROCK) {
            gameResult.ResultText =  message + String.format("%s Wins: Paper covers rock!", p1.Name);
            gameResult.WinnerName = p1.Name;
        }
        
        if (p1.Throw == Throw.PAPER && p2.Throw == Throw.SCISSORS) {
            gameResult.ResultText=  message + String.format("%s Wins: Scissors cut paper!", p2.Name); 
            gameResult.WinnerName = p2.Name;
        }

        if (p1.Throw == Throw.SCISSORS && p2.Throw == Throw.ROCK) {
            gameResult.ResultText=  message + String.format("%s Wins: Rock smashes scissors!", p2.Name);             
            gameResult.WinnerName = p2.Name;
        }

        if (p1.Throw == Throw.SCISSORS && p2.Throw == Throw.PAPER) {
            gameResult.ResultText=  message + String.format("%s Wins: Scissors cut paper!", p1.Name);             
            gameResult.WinnerName = p1.Name;
        }
        
        if (p1.Throw == Throw.ROCK && p2.Throw == Throw.SCISSORS) {
            gameResult.ResultText=  message +  String.format("%s Wins: Rock smashes scissors!", p1.Name);             
            gameResult.WinnerName = p1.Name;
        }

        if (p1.Throw == Throw.ROCK && p2.Throw == Throw.PAPER) {
            gameResult.ResultText=  message + String.format("%s Wins: Paper covers rock!", p2.Name);
            gameResult.WinnerName = p2.Name;
        }
        
        return gameResult;
        
    }
    
}
