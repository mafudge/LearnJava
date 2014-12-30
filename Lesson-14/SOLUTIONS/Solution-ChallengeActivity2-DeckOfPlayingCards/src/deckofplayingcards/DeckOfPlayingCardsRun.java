/** Challenge Activity 2 - A Deck of Playing Cards
 * 
 * In this activity we will implement a class to satisfy a deck of cards
 * 
 * In Deck.java you'll implement all the methods with TODO sections.
 * 
 * 
 * In Hand.java you'll implement the following methods.
 *  - remove(int index) removes card at index from your hand
 *  - add(Card c) adds a card to your hand
 *  - rankCount(int rank) the count of rank in your hand
 * 
 *  Then write a main() program to accomplish the following
 *      - print the random number seed
 *      - create a new deck of cards (one deck) with seed as random number seed
 *      - print the new deck of cards (unshuffled)
 *      - shuffle the deck
 *      - print the deck again (now its shuffled)
 *      - deal 1 cards into a variable
 *      - print the deck  (now there's one less card)
 *      - return the card to the deck
 *      - print the deck again (52 card again returned card is at the end of the deck)
 
 * PROGRAM OUTPUT:

Random number seed : 44
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
      int seed = 44;
      Deck deck = new Deck(1,seed);
      System.out.printf("Random number seed: %d\n", seed);
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
