/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package playingcards;

/**
 *
 * @author mafudge
 */
public class Card { 
    private int suit;      // clubs = 0, diamonds = 1, hearts = 2, spades = 3
    private int rank;      // deuce = 0, three = 1, four = 2, ..., king = 11, ace = 12

    // create a new card based on integer 0 = 2C, 1 = 3C, ..., 51 = AS
    public Card(int card) {
        rank = card % 13;
        suit = (card / 13) % 4;
    }

    public Card(int rank, int suit ) {
        this.suit = suit % 4;
        this.rank = rank % 13;
    }
 
    public int rank() { return rank; }
    public int suit() { return suit; }

    // for sorting cards by suit, then rank, as in Bridge or Hearts
    public boolean lessThan(Card c) {
        if      (this.suit < c.suit) return true;
        else if (this.suit > c.suit) return false;
        else if (this.rank < c.rank) return true;
        else                    return false;
    }
    
    public boolean sameSuit(Card c) {
        return (this.suit == c.suit);
    }
    
    public boolean sameRank(Card c) {
        return (this.rank == c.rank);
    }
    
    public int rankDiff(Card c) {   
        return (this.rank - c.rank);
    }

    // represent cards like "2H", "9C", "JS", "AD"
    @Override
    public String toString() {
        String ranks = "23456789TJQKA";
        String suits =  "\u2663\u2666\u2665\u2660"; //"CDHS";
        return ranks.charAt(rank) +  "" + suits.charAt(suit);
    }

}