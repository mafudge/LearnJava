/*
 * Debug This! - Count the Aces
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  

 * In this activity we'll go back to our playing cards roots. This program will
 * generate a random collection of 25 playing cards, and then count the number of 
 * aces, nines and threes in the collection.
 * 
 * You'll only need to debug this file. The playingcards package is bug free ;-)
 * 
 * NOTE: these are purely random cards, and not drawn from a deck. So you might 
 *       see the same card more than once.
 * 
 * PROGRAM OUTPUT: (for random number seed 99)
 * 
Seed : 99
Cards: 3♥ 3♦ Q♠ T♠ 6♣ 9♠ 9♠ 9♠ 6♣ K♣ A♣ 6♠ 4♠ J♥ 9♠ J♣ 3♦ 8♦ J♠ 5♠ J♣ 3♥ 9♦ A♠ T♦ 
Aces : 2
Nines : 5
Threes : 4
*/
package playingcardscounttheaces;

import java.util.ArrayList;
import java.util.Random;
import playingcards.*;

public class CountTheAcesRun {
    
   public static void main(String[] args) { 
      int aces, nines, threes;
      int seed = 99;
      ArrayList<Card> cards = new ArrayList<Card>;
      Random generator = new Random(seed);
      for (int i=0;i<25;i++) {
          cards.add( Card(generator.nextInt(52)));
      }
      
      System.out.printf("Seed : %d\n",seed);
      System.out.print("Cards: ");
      printCards(cards);
      aces = countCards(cards,Ranks.ACE);
      System.out.printf("Aces : %d\n",aces);
      nines = countCards(cards,Ranks.NINE);
      System.out.printf("Nines : %d\n",threes);
      threes = countCards(cards,Ranks.THREE)
      System.out.printf("Threes : %d\n",nines);
      
   }
   
   public static void printCards(ArrayList<Card> cards) {
       for (Card c in cards) {
           System.out.printf("%s",c);
       }
       System.out.println();
   }
   
   public static int countCards(ArrayList<Card> cards, int rank) {
       int count = 0;
       for (Card c : cards) {
           if (c.rank=rank) { 
               count = count++;
           }
       }
       return count;
   }
    
}
