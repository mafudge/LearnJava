/*
 * Debug This! - Sorting a deck of cards using 
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  

 * In this activity we'll go back to our playing cards roots. This program will
 *  use 1 deck of cards, 
 *  shuffle that deck, 
 *  sort the entire deck by rank
 *  sort the entire deck by suit
 * 
 * You'll need to debug this file Deck.java, and CardComparatorSuitFirst.java 
 * 
 * PROGRAM OUTPUT: (for 1 deck, random number seed 15)

FRESH DECK ==> 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ T♣ J♣ Q♣ K♣ A♣ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ T♦ J♦ Q♦ K♦ A♦ 2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ T♥ J♥ Q♥ K♥ A♥ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ T♠ J♠ Q♠ K♠ A♠ 
SHUFFLED DECK ==> T♣ 4♥ T♠ 4♠ J♣ 4♦ 9♥ 5♥ Q♦ Q♠ J♦ 6♠ 6♥ 3♦ J♠ 2♣ 2♥ 5♠ T♥ Q♥ 8♠ 7♦ 5♦ A♣ K♥ T♦ 3♣ 9♦ 5♣ 7♥ 8♥ J♥ 2♠ 3♠ 4♣ 8♦ 6♣ Q♣ 7♣ 7♠ K♣ 9♣ 8♣ 9♠ A♦ 3♥ K♦ A♠ 6♦ K♠ A♥ 2♦ 
DECK RANK SORT ==> 2♣ 2♦ 2♥ 2♠ 3♣ 3♦ 3♥ 3♠ 4♣ 4♦ 4♥ 4♠ 5♣ 5♦ 5♥ 5♠ 6♣ 6♦ 6♥ 6♠ 7♣ 7♦ 7♥ 7♠ 8♣ 8♦ 8♥ 8♠ 9♣ 9♦ 9♥ 9♠ T♣ T♦ T♥ T♠ J♣ J♦ J♥ J♠ Q♣ Q♦ Q♥ Q♠ K♣ K♦ K♥ K♠ A♣ A♦ A♥ A♠ 
DECK SUIT SORT ==> 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ T♣ J♣ Q♣ K♣ A♣ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ T♦ J♦ Q♦ K♦ A♦ 2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ T♥ J♥ Q♥ K♥ A♥ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ T♠ J♠ Q♠ K♠ A♠ 

*/

package debugthis.implementingcardcomparator;

import playingcards.Deck;

public class DebugThisImplementingCardComparator {

    public static void main(String[] args) {
        Deck d = new Deck(1,15);
        System.out.printf("FRESH DECK ==> %s\n", d.toString());
        d.shuffle();
        System.out.printf("SHUFFLED DECK ==> %s\n", d.toString());
        d.sortRankFirst();
        System.out.printf("DECK RANK SORT ==> %s\n", d.toString());
        d.sortSuitFirst();
        System.out.printf("DECK SUIT SORT ==> %s\n", d.toString());

    }
}
