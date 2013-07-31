/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Random;

/**
 *
 * @author mafudge
 */
public class RockPaperScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rnd = new Random();
        Player p1 = new Player("Raiden",GetRandomThrow(rnd.nextInt()));
        Player p2 = new Player("Liukang",GetRandomThrow(rnd.nextInt()));
        Game g = new Game();
        GameResult gr = null;
        int p1wins = 0;
        int p2wins = 0;
        int ties = 0;
        System.out.println(String.format("%s\t%s\t%s\t%s",p1.Name,p2.Name,"Ties","Result"));
        for (int i=0;i<100;i++) {
            p1.Throw = Throw.ROCK;//GetRandomThrow(rnd.nextInt());
            p2.Throw = GetRandomThrow(rnd.nextInt());
            gr = g.Play(p1, p2);
            if (gr.WinnerName == p1.Name) p1wins++;
            if (gr.WinnerName == p2.Name) p2wins++;
            if (gr.WinnerName == "") ties++;
            System.out.println(String.format("%03d\t%03d\t%03d\t%s",p1wins,p2wins,ties,gr.ResultText));
        }    
    }
    
    public static Throw GetRandomThrow(int seed)
    {
       Throw t = Throw.ROCK;
       seed = Math.abs(seed);
      switch(seed%3)
       {
           case 0:
               t = Throw.ROCK;
               break;
           case 1:
               t= Throw.PAPER;
               break;
           case 2:
               t= Throw.SCISSORS;
               break;
       } 
       return t;
    }
}

