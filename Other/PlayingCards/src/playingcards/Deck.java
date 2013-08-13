/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package playingcards;

import java.util.*;

/**
 *
 * @author mafudge
 */
public class Deck {
    
    private int SIZE = 52;
    private int max_card_count =1;    
    private ArrayList<Card> card_deck;
    
    public Deck() {
        this(1); // one deck
    }
               
    public Deck(int count) {
        max_card_count = count*SIZE;
        card_deck = new ArrayList<Card>();
        for (int i=0;i<max_card_count;i++) {
            card_deck.add(new Card(i));
        }
    }
    
    // Knuth shuffle
    // Refactor to the strategy pattern
    public void shuffle() {
        Random generator = new Random();
        int rand;
        for(int i=max_card_count-1;i>0;i--) { 
            rand= generator.nextInt(i);
            card_swap(i, rand); 
        } 
    }
    
    // deals a card from the top
    public Card deal() {
        return card_deck.remove(0);
    }
    
    // returns a card to the (bottom) of the pile
    public void discard(Card c) {
        card_deck.add(c);
    }
    
    private void card_swap(int i, int j) {
        Card tmp = card_deck.get(i);
        card_deck.set(i, card_deck.get(j));
        card_deck.set(j, tmp);
    }
    
    public int cardCount() {
        return card_deck.size();
    }
    
    @Override
    public String toString() {
        String result = "";
        for (Card c : card_deck) {
           result += c.toString() + " ";            
        }
        return result;
    }
    
}
