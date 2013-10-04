/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeprocessing;

import java.io.File;

public class GradeProcessingRun {

    public static void main(String[] args) {
        // TODO code application logic here
        Grades grades = new Grades();
        grades.Load(new File("grades.txt"));
        System.out.println(grades.Count());
        
        //TODO print out count, min, max, average
    }
}
