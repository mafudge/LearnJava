/*
 *Implement these three tests
 */
package playingcards;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

public class CardTest {
    

    @Test
    public void testConstructorShouldPass() {
        boolean expected = true;
        boolean actual = false;
        try {
            Card c = new Card(1,1);
            actual = true;
        } catch (SuitOutOfRangeException ex) {
            actual = false;
        } catch (RankOutOfRangeException ex) {
            actual = false;
        }
        assertEquals(expected,actual);
    }
    
    
    @Test
    public void testConstructorShouldThrowRankOutOfRangeException() {
        boolean expected = true;
        boolean actual = false;
        try {
            Card c = new Card(100,1);
            actual = false;
        } catch (SuitOutOfRangeException ex) {
            actual = false;
        } catch (RankOutOfRangeException ex) {
            actual = true;
        }
        assertEquals(expected,actual);
    }
    

    @Test
    public void testConstructorShouldThrowSuitOutOfRangeException() {
        boolean expected = true;
        boolean actual = false;
        try {
            Card c = new Card(1,100);
            actual = false;
        } catch (SuitOutOfRangeException ex) {
            actual = true;
        } catch (RankOutOfRangeException ex) {
            actual = false;
        }
        assertEquals(expected,actual);
    }


}