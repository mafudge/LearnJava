/** Challenge Activity 2 - The "Strategy pattern" and Grade distributions.
 * 
 * Some students take a class for a grade, others take the class pass/fail
 * how do we accommodate this scenario yet still keep some flexibility for
 * additional types of grading methods in the future? The answer is using 
 * Java interfaces, of course!
 * 
 * Implement this main() method creating the 4 students in the sample output.
 * Be sure to use the appropriate strategy for each student.
 * 
 * There's a lot of code written for you and that code does some pretty impressive
 * things. I strongly suggest stepping into the constructors and getDistibution()
 * methods with the debugger and watching how the code unfolds.
 
EXAMPLE OUTPUT FROM RUN:

NAME	GRADE	DISTRIBUTION
Kelly	78	C
Tommy	50	Fail
Chuck	92	A
Sarah	85	Pass 
 * 
*/
package studentgradestrategy;

import java.util.ArrayList;

public class StudentGradeStrategyRun {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        
        //TODO: Add 4 students with appropriate name, grades & strategies to the students collection
        
        //TODO: Print out names, grade, and distribution looping over the collection

    }
}
