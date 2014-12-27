package nsideddice;

import java.util.Random;

/**
 * Different sided die simulation
 */
public final class Die {
    
    private int _sides;
    private int _value;
    private Random _generator;
       
    // this is the contructor, called when you "new" the class.
    public Die(int sides) {
        this._sides  = sides;
        this._generator = new Random();
        this.roll();    // roll it so it gets a value.
    }
    
    // overload, to pass in an existing seed
    public Die(int sides, int seed) {
        this._sides  = sides;
        this._generator = new Random(seed);
        this.roll();    // roll it so it gets a value.
    }
    
    // get the number of sides on the die
    public int getSides() {
        return _sides;
    }
    
    // change the number of sides on the die
    public int setSides(int sides) {
        this._sides = sides;
        return _sides;
    }
    
    // simulates a dice roll
    public int roll() {
        _value = _generator.nextInt(_sides)+1;
        return _value;
    }
    
    // get value showing on die
    public int getValue()
    {
        return _value;    }
        
}
