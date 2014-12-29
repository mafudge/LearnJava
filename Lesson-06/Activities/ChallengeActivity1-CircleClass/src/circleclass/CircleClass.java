/* Challenge Activity 1 - Circle Class
 * 
 * In this challenge activity, I've created the main routine which uses a circle
 * class. you must complete the implementation of the class by wirting the methods
 * 
 * PROGRAM OUTPUT:
 *  C1 ==> Radius : 9.000000; Area : 254.469005; Circumference : 56.548668
 *  C2 ==> Radius : 4.000000; Area : 50.265482; Circumference : 25.132741
 */
package circleclass;

public class CircleClass {

    public static void main(String[] args) {
        // NOTE: do not change any of this code.
        Circle c1 = new Circle(9);
        Circle c2 = new Circle();
        c2.setRadius(4);
        System.out.printf("C1 ==> Radius : %f; Area : %f; Circumference : %f\n"
                ,c1.getRadius(),c1.area(), c1.circ());
        System.out.printf("C2 ==> Radius : %f; Area : %f; Circumference : %f\n"
                ,c2.getRadius(),c2.area(), c2.circ());
    }
}
