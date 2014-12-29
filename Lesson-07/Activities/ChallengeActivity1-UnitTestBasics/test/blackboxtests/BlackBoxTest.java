/*
In this file, we will write code to test the 4 cases of the fizzbuzz() method.
We expect:
1) fizzbuzz(3) to return "fizz"
2) fizzbuzz(5) to return "buzz"
3) fizzbuzz(15) to return "fizzbuzz"
4) fizzbuzz(1) to return ""

We will do this by writing one "test method" for each of these 4 cases. 
When we run the tests, think of each test method as its own independent program
(with the test method being the main() method). 

Test methods are coded under the following convention:
//arrange - setup the test
// act - call the method you're testing
// assert - check whether the method returned what you expected

 * IMPORTANT: EDIT ONLY THE LINES OF CODE IN THE //arrange PORTION OF THE TESTS
 * 
 * Press CTRL+F6 to run the tests in Netbeans.    
 */
package blackboxtests;

import blackbox.BlackBox;
import org.junit.Test;
import static org.junit.Assert.*;

public class BlackBoxTest {
    
    // TEST1: I wrote this one but you read it and run it. 
    @Test
    public void testFizzBuzzExpectFizzWhenNumberIs3() {
        //arrange - setup the test
        BlackBox instance = new BlackBox(); // we need a BlackBox
        int number = 3;                     // when the number is 3
        String expectedResult = "fizz";     // we expect "fizz"
        //act - call the method 
        String actualResult = instance.FizzBuzz(number);
        //assert - check whether you got what you expected!
        assertEquals(expectedResult, actualResult);
    }
    
    // TEST2: This test was not setup correctly and so it fails, please fix it!
    @Test
    public void testFizzBuzzExpectBuzzWhenNumberIs5() {
        //arrange - setup the test
        BlackBox instance = new BlackBox(); // we need a BlackBox
        int number = 0;                    // when the number is 5
        String expectedResult = "what";    // we expect "buzz"
        //act - call the method 
        String actualResult = instance.FizzBuzz(number);
        //assert - check whether you got what you expected!
        assertEquals(expectedResult, actualResult);
    }
    
    // TEST3: This test was not setup correctly and so it fails, please fix it!
    @Test
    public void testFizzBuzzExpectEmptyWhenNumberIs1() {
        //arrange - setup the test
        BlackBox instance = new BlackBox(); // we need a BlackBox
        int number = 0;                     // when the number is 1
        String expectedResult = "huh";      // we expect ""
        //act - call the method 
        String actualResult = instance.FizzBuzz(number);
        //assert - check whether you got what you expected!
        assertEquals(expectedResult, actualResult);
    }
    
    // TEST4: Write this entire test yourself
    @Test
    public void testFizzBuzzExpectFizzBuzzWhenNumberIs15() {
        //arrange - setup the test

        //act - call the method 

        //assert - check whether you got what you expected!

    }

}