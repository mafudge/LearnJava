/*
 * Debug This! - Count the Aces
 * 
 * In this activity we'll go back to our playing cards roots. This program will
 * generate a random collection of 25 playing cards, and then count the number of 
 * aces in the collection. NOTE: these are purely random cards, and not drawn 
 * from a deck. 
 * 
 * PROGRAM OUTPUT:
 * 
Deck(52) : 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ T♣ J♣ Q♣ K♣ A♣ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ T♦ J♦ Q♦ K♦ A♦ 2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ T♥ J♥ Q♥ K♥ A♥ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ T♠ J♠ Q♠ K♠ A♠ 
Shuffling....
Deck(52) : K♣ 9♥ K♦ K♠ Q♦ Q♠ 4♠ T♦ 8♦ 5♠ 6♦ 2♠ J♠ Q♣ 9♣ J♥ A♦ K♥ 9♠ 8♥ J♦ 6♣ 7♥ 4♣ 6♥ 5♥ 2♣ 9♦ 8♣ 3♠ 4♦ T♥ 3♥ Q♥ 2♦ 2♥ A♠ 3♦ 8♠ 5♦ 5♣ J♣ A♥ 7♣ 3♣ T♣ 7♠ 4♥ T♠ 7♦ 6♠ A♣ 
Deal a card. You got the K♣
Deck(51) : 9♥ K♦ K♠ Q♦ Q♠ 4♠ T♦ 8♦ 5♠ 6♦ 2♠ J♠ Q♣ 9♣ J♥ A♦ K♥ 9♠ 8♥ J♦ 6♣ 7♥ 4♣ 6♥ 5♥ 2♣ 9♦ 8♣ 3♠ 4♦ T♥ 3♥ Q♥ 2♦ 2♥ A♠ 3♦ 8♠ 5♦ 5♣ J♣ A♥ 7♣ 3♣ T♣ 7♠ 4♥ T♠ 7♦ 6♠ A♣ 
Discard a card. Returning the K♣ to the deck
Deck(52) : 9♥ K♦ K♠ Q♦ Q♠ 4♠ T♦ 8♦ 5♠ 6♦ 2♠ J♠ Q♣ 9♣ J♥ A♦ K♥ 9♠ 8♥ J♦ 6♣ 7♥ 4♣ 6♥ 5♥ 2♣ 9♦ 8♣ 3♠ 4♦ T♥ 3♥ Q♥ 2♦ 2♥ A♠ 3♦ 8♠ 5♦ 5♣ J♣ A♥ 7♣ 3♣ T♣ 7♠ 4♥ T♠ 7♦ 6♠ A♣ K♣ 
 */
package deckofplayingcards;

import playingcards.*;

public class DeckOfPlayingCardsRun {
    
   public static void main(String[] args) { 
       
       Deck deck = new Deck(1,44);      
       
      System.out.printf("Deck(%d) : %s\n",deck.cardCount(),deck.toString());  
      System.out.println("Shuffling....");
      deck.shuffle();
      System.out.printf("Deck(%d) : %s\n",deck.cardCount(),deck.toString());  
      Card mine = deck.deal();
      System.out.printf("Deal a card. You got the %s\n",mine.toString());
      System.out.printf("Deck(%d) : %s\n",deck.cardCount(),deck.toString());  
      System.out.printf("Discard a card. Returning the %s to the deck\n",mine.toString());
      deck.discard(mine);
      System.out.printf("Deck(%d) : %s\n",deck.cardCount(),deck.toString());  
   }
    
}
