/*
 * To exeute these tests in Netbeans, press CTRL+F6, 
 * If you need to debug, place your breakpoint and use CTRL+SHIFT+F6
 */

package playingcards;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Code coverage for isRed(), isBlack(), isSameColor() and isFace()
 * @author mafudge
 */
public class CardTest {

    @Test
    public void testIsRedExpectTrueWhenCardIsHearts() {
        //arrange - this test was setup correctly
        Card instance = new Card(Ranks.TWO, Suits.HEARTS);
        boolean expResult = true;
        //act
        boolean result = instance.isRed();
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void testIsRedExpectTrueWhenCardIsDiamonds() {
        //arrange - this test was setup correctly
        Card instance = new Card(Ranks.NINE, Suits.DIAMONDS);
        boolean expResult = true;
        //act
        boolean result = instance.isRed();
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void testIsBlackExpectTrueWhenCardIsSpades() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.TWO, Suits.SPADES);
        boolean expResult = true;
        //act
        boolean result = instance.isBlack();
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void testIsBlackExpectTrueWhenCardIsClubs() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.EIGHT, Suits.CLUBS);
        boolean expResult = true;
        //act
        boolean result = instance.isBlack();
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void testIsFaceExpectTrueWhenCardIsJack() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.JACK, Suits.CLUBS);
        boolean expResult = true;
        //act
        boolean result = instance.isFace();
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void testIsFaceExpectTrueWhenCardIsQueen() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.QUEEN, Suits.DIAMONDS);
        boolean expResult = true;
        //act
        boolean result = instance.isFace();
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void testIsFaceExpectTrueWhenCardIsKing() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.KING, Suits.SPADES);
        boolean expResult = true;
        //act
        boolean result = instance.isFace();
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void testIsFaceExpectFalseWhenCardIsAce() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.ACE, Suits.CLUBS);
        boolean expResult = false;
        //act
        boolean result = instance.isFace();
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void testIsFaceExpectFalseWhenCardIsTen() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.TEN, Suits.HEARTS);
        boolean expResult = false;
        //act
        boolean result = instance.isFace();
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSameColorExpectTrueWhenSpadesSpades() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.TEN, Suits.SPADES);
        Card c = new Card(Ranks.FIVE, Suits.SPADES);
        boolean expResult = true;
        //act
        boolean result = instance.sameColor(c);
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void testSameColorExpectTrueWhenSpadesClubs() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.TEN, Suits.SPADES);
        Card c = new Card(Ranks.FIVE, Suits.CLUBS);
        boolean expResult = true;
        //act
        boolean result = instance.sameColor(c);
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void testSameColorExpectTrueWhenHeartsDiamonds() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.TEN, Suits.HEARTS);
        Card c = new Card(Ranks.FIVE, Suits.DIAMONDS);
        boolean expResult = true;
        //act
        boolean result = instance.sameColor(c);
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void testSameColorExpectTrueWhenHeartsHearts() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.TEN, Suits.HEARTS);
        Card c = new Card(Ranks.FIVE, Suits.HEARTS);
        boolean expResult = true;
        //act
        boolean result = instance.sameColor(c);
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSameColorExpectFalseWhenHeartsSpades() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.TEN, Suits.HEARTS);
        Card c = new Card(Ranks.FIVE, Suits.SPADES);
        boolean expResult = false;
        //act
        boolean result = instance.sameColor(c);
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSameColorExpectFalseWhenClubsDiamonds() {
        //arrange TODO: arrange this test properly.
        Card instance = new Card(Ranks.TEN, Suits.DIAMONDS);
        Card c = new Card(Ranks.FIVE, Suits.CLUBS);
        boolean expResult = false;
        //act
        boolean result = instance.sameColor(c);
        //assert
        assertEquals(expResult, result);
    }

}