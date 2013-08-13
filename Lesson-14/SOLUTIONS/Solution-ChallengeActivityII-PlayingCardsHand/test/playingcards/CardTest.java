/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of rank method, of class Card.
     */
    @Test
    public void testRank() {
        System.out.println("rank");
        Card instance = new Card(Ranks.SEVEN, Suits.CLUBS);
        int expResult = Ranks.SEVEN;
        int result = instance.rank();
        assertEquals(expResult, result);
    }

    /**
     * Test of suit method, of class Card.
     */
    @Test
    public void testSuit() {
        System.out.println("suit");
        Card instance = new Card(Ranks.ACE, Suits.SPADES);
        int expResult =Suits.SPADES;
        int result = instance.suit();
        assertEquals(expResult, result);
    }

    /**
     * Test of sameSuit method, of class Card.
     */
    @Test
    public void testSameSuit() {
        System.out.println("sameSuit");
        Card c = new Card(Ranks.EIGHT, Suits.DIAMONDS);
        Card instance = new Card(Ranks.NINE, Suits.DIAMONDS);
        assertEquals(c.suit(), instance.suit());       
    }

    /**
     * Test of sameRank method, of class Card.
     */
    @Test
    public void testSameRank() {
        System.out.println("sameRank");
        Card c = new Card(Ranks.EIGHT, Suits.DIAMONDS);
        Card instance = new Card(Ranks.EIGHT, Suits.SPADES);
        assertEquals(c.rank(),instance.rank());
    }

    /**
     * Test of rankDiff method, of class Card.
     */
    @Test
    public void testRankDiff() {
        System.out.println("rankDiff");
        Card c = new Card(Ranks.EIGHT, Suits.DIAMONDS);
        Card instance = new Card(Ranks.JACK, Suits.SPADES);
        int expResult = instance.rank() - c.rank() ;
        int result = instance.rankDiff(c);
        assertEquals(expResult, result);
    }

}