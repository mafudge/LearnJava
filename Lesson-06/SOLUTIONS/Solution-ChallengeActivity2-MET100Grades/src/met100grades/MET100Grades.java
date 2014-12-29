/* Challenge Activity 3 - MET100 grades
 * 
In this challenge activity, re-write the MET100 exercise from before to 
use the custom Gradebook class. Provided in this main method is an example of
how to call the constructor and methods of the Gradebook class (object t1).

You must do the following:

1) Complete the methods inside the Gradebook.java class to get this main method
working to display the following:

Studnet	Total	Average
Test	450	1.000000

2) Re-write the main method to calculate the grades for students Dave and Jane
Dave's scores: 120,130, 135 
Jane's scores: 135,145,140

PROGRAM OUTPUT:

Studnet	Total	Average
Dave	385	0.855556
Jane	420	0.933333
Test	450	1.000000
 */

package met100grades;

public class MET100Grades {

    public static void main(String[] args) {
        Gradebook g1 = new Gradebook("Dave",120, 130, 135);
        Gradebook g2 = new Gradebook("Jane",135, 145, 140);
        Gradebook t1 = new Gradebook("Test",150,150,150);
        System.out.printf("Studnet\tTotal\tAverage\n");
        System.out.printf("%s\t%d\t%f\n"
                ,g1.studentName(), g1.totalPoints(), g1.finalAverage());
        System.out.printf("%s\t%d\t%f\n"
                ,g2.studentName(), g2.totalPoints(), g2.finalAverage());        
        System.out.printf("%s\t%d\t%f\n"
                ,t1.studentName(), t1.totalPoints(), t1.finalAverage());        
    }
}
