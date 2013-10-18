package basicsortingsearchingdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BasicSortingSearchingDemo {

    public static void main(String[] args) {
        
        // Example of sorting using built-in java.util.Collections
        Random generator = new Random(3);
        int found=-1;
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<20;i++) {
            numbers.add(generator.nextInt(100)+1);
        }
        
        System.out.println("UNSORTED");
        printNumbers(numbers);
        found = find(numbers,50);
        System.out.printf("The number %d was %s found\n", 50, found<0 ? "not" : "");
 
        Collections.sort(numbers, new IntegerComparator());
        //numbers = sort(numbers);
        System.out.println("SORTED");
        printNumbers(numbers); 
        //int found =find(numbers, 50);
        found = Collections.binarySearch(numbers,50, new IntegerComparator());
        
        System.out.printf("The number %d was %s found\n", 50, found<0 ? "not" : "");
       
    }
    
    
    /**
     * Enumerates the ArrayList, printing out the numbers
     * @param nums the ArrayList to print.
     */
    public static void printNumbers(ArrayList<Integer> nums) {
        for(int i=0;i< nums.size();i++) {
            System.out.printf("%d ",nums.get(i));
        }
        System.out.println();
    }
    
    
    /**
     * This code implements a linear search algorithm
     * @param a the ArrayList to search
     * @param target the value to find
     * @return Returns the index of the target in the ArrayList, otherwise -1
     */
    public static int find( ArrayList<Integer> a, Integer target) {
        int found = -1;
        for(int i=0;i<a.size();i++) {
            if (a.get(i)==target) {
                found = i;
                break;
            }
        }
        return found;
    }
    
    /**
     * This code implements a bubble sort algorithm
     * @param a ArrayList to sort
     * @return Sorted ArrayList
     */
    public static ArrayList<Integer> sort( ArrayList<Integer> a) {
        boolean swapped = false;
        int tmp =0;
        for(int i=0;i<a.size();i++) {
            swapped = false;
            for(int j=a.size()-1;j>i;j--) {
                if (a.get(j)< a.get(j-1)) {
                    tmp = a.get(j);
                    a.set(j, a.get(j-1));
                    a.set(j-1, tmp);
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        return a;
    }
}
