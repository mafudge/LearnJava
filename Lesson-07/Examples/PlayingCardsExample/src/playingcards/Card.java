/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package playingcards;

/**
 * Java implementation of a playing card
 * @author mafudge
 */
public class Card {    
    private int suit;      // clubs = 0, diamonds = 1, hearts = 2, spades = 3
    private int rank;      // deuce = 0, three = 1, four = 2, ..., king = 11, ace = 12

    /**
     * Creates a new card
     * @param card the integer representation of the card 0-51
     */
    public Card(int card) {
        rank = card % 13;
        suit = (card / 13) % 4;
    }

    /**
     * Creates a new card
     * @param rank the integer representation of the rank 0=deuce .. 12=ace
     * @param suit the integer representation of the suit 0=clubs .. 3=spades
     */
    public Card(int rank, int suit ) {
        this.suit = suit % 4;
        this.rank = rank % 13;
    }
 
    /**
     * Get the rank of the card
     * @return rank of card, as integer
     */
    public int rank() { return rank; }
    
    /** 
     * Get the suit of the card
     * @return suit of the card, as integer
     */
    public int suit() { return suit; }

    
    /**
     * Compares two cards to see if they are the same suit
     * @param c the card to compare to this card
     * @return true if same suit, false otherwise
     */
    public boolean sameSuit(Card c) {
        return (this.suit == c.suit);
    }
    
    /**
     * Compares two cards to see if they are the same rank
     * @param c the card to compare to this card
     * @return true if the same rank, false otherwise
     */
    public boolean sameRank(Card c) {
        return (this.rank == c.rank);
    }
    
    /**
     *  Compares to cards to see if they are the same
     * @param c the card to compare to this card
     * @return true if they are the same card
     */
    public boolean sameCard(Card c) {
        return (this.sameRank(c) && this.sameSuit(c));
    }
    
    /** 
     * Returns the difference in ranking between two cards
     * @param c the card to compare to this card
     * @return an integer difference between this card and c
     */
    public int rankDiff(Card c) {   
        return (this.rank - c.rank);
    }
    
    /**
     * Converts the card to a string format for printing
     * @return the card's representation as a string
     */
    @Override
    public String toString() {
        String ranks = "23456789TJQKA";
        String suits =  "\u2663\u2666\u2665\u2660"; //"CDHS";
        return ranks.charAt(rank) +  "" + suits.charAt(suit);
    }

}
