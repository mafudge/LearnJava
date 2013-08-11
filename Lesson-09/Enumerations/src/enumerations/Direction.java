package enumerations;

/**
 *
 * Enumerations are custom data types with their own distinct set of values.
 * They're akin to a class with constant, pre-defined set of objects.
 * 
 */
public enum Direction {
    // The values
    North (0), South (180), East (90), West (270);
    
    private final int degrees;
    
    Direction(int degrees) {
        this.degrees = degrees;
    }
    public int Degrees() { return this.degrees; }
}
