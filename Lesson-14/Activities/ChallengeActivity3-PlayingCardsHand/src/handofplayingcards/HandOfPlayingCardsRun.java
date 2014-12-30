/** Challenge Activity 3 - A Hand of Playing Cards
 * 
 * In this activity we will implement a class to satisfy a hand of cards
 * (which is simply a collection of cards you hold in your hand)
 * 
 * In Hand.java you'll implement the following methods.
 *  - remove(int index) removes card at index from your hand
 *  - add(Card c) adds a card to your hand
 *  - rankCount(int rank) the count of rank in your hand 
 *      iterate over the collection, counting the number of a specific rank
 * 
 *  Then write a main() program to accomplish the following
 *      - create a new deck of cards (one deck) with seed as random number seed
 *      - create a new hand
 *      - print the random number seed
 *      - print the new deck of cards
 *      - shuffle the deck
 *      - print the shuffled deck
 *      - deal 5 cards into your hand
 *      - print the hand, print the card remaining in the deck
 *      - detect whether there is a pair of queens in your hand
 *      - detect whether there is are three kings in your hand
 
 * PROGRAM OUTPUT:
 *  RUN #1
 *  (When seed=44) 
Random number seed : 44
New Deck(52)	: 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ T♣ J♣ Q♣ K♣ A♣ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ T♦ J♦ Q♦ K♦ A♦ 2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ T♥ J♥ Q♥ K♥ A♥ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ T♠ J♠ Q♠ K♠ A♠ 
Shuffled(52)	: K♣ 9♥ K♦ K♠ Q♦ Q♠ 4♠ T♦ 8♦ 5♠ 6♦ 2♠ J♠ Q♣ 9♣ J♥ A♦ K♥ 9♠ 8♥ J♦ 6♣ 7♥ 4♣ 6♥ 5♥ 2♣ 9♦ 8♣ 3♠ 4♦ T♥ 3♥ Q♥ 2♦ 2♥ A♠ 3♦ 8♠ 5♦ 5♣ J♣ A♥ 7♣ 3♣ T♣ 7♠ 4♥ T♠ 7♦ 6♠ A♣ 
Your Hand( 5)	: K♣ 9♥ K♦ K♠ Q♦   Remaining Deck(47) : Q♠ 4♠ T♦ 8♦ 5♠ 6♦ 2♠ J♠ Q♣ 9♣ J♥ A♦ K♥ 9♠ 8♥ J♦ 6♣ 7♥ 4♣ 6♥ 5♥ 2♣ 9♦ 8♣ 3♠ 4♦ T♥ 3♥ Q♥ 2♦ 2♥ A♠ 3♦ 8♠ 5♦ 5♣ J♣ A♥ 7♣ 3♣ T♣ 7♠ 4♥ T♠ 7♦ 6♠ A♣ 
Pair of Queens?	false
Three Kings?	true

 * RUN #2
 *  (When seed=99)
Random number seed : 99
New Deck(52)	: 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ T♣ J♣ Q♣ K♣ A♣ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ T♦ J♦ Q♦ K♦ A♦ 2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ T♥ J♥ Q♥ K♥ A♥ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ T♠ J♠ Q♠ K♠ A♠ 
Shuffled(52)	: Q♣ 6♥ 3♣ Q♠ 9♥ 8♥ K♦ 7♠ A♠ 5♦ 8♣ 2♣ 3♦ J♣ J♠ A♣ J♥ 5♥ 8♠ 2♥ K♠ 7♣ T♦ 9♠ 3♥ 9♦ T♠ 4♦ 5♠ 2♠ 7♥ K♥ Q♦ A♦ Q♥ 4♥ 2♦ K♣ 6♦ 4♣ 6♠ 9♣ 4♠ 8♦ J♦ T♥ A♥ 7♦ 5♣ 6♣ T♣ 3♠ 
Your Hand( 5)	: Q♣ 6♥ 3♣ Q♠ 9♥   Remaining Deck(47) : 8♥ K♦ 7♠ A♠ 5♦ 8♣ 2♣ 3♦ J♣ J♠ A♣ J♥ 5♥ 8♠ 2♥ K♠ 7♣ T♦ 9♠ 3♥ 9♦ T♠ 4♦ 5♠ 2♠ 7♥ K♥ Q♦ A♦ Q♥ 4♥ 2♦ K♣ 6♦ 4♣ 6♠ 9♣ 4♠ 8♦ J♦ T♥ A♥ 7♦ 5♣ 6♣ T♣ 3♠ 
Pair of Queens?	true
Three Kings?	false
 * 
 */
package handofplayingcards;

import playingcards.*;

public class HandOfPlayingCardsRun {
    
   public static void main(String[] args) { 
       int seed = 99;
       // TODO: Implement your code here

   }
    
}
