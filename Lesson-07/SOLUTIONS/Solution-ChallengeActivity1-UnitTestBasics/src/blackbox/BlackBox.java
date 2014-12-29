package blackbox;

/**
 * The mysterious BlackBox
 */
public class BlackBox {
    /**
     * Fizzbuzz returns:
     *  "fizzbuzz" when the number is a multiple of 3 and 5: 15, 30, etc...
     *  "fizz" when the number is a multiple of 3: 3,6,9,12,15, etc...
     *  "buzz" when the number is a multiple of 5: 5,10,15,20, etc...
     *  "" in all other cases.
     * @param number an integer 
     * @return String value of "" "fizz" "buzz" or "fizzbuzz"
     */
    public String FizzBuzz(int number) {        
        return (number%3==0? "fizz" : "") +  (number%5==0? "buzz" : "");
    }
    
}
