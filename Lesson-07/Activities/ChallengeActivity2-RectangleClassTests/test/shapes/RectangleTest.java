/*
 * TODO: Implement each of these test methods by writing code which makes the 
 * test pass by verifying the method is working.
 *
 * IMPORTANT: EDIT ONLY THE LINES OF CODE IN THE //arrange PORTION OF THE TESTS
 * 
 * Press CTRL+F6 to run the tests in Netbeans.    
 */
package shapes;

import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {
    
    /**
     * Test of getWidth method, of class Rectangle.
     */
    @Test
    public void testGetWidthExpect10WhenRectangleIsL5W10() {
        //arrange - TODO setup the test so that it passes
        Rectangle instance = new Rectangle(6,9);
        int expResult = 4;  
        //act
        int result = instance.getWidth();
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of setWidth method, of class Rectangle.
     */
    @Test
    public void testSetWidthExpect7WhenWidthSetTo7() {
        //arrange  - TODO setup the test so that it passes
        int width = 99;
        Rectangle instance = new Rectangle(5,8);
        int expResult = 3;
        //act
        int result = instance.setWidth(width);
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of getLength method, of class Rectangle.
     */
    @Test
    public void testGetLengthExpect8WhenRectangleIsL8W3() {
        //arrange  - TODO setup the test so that it passes
        Rectangle instance = new Rectangle(5,10);
        int expResult = 0;
        //act
        int result = instance.getLength();
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of setLength method, of class Rectangle.
     */
    @Test
    public void testSetLengthExpect9WhenLengthSetTo9() {
        //arrange  - TODO setup the test so that it passes
        int length = 7;
        Rectangle instance = new Rectangle(6,9);
        int expResult = 0;
        //act
        int result = instance.setLength(length);
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of area method, of class Rectangle.
     */
    @Test
    public void testAreaExpect50WhenL5W10() {
        //arrange  - TODO setup the test so that it passes
        Rectangle instance = new Rectangle(9,14);
        int expResult = 5;
        //act
        int result = instance.area();
        //assert
        assertEquals(expResult, result);
    }

    /**
     * Test of perimeter method, of class Rectangle.
     */
    @Test
    public void testPerimeterExpect30WhenL5W10() {
        //arrange  - TODO setup the test so that it passes
        Rectangle instance = new Rectangle(6,13);
        int expResult = 3;
        //act
        int result = instance.perimeter();
        //assert
        assertEquals(expResult, result);
    }
}