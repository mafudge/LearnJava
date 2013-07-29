package factorial;

public class Factorial {

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.printf("%d factorial is %d\n", n,result);
    }
    
    /*
     * Calculates the factorial of a positive integer n
     * Example factorial(4) == 4*3*2*1 == 24
     */
    public static int factorial( int n ) {
        int temp = 0;
        temp = n <=0 ? 1 : n * factorial(n-1);
        return temp;
    }
}
