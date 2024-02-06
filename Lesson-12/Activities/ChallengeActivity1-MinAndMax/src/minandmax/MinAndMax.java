/** Challenge Activity 1 - Min and Max
 * 
 * One common programming activity is to find the minimum and maximum values 
 * within a list. In this challenge activity we will do just that. It will also
 * demonstrate how arrays and for loops compliment each other nicely.
 * 
 * First, execute the main() method as is so you can understand how the for loop 
 * works with the array.  If you must, set a breakpoint and step through the code.
 * 
 * Notice the min and max values are not correct. That's where you come in your 
 * job is to write these methods. Regardless of min or max, your approach should
 * be the same: (Here's the pseudocode for min)
 * 
 * set min to the value of the first element in the array
 * for each element in the array
 *  if the current element is less than min
 *      set min to the current element
 * end for
 * return min
 */
package minandmax;

import java.util.Scanner;

public class MinAndMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        // Read inputs into the array
        System.out.println("Enter 10 Integers.");
        for(int i=0;i<array.length;i++) {
            System.out.printf("Enter Integer %d ==>",i+1);
            array[i] = input.nextInt();
        }
        // Print out the array
        System.out.print("You Entered :");
        for(int i=0;i<array.length;i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
        // find the min / max and print
        System.out.printf("Min = %d\n",getMin(array));
        System.out.printf("Max = %d\n",getMax(array));

    }
    
    /** 
     * returns the smallest value in the array
     * @param array array of integer
     * @return integer representing the smallest
     */
    public static int getMin(int[] array) {
        //TODO: write code here
        return 0;
    }
    
    /** 
     * returns the largest value in the array
     * @param array array of integer
     * @return integer representing the largest
     */
    public static int getMax(int[] array) {
        //TODO: write code here
        return 0;
    }    
}
