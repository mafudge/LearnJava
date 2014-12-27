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
    
    /**
     * Test of rank method, of class Card.
     */
    @Test
    public void testRank() {
        System.out.println("rank()");
        Card instance = new Card(Ranks.QUEEN, Suits.HEARTS);
        int expResult = Ranks.QUEEN;
        int result = instance.rank();
        assertEquals(expResult, result);
    }

    /**
     * Test of suit method, of class Card.
     */
    @Test
    public void testSuit() {
        System.out.println("suit()");
        Card instance = new Card(Ranks.QUEEN, Suits.HEARTS);
        int expResult = Suits.HEARTS;
        int result = instance.suit();
        assertEquals(expResult, result);
    }

    /**
     * Test of sameSuit method, of class Card.
     */
    @Test
    public void testSameSuit() {
        System.out.println("sameSuit()");
        Card c = new Card(Ranks.EIGHT, Suits.CLUBS);
        Card instance = new Card(Ranks.SEVEN, Suits.CLUBS);
        boolean expResult = true;
        boolean result = instance.sameSuit(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of sameRank method, of class Card.
     */
    @Test
    public void testSameRank() {
        System.out.println("sameRank()");
        Card c = new Card(Ranks.JACK, Suits.CLUBS);
        Card instance = new Card(Ranks.JACK, Suits.DIAMONDS);
        boolean expResult = true;
        boolean result = instance.sameRank(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of sameCard method, of class Card.
     */
    @Test
    public void testSameCard() {
        System.out.println("sameCard()");
        Card c = new Card(Ranks.ACE, Suits.SPADES);
        Card instance = new Card(Ranks.ACE, Suits.SPADES);
        boolean expResult = true;
        boolean result = instance.sameCard(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of rankDiff method, of class Card.
     */
    @Test
    public void testRankDiff() {
        System.out.println("rankDiff()");
        Card c = new Card(Ranks.TWO, Suits.DIAMONDS);
        Card instance = new Card(Ranks.NINE, Suits.HEARTS);
        int expResult = 7;
        int result = instance.rankDiff(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of isRed method, of class Card.
     */
    @Test
    public void testIsRed() {
        System.out.println("isRed()");
        Card instance = new Card(Ranks.NINE, Suits.HEARTS);
        boolean expResult = true;
        boolean result = instance.isRed();
        assertEquals(expResult, result);
    }

    /**
     * Test of isBlack method, of class Card.
     */
    @Test
    public void testIsBlack() {
        System.out.println("isBlack()");
        Card instance = new Card(Ranks.NINE, Suits.CLUBS);
        boolean expResult = true;
        boolean result = instance.isBlack();
        assertEquals(expResult, result);
    }

    /**
     * Test of isFace method, of class Card.
     */
    @Test
    public void testIsFace() {
        System.out.println("isFace()");
        Card instance = new Card(Ranks.JACK, Suits.HEARTS);
        boolean expResult = true;
        boolean result = instance.isFace();
        assertEquals(expResult, result);
    }

    /**
     * Test of sameColor method, of class Card.
     */
    @Test
    public void testSameColor() {
        System.out.println("sameColor()");
        Card c = new Card(Ranks.JACK, Suits.HEARTS);
        Card instance = new Card(Ranks.NINE, Suits.DIAMONDS);
        boolean expResult = true;
        boolean result = instance.sameColor(c);
        assertEquals(expResult, result);
    }

    /**
     * Test of lessThanBySuit method, of class Card.
     */
    @Test
    public void testLessThanBySuit() {
        System.out.println("lessThanBySuit()");
        /* TODO: Change this code and write a test to verify the method works */
        Card c = null;
        Card instance = null;
        boolean expResult = true;
        boolean result = instance.lessThanBySuit(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lessThanByRank method, of class Card.
     */
    @Test
    public void testLessThanByRank() {
        System.out.println("lessThanByRank()");
        /* TODO: Change this code and write a test to verify the method works */
        Card c = null;
        Card instance = null;
        boolean expResult = true;
        boolean result = instance.lessThanByRank(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    
}