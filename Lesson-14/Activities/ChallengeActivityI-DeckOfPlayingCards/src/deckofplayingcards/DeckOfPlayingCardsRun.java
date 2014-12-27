/*
 * This gives a demo of a deck of cards
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
