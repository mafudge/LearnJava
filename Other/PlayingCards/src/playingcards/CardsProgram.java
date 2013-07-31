/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package playingcards;


/**
 *
 * @author mafudge
 */
public class CardsProgram {
    
       // test client
   public static void main(String[] args) { 
       
      Deck deck = new Deck();
      
      System.out.println("deck: (count=" + deck.cardCount() + ") " + deck );  
      System.out.println("shuffling....");
      deck.shuffle();
      System.out.println("deck: (count=" + deck.cardCount() + ") " + deck );  
      System.out.println("deal a card....");
      Card mine = deck.deal();
      System.out.println("deck: (count=" + deck.cardCount() + ") " + deck );  
      System.out.println("discard a card....");
      deck.discard(mine);
      System.out.println("deck: (count=" + deck.cardCount() + ") " + deck );      
   }
    
}
