/*
 * To exeute these tests in Netbeans, press CTRL+F6
 * To debug tests, set a breakpoint and press CTRL+SHIFT+F6
 */
package playingcards;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mafudge
 */
public class CardTest {
    

    @Test
    public void LessThanBySuitThenRank_ExpectTrue_WhenClubsAndSpades() {
        //arrange
        Card instance = new Card(Ranks.JACK, Suits.CLUBS);
        Card c = new Card(Ranks.JACK,Suits.SPADES); 
        boolean expResult = true;
        //act - clubs less than spades
        boolean result = instance.lessThanBySuitThenRank(c); 
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void LessThanBySuitThenRank_ExpectFalse_WhenSpadesAndHearts() {
        //arrange
        Card instance = new Card(Ranks.JACK, Suits.SPADES);
        Card c = new Card(Ranks.JACK,Suits.HEARTS); 
        boolean expResult = false;
        //act - Spades not less than Hearts
        boolean result = instance.lessThanBySuitThenRank(c); 
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void LessThanBySuitThenRank_ExpectTrue_WhenThreeHeartsAndJackHearts() {
        //arrange
        Card instance = new Card(Ranks.THREE, Suits.HEARTS);
        Card c = new Card(Ranks.JACK,Suits.HEARTS); 
        boolean expResult = true;
        //act - both hearts, so 3 less than Jack
        boolean result = instance.lessThanBySuitThenRank(c); 
        //assert
        assertEquals(expResult, result);
    }

    @Test
    public void LessThanBySuitThenRank_ExpectFalse_WhenTenSpadesAndTwoSpades() {
        //arrange
        Card instance = new Card(Ranks.TEN, Suits.SPADES);
        Card c = new Card(Ranks.TWO,Suits.SPADES); 
        boolean expResult = false;
        //act - both spades, but ten not less than two
        boolean result = instance.lessThanBySuitThenRank(c); 
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void LessThanByRankThenSuit_ExpectTrue_WhenThreeAndKing() {
        //arrange
        Card instance = new Card(Ranks.THREE, Suits.SPADES);
        Card c = new Card(Ranks.KING,Suits.CLUBS);
        boolean expResult = true;
        //act - three less than king
        boolean result = instance.lessThanByRankThenSuit(c);
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void LessThanByRankThenSuit_ExpectFalse_WhenAceAndFive() {
        //arrange
        Card instance = new Card(Ranks.ACE, Suits.SPADES);
        Card c = new Card(Ranks.FIVE,Suits.HEARTS);
        boolean expResult = false;
        //act - ace not less than 5
        boolean result = instance.lessThanByRankThenSuit(c);
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void LessThanByRankThenSuit_ExpectTrue_WhenThreeClubsAndThreeHearts() {
        //arrange
        Card instance = new Card(Ranks.THREE, Suits.CLUBS);
        Card c = new Card(Ranks.THREE,Suits.HEARTS);
        boolean expResult = true;
        //act - name rank, so compare suit, clubs less than hearts
        boolean result = instance.lessThanByRankThenSuit(c);
        //assert
        assertEquals(expResult, result);
    }
    
    @Test
    public void LessThanByRankThenSuit_ExpectFalse_WhenKingSpadesAndKingDiamonds() {
        //arrange
        Card instance = new Card(Ranks.KING, Suits.SPADES);
        Card c = new Card(Ranks.KING,Suits.DIAMONDS);
        boolean expResult = false;
        //act - name rank, so compare suit, spades not less than diamonds
        boolean result = instance.lessThanByRankThenSuit(c);
        //assert
        assertEquals(expResult, result);
    }
}