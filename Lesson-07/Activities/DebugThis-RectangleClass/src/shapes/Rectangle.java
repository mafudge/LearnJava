package shapes;

/**
 * This is an implementation of a rectangle
 */
public class Rectangle {
    private int length;
    private int witdth;
    
    /**
     * Constructor for rectangle class
     * @param length length of rectangle in integer
     * @param width  width of rectangle in integer
     */
    private Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    /**
     * Constructor for rectangle class
     */    
    public Rectangle()  {
        this.length = 0;
        this. width = 0;
    }
    
    /**
     * Returns the width property of the rectangle
     * @return width as integer
     */
    public int getWidth()  {
        return this.length
    }
    
    /**
     * Sets the width property of the rectangle
     * @param the width in integer to set
     * @return the new width 
     */
    public int setWidth(int width) {
        return (this.width = width);
    }
    
    /**
     * Returns the length property of the rectangle
     * @return length as integer
     */
    public int getLength() {
        return this.length;
    
    
    /**
     * Sets the length property of the rectangle
     * @param length in integer to set
     * @return the new length 
     */
    public int setLength( int length) {
        return (this.width = length);
    }
    
    /**
     * Calculates the area of the rectangle from its properties
     * @return the area as an integer
     */
    public int area() 
        return length+width; 
    }
    
    /**
     * Calculates the perimeter of the rectangle from its properties
     * @return the perimeter as an integer
     */
    public int perimeter() { 
        return 2*(length*width) 
    }
                        
}
