package nestedforloops;

public class NestedForLoops {

    public static void main(String[] args) {
        // simple example of next for loops
        int max = 9;
        for(int i=0;i<=max;i++) {
            for(int j=0;j<=max;j++){
                System.out.printf("[%d,%d]",i,j);
            }
            System.out.println();
        }
    }
}
