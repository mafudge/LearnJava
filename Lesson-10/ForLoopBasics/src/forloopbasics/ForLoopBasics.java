
package forloopbasics;

public class ForLoopBasics {

    public static void main(String[] args) {
        // this demonstrates the basic for loop for iterating a specific number of times
        int max = 10;
        System.out.println("Counting Up...");
        for ( int i =1;i<=max;i++ ) {
            System.out.printf("%d ",i);
        }
        System.out.println();
        System.out.println("Counting Down...");
        for (int i=max; i>=1; i--) {
            System.out.printf("%d ",i);
        }
        System.out.println();
        
    }
}
