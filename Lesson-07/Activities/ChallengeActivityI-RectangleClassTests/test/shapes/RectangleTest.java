/*
 * TODO: Implement each of these test methods by writing code which makes the 
 * test pass by verifying the method is working.
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
    public void testGetWidth() {
        System.out.println("getWidth");
        Rectangle instance = new Rectangle();
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setWidth method, of class Rectangle.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        int width = 0;
        Rectangle instance = new Rectangle();
        int expResult = 0;
        int result = instance.setWidth(width);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLength method, of class Rectangle.
     */
    @Test
    public void testGetLength() {
        System.out.println("getLength");
        Rectangle instance = new Rectangle();
        int expResult = 0;
        int result = instance.getLength();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLength method, of class Rectangle.
     */
    @Test
    public void testSetLength() {
        System.out.println("setLength");
        int length = 0;
        Rectangle instance = new Rectangle();
        int expResult = 0;
        int result = instance.setLength(length);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of area method, of class Rectangle.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Rectangle instance = new Rectangle();
        int expResult = 0;
        int result = instance.area();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of perimeter method, of class Rectangle.
     */
    @Test
    public void testPerimeter() {
        System.out.println("perimeter");
        Rectangle instance = new Rectangle();
        int expResult = 0;
        int result = instance.perimeter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}