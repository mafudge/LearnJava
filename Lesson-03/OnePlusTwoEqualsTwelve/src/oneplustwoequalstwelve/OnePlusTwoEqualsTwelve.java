package oneplustwoequalstwelve;

import java.util.Scanner;

public class OnePlusTwoEqualsTwelve {

    public static void main(String[] args) {
        // 1 + 2 equals 12? Whaaaaaaaaaaaaat??!?!?!?
        String x = "1";
        String y = "2";
        System.out.println(x + y);  // not what you expect;
        
        String first = "Michael ";
        String last = "Fudge";
        System.out.println(first + last );
        
        // so, how does one to convert string to int?
        int i = Integer.parseInt(x);
        int j = Integer.parseInt(y);
        
        System.out.println(i + j);
        
        // What about booleans? 
        String areYouHappy = "true";
        boolean ishappy = Boolean.parseBoolean(areYouHappy);
        System.out.println(ishappy);
        
        // Or String to double?
        String gpa = "3.96";
        Double realgpa = Double.parseDouble(gpa);
        System.out.println(realgpa - 1.0 );
    }
}
