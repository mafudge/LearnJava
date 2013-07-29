package understandingtypecasting;

public class UnderstandingTypeCasting {

    public static void main(String[] args) {
        // This demo will help explain type casting.
        int x = 20;
        int y = 15;
        int i = x / y;              // int / int == int
        double d1 = x / y;          // int / int == int then cast to double
        // implicit type cast
        double d2 =  x / (y * 1.0); // int * double == double; int / double = double
        // explicit type cast
        double d3 = x / (double)y;  // int / double = double
        
        System.out.println(i);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
