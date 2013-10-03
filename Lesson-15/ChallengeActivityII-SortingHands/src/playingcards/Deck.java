package playingcards;

import java.util.*;

/**
 * An implementation for a deck of cards!
 * @author mafudge
 */
public class Deck {
        
    private int SIZE = 52;              // 52 cards in a deck
    private int max_card_count =1;      // for multiple-deck implementations
    private ArrayList<Card> card_deck;  // the big pile of cards
    private int seed =0;                // random number seed used
    private Random generator;           // random number generator for shuffle()
    
    /**
     * Default constructor creates 1 deck of cards
     */
    public Deck() {
        this(1);
    }
               
    /**
     * Overloaded constructor for multiple-decks of cards.
     * @param count the number of decks
     */
    public Deck(int count) {
        this(count,0);
    }
    
    /**
     * Overloaded constructor for multiple-decks of cards.
     * @param count the number of decks
     * @param seed specific random number seed to use (0 => random)
     */    
    public Deck(int count, int seed) {
        this.seed = seed;
        generator = seed==0 ? new Random() : new Random(this.seed);
        max_card_count = count*SIZE;
        card_deck = new ArrayList<Card>();
        for (int i=0;i<max_card_count;i++) {
            card_deck.add(new Card(i));
        }
    }
        
    /**
     * Shuffles the cards using the Collections.shuffle algorithm 
     */
    public void shuffle() {
        Collections.shuffle(card_deck, generator);
    }
        
    /**
     * Removes a card from the top of the deck
     * @return the card from the top of the deck
     */
    public Card deal() {
        return card_deck.remove(0);
    }
    
    /**
     * returns card c to the bottom of the deck
     * @param c the card to return
     */
    public void discard(Card c) {
        card_deck.add(c);
    }
    
    /**
     * private helper member, used to swap two cards in the deck
     * @param i the position of one card in the deck
     * @param j the position of the other card in the deck
     */
    private void card_swap(int i, int j) {
        Card tmp = card_deck.get(i);
        card_deck.set(i, card_deck.get(j));
        card_deck.set(j, tmp);
    }
    
    /**
     * Get a count of cards in the deck
     * @return the number of cards in the deck
     */    
    public int cardCount() {
        //TODO: return the number of cards in the array list
        return card_deck.size();
    }
    
    /**
     * Sorts the Deck ranks first
     */
    public void sortRankFirst() {
        // Use the comparator to sort the collection of cards
        Collections.sort(card_deck, new CardComparatorRankFirst() );
    }
    

    /**
     * Sorts the Deck ranks first
     */
    public void sortSuitFirst() {
        // Use the comparator to sort the collection of cards
        Collections.sort(card_deck, new CardComparatorSuitFirst() );
    }
    
    /**
     * Converts the deck of card to a string for display.
     * @return the cards represented as a string
     */
    @Override
    public String toString() {
        String result = "";
        for (Card c : card_deck) {
           result += c.toString() + " ";            
        }
        return result;
    }
    
}
