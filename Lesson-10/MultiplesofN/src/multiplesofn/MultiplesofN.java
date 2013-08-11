package multiplesofn;

import java.util.Scanner;

public class MultiplesofN {

    /**
     * this program lists the first 10 multiples of the input value
     */
    public static void main(String[] args) {
        int maxMultiples = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want multiples of : ");
        int multiplesOf = input.nextInt();
        for (int i=1; i<=maxMultiples;i++) {
            int answer = i *multiplesOf;
            System.out.printf("%d * %d == %d\n", i, multiplesOf, answer);
        }
    }
}
