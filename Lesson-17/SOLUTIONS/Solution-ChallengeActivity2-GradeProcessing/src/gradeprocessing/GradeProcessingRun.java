/** Challenge Activity 2 - Grade Processing
 * 
 * In this activity, we will write code to read from the file "grades.txt" and 
 * process some basic statistics for the grades in the file.
 * 
 * The main() method of this program is correct / complete. Your task is to 
 * implement the Load() method inside the Grades.java file.
 * 
 * Note: Grades.java uses an ArrayList to store the grades. 
 * 
 
EXAMPLE OUTPUT FROM RUN:

Grade Report:
Count :  21
Min   :  53
Avg   :  80.7
Max   :  100
 
 * 
*/
package gradeprocessing;

import java.io.File;

public class GradeProcessingRun {

    public static void main(String[] args) {

        Grades grades = new Grades();
        grades.Load(new File("grades.txt"));
        
        System.out.println("Grade Report:");
        System.out.printf("Count :  %d\n",grades.Count());
        System.out.printf("Min   :  %d\n",grades.Min());
        System.out.printf("Avg   :  %.1f\n",grades.Avg());
        System.out.printf("Max   :  %d\n",grades.Max());
        
    }
}
