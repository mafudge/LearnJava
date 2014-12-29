package rpgabilityscores;

import java.util.Random;

/**
 * Class for dice of many sides
 */
public final class Die {
    
    private int _sides;
    private int _value;
    private Random _generator;
    
    /**
     * this is the constructor, called when you "new" the class.
     * @param sides the number of sides on the die
     */
    public Die(int sides) {
        this._sides  = sides;
        this._generator = new Random();
        this.roll();    // roll it so it gets an initial value.
    }
    
    /**
     *  overload, to pass in an existing seed for predictable results
     * @param sides the number of sides on the die
     * @param seed  the random number seed to use
     */
    
    public Die(int sides, int seed) {
        this._sides  = sides;
        this._generator = new Random(seed);
        this.roll();    // roll it so it gets an initial value.
    }
    
    /**
     * return the number of sides of the current die
     * @return the number of sides
     */
    public int getSides() {
        return _sides;
    }
    
    /**
     * change the number of sides on an existing die
     * @param sides the new number of sides
     * @return the new number of sides
     */
    public int setSides(int sides) {
        this._sides = sides;
        return _sides;
    }
    
    /**
     * Rolls the die
     * @return the value on the face of the die
     */
    public int roll() {
        _value = _generator.nextInt(_sides)+1;
        return _value;
    }
    
    /**
     * Overloaded method will roll the Die n number of times
     * @param n the number of times to roll the Die
     * @return the sum of all the die rolls.
     */
    public int roll(int n) {
        // TODO: Implement this method to roll the die n times
        int sum = 0;
        for (int i=1;i<=n;i++) {
            sum = sum + this.roll();
        }
        return sum;
    }
    
    /**
     * Get the current value on the face of the die
     * @return the current value on the face of the die
     */
    public int getValue()
    {
        return _value;    }
        
}
