/*
 * To exeute these tests in Netbeans, press CTRL+F6
 */
package playingcards;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mafudge
 */
public class CardTest {
    
    public CardTest() {
    }
    
    /**
     * Test of rank method, of class Card.
     */
    @Test
    public void testRank() {
        System.out.println("rank()");
        //arrange
        Card instance = new Card(Ranks.QUEEN, Suits.HEARTS);
        int expResult = Ranks.QUEEN;
        //act
        int result = instance.rank();
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of suit method, of class Card.
     */
    @Test
    public void testSuit() {
        System.out.println("suit()");
        //arrange
        Card instance = new Card(Ranks.QUEEN, Suits.HEARTS);
        int expResult = Suits.HEARTS;
        //act
        int result = instance.suit();
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of sameSuit method, of class Card.
     */
    @Test
    public void testSameSuit() {
        System.out.println("sameSuit()");
        //arrange
        Card c = new Card(Ranks.EIGHT, Suits.CLUBS);
        Card instance = new Card(Ranks.SEVEN, Suits.CLUBS);
        boolean expResult = true;
        //act
        boolean result = instance.sameSuit(c);
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of sameRank method, of class Card.
     */
    @Test
    public void testSameRank() {
        System.out.println("sameRank()");
        //arrange
        Card c = new Card(Ranks.JACK, Suits.CLUBS);
        Card instance = new Card(Ranks.JACK, Suits.DIAMONDS);
        boolean expResult = true;
        //act
        boolean result = instance.sameRank(c);
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of sameCard method, of class Card.
     */
    @Test
    public void testSameCard() {
        System.out.println("sameCard()");
        //arrange
        Card c = new Card(Ranks.ACE, Suits.SPADES);
        Card instance = new Card(Ranks.ACE, Suits.SPADES);
        boolean expResult = true;
        //act
        boolean result = instance.sameCard(c);
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of rankDiff method, of class Card.
     */
    @Test
    public void testRankDiff() {
        System.out.println("rankDiff()");
        //arrange
        Card c = new Card(Ranks.TWO, Suits.DIAMONDS);
        Card instance = new Card(Ranks.NINE, Suits.HEARTS);
        int expResult = 7;
        //act
        int result = instance.rankDiff(c);
        //asert
        assertEquals(expResult, result);
    }

}