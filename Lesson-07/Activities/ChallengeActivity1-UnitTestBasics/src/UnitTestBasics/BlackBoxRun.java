/* Challenge Activity 1 - Basics of Unit Tests

What is a unit test and why is it important? Unit tests are a means to verify 
the methods we write are correct. We do this by writing code to verify our code 
is correct. The methods we test are treated as a "Black Box" - 
we know what is should do and this verify it performs as expected.

In this activity, there is one method of the BlackBox.java class written for you, 
called fizzbuzz() this method, returns one of 4 Strings:
- "fizzbuzz" when the number is a multiple of 3 and 5: 15, 30, etc...
-  "fizz" when the number is a multiple of 3: 3,6,9,12,15, etc...
- "buzz" when the number is a multiple of 5: 5,10,15,20, etc...
-  "" in all other cases.

Your job is to "prove" the method is correct by writing 4 tests. 
For example when the number is 
1) 3 we expect fizzbuzz() to return "fizz"
2) 5 we expect fizzbuzz() to return "buzz"
3) 15 we expect fizzbuzz() to return "fizzbuzz"
4) 1 we expect fizzbuzz() to return ""

Open this file to get started:
Test Packages >> blackboxtests >> BlackBoxTest.java

 */
package UnitTestBasics;

import blackbox.BlackBox;
import java.util.Scanner;

public class BlackBoxRun {

    public static void main(String[] args) {
        BlackBox b = new BlackBox();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        System.out.printf("Number %d ==> %s\n",number, b.FizzBuzz(number));
    }
}
