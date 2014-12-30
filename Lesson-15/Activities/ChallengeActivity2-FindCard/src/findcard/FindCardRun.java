/** Challenge Activity 2 - Find the Card
 * 
 * In this activity, we will write code to deal out 7 cards each to 4 players 
 * from a shuffled deck. 
 * 
 * Next, the program should display where the A♠ is located - within one 
 * of the hands or still found in the remaining deck.
 * 
 * => You will need to implement the indexOf() methods in Deck.java and Hand.java 
 *    before attempting to implement main() java. This will require you to 
 *    search for the card... good luck!
 * 
 * PROGRAM OUTPUT: (for 1 deck of cards, random number seed 15)

FRESH DECK ==> 2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ T♣ J♣ Q♣ K♣ A♣ 2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ T♦ J♦ Q♦ K♦ A♦ 2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ T♥ J♥ Q♥ K♥ A♥ 2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ T♠ J♠ Q♠ K♠ A♠ 
SHUFFLED DECK ==> T♣ 4♥ T♠ 4♠ J♣ 4♦ 9♥ 5♥ Q♦ Q♠ J♦ 6♠ 6♥ 3♦ J♠ 2♣ 2♥ 5♠ T♥ Q♥ 8♠ 7♦ 5♦ A♣ K♥ T♦ 3♣ 9♦ 5♣ 7♥ 8♥ J♥ 2♠ 3♠ 4♣ 8♦ 6♣ Q♣ 7♣ 7♠ K♣ 9♣ 8♣ 9♠ A♦ 3♥ K♦ A♠ 6♦ K♠ A♥ 2♦ 

LOOKING FOR: A♠
HAND #0 CARDS ==> T♣ J♣ Q♦ 6♥ 2♥ 8♠ K♥  
HAND #1 CARDS ==> 4♥ 4♦ Q♠ 3♦ 5♠ 7♦ T♦  
HAND #2 CARDS ==> T♠ 9♥ J♦ J♠ T♥ 5♦ 3♣  
HAND #3 CARDS ==> 4♠ 5♥ 6♠ 2♣ Q♥ A♣ 9♦  
REMAINING DECK ==> 5♣ 7♥ 8♥ J♥ 2♠ 3♠ 4♣ 8♦ 6♣ Q♣ 7♣ 7♠ K♣ 9♣ 8♣ 9♠ A♦ 3♥ K♦ A♠ 6♦ K♠ A♥ 2♦  FOUND

*/

package findcard;

import playingcards.Card;
import playingcards.Deck;
import playingcards.Hand;
import playingcards.Ranks;
import playingcards.Suits;

public class FindCardRun {

    public static void main(String[] args) {
        Deck d = new Deck(1,15);
        Card find = new Card(Ranks.ACE, Suits.SPADES);
        Hand[] hands = new Hand[] { new Hand(), new Hand(), new Hand(), new Hand() };
        System.out.printf("FRESH DECK ==> %s\n", d.toString());
        d.shuffle();
        System.out.printf("SHUFFLED DECK ==> %s\n", d.toString());
        
        //TODO: Write a for loop to count to 7 and another for loop inside that
        //      to count to 4 where you deal a card to the hand, thus delivering
        //        7 cards to 4 people

        
        System.out.println();
        System.out.printf("LOOKING FOR: %s\n", find.toString());

        //TODO: Loop over all 4 hands[] printing the cards in the hand, and 
        // whether you found the card and one last print for the remaining deck

    
    }
}
