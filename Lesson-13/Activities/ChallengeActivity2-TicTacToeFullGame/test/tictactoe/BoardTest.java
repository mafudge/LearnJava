/*
 * PRESS CTRL+F6 to run tests.
 * 
 * When all tests pass you have written the Winner() method correctly.
 */
package tictactoe;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mafudge
 */
public class BoardTest {
    
    /**
     * Winner in first row
     */
    @Test
    public void testWinnerInFirstRow() {
        System.out.println("X Winner in 1st row");
        Marker marker = Marker.X;
        Board instance = new Board(new Marker[][] { 
                { Marker.X, Marker.X, Marker.X },
                {Marker.EMPTY, Marker.EMPTY, Marker.EMPTY },
                {Marker.EMPTY, Marker.EMPTY, Marker.EMPTY }
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }
    
    /**
     * Winner in second row
     */
    @Test
    public void testWinnerInSecondRow() {
        System.out.println("X Winner in 2nd row");
        Marker marker = Marker.X;
        Board instance = new Board(new Marker[][] { 
                {Marker.EMPTY, Marker.EMPTY, Marker.EMPTY }, 
                { Marker.X, Marker.X, Marker.X },
                {Marker.EMPTY, Marker.EMPTY, Marker.EMPTY}
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }    
    
    /**
     * Winner in third row
     */
    @Test
    public void testWinnerInThirdRow() {
        System.out.println("X Winner in 3rd row");
        Marker marker = Marker.X;
        Board instance = new Board(new Marker[][] { 
                {Marker.EMPTY, Marker.EMPTY, Marker.EMPTY }, 
                {Marker.EMPTY, Marker.EMPTY, Marker.EMPTY} ,
                {Marker.X, Marker.X, Marker.X }                    
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }    
    
    /**
     * Winner in first column
     */
    @Test
    public void testWinnerInFirstCol() {
        System.out.println("X Winner in 1st col");
        Marker marker = Marker.X;
        Board instance = new Board(new Marker[][] { 
                { Marker.X, Marker.EMPTY, Marker.EMPTY },
                {Marker.X, Marker.EMPTY, Marker.EMPTY },
                {Marker.X, Marker.EMPTY, Marker.EMPTY }
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }
    
    /**
     * Winner in second column
     */
    @Test
    public void testWinnerInSecondCol() {
        System.out.println("X Winner in 2nd col");
        Marker marker = Marker.X;
        Board instance = new Board(new Marker[][] { 
                {Marker.EMPTY, Marker.X, Marker.EMPTY }, 
                { Marker.EMPTY, Marker.X, Marker.EMPTY },
                {Marker.EMPTY, Marker.X, Marker.EMPTY}
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }    
    
    /**
     * Winner in third column
     */
    @Test
    public void testWinnerInThirdCol() {
        System.out.println("X Winner in 3rd col");
        Marker marker = Marker.X;
        Board instance = new Board(new Marker[][] { 
                {Marker.EMPTY, Marker.EMPTY, Marker.X }, 
                {Marker.EMPTY, Marker.EMPTY, Marker.X} ,
                {Marker.EMPTY, Marker.EMPTY, Marker.X }                    
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }    

        /**
     * Winner on down angle
     */
    @Test
    public void testWinnerOnDownAngle() {
        System.out.println("X Winner on down angle");
        Marker marker = Marker.X;
        Board instance = new Board(new Marker[][] { 
                { Marker.X, Marker.EMPTY, Marker.EMPTY },
                {Marker.EMPTY, Marker.X, Marker.EMPTY },
                {Marker.EMPTY, Marker.EMPTY, Marker.X}
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }
    
    /**
     * Winner on up angle
     */
    @Test
    public void testWinnerOnUpAngle() {
        System.out.println("X Winner on up angle");
        Marker marker = Marker.X;
        Board instance = new Board(new Marker[][] { 
                {Marker.EMPTY, Marker.EMPTY, Marker.X }, 
                { Marker.EMPTY, Marker.X, Marker.EMPTY },
                {Marker.X, Marker.EMPTY, Marker.EMPTY}
        });
        boolean expResult = true;
        boolean result = instance.Winner(marker);
        assertEquals(expResult, result);
    }    
    
    /**
     * Winner == none
     */
    @Test
    public void testWinnerIsNoWinner() {
        System.out.println("There is no winner");
        Marker marker = Marker.X;
        Board instance = new Board(new Marker[][] { 
                {Marker.O, Marker.X, Marker.X }, 
                {Marker.X, Marker.O, Marker.O} ,
                {Marker.X, Marker.O, Marker.X }                    
        });
        boolean expResult = false;
        boolean result = instance.Winner(marker) || instance.Winner(Marker.O);
        assertEquals(expResult, result);
    }    

}