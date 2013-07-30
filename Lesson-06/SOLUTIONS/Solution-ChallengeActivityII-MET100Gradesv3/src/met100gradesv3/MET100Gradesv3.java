/*
 * Challenge Activity II - MET100 grades v3
 * 
 * In this challenge activity, re-write the MET100 exercise to accept 3 
 * exam scores in the constructor and calculate the total points and exam average.
 * 
 * PROGRAM OUTPUT:
 *  Studnet	Total	Average
 *  Dave	385	85.555556
 *  Jane	420	93.333333
 *  
 */

package met100gradesv3;

public class MET100Gradesv3 {

    public static void main(String[] args) {
        Gradebook g1 = new Gradebook("Dave",120, 130, 135);
        Gradebook g2 = new Gradebook("Jane",135, 145, 140);
        System.out.printf("Studnet\tTotal\tAverage\n");
        System.out.printf("%s\t%d\t%f\n"
                ,g1.studentName(), g1.totalPoints(), g1.finalAverage());
        System.out.printf("%s\t%d\t%f\n"
                ,g2.studentName(), g2.totalPoints(), g2.finalAverage());        
    }
}
