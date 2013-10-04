/*
 * Challenge Activity I - CardException
 * 
 * The constructors for the Card.java class work when you specify any invalid 
 * integer. This issue is this can construct some cards with unintended values.
 * 
 * The proper way handle this situation is to have the constructor method throw 
 * a custom exception should the input fall out of valid ranges. 
 * This is especially true for the constructor which takes a suit and rank.
 * 
 * So do the following :
 * 1) Create the follwing custom exception classes in the playingcards package:
 *    - SuitOutOfRangeException.java
 *    - RankOutOfRangeException.java
 * 2) Modify the constructor in Card.java to throw an  
 *    when the suit is out of the range [0,3] and the rank is out of the 
 *    range [0,12]
 * 3) Execute your code against the 3 unit tests in CardTest.java to verify you
 *   wrote the code correctly. When you do all tests should pass.
 * 
 * Reminder ALT+F6 runs your tests.
 * 
*/

package cardexception;

public class CardExceptionRun {

    public static void main(String[] args) {
            // Reminder ALT+F6 runs your automated tests 
    }
}
