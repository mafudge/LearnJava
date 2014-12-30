package playingcards;

import java.util.ArrayList;

/**
 * Hand : an arbitrary collection of cards.
 * @author mafudge
 */
public class Hand {
    private ArrayList<Card> cards;  // the big pile of cards
    
    /**
     * Constructor - new hand
     */
    public Hand() {
        cards = new ArrayList<Card>();        
    }
        
        
    /**
     * Removes a card from the hand at index
     * @param index the position of the card to remove
     * @return the card removed
     */
    public Card remove(int index) {
        // TODO: Implement this method
        return null;
    }
    
    /**
     * Add a card to your hand
     * @param c the card to add
     */
    public void add(Card c) {
        // TODO: Implement this method
        
    }
    
        /**
     * Get a count of cards in the hand
     * @return the number of cards in the hand
     */    
    public int cardCount() {
        return cards.size();
    }
    
    /**
     * Converts the hand of cards to a string for display.
     * @return the cards represented as a string
     */
    @Override
    public String toString() {
        String result = "";
        for (Card c : cards) {
           result += c.toString() + " ";            
        }
        return result;
    }
        
    /**
     * count the number of cards with a specified rank in the hand
     * @param rank the rank to count
     * @return an integer of the count
     */
    public int rankCount (int rank ) {
        // TODO: Implement this method
        return -1;
    }
    
}
