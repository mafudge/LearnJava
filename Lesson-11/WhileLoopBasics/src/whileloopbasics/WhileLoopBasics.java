package whileloopbasics;

public class WhileLoopBasics {

    public static void main(String[] args) {
          // this demonstrates the basic while  loop for iterating a specific number of times
        int max = 10;
        int i = 1;
        
        System.out.println("Counting Up...");
        while (i <= max) {
            System.out.printf("%d ",i);
            // i = i + 1;
            // i += 1;
            i++;
        }
        System.out.println();
        
        i = max;
        System.out.println("Counting Down...");
        while (i>=1) {
            System.out.printf("%d ",i);
            // i = i - 1;
            // i -= 1;
            i--;
        }
        System.out.println();
    }
}
