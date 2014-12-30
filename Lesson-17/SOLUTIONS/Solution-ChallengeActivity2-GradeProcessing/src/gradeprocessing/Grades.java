/*
 * This class implements a collection of student grades
 */
package gradeprocessing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Grades {

     private ArrayList<Integer> _grades;
     
     public Grades() {
         this._grades = new ArrayList<>();
     }
     
     /**
      * Loads grades from file
      * @param file The file reference to load the grades from 
      */
     public void Load(File file) {         
         try {
             Scanner input = new Scanner( file );
             // TODO: while there is a next input add the int you read to the grade collection
             while (input.hasNext()) {
                this._grades.add(input.nextInt());
             }
             input.close();
         } catch (FileNotFoundException ex) {
             Logger.getLogger(Grades.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
     
     /**
      * returns the number of grades
      * @return the number of grades as integer
      */
     public int Count() {
         return this._grades.size();
     }
     
     /**
      * Finds the smallest  grade in the list of grades
      * @return smallest grade
      */
     public int Min() {
         int min = Integer.MAX_VALUE; // start with the highest value
         for(Integer i : this._grades) {
             if (min > i) {
                 min = i;
             }
         }
         return min;
     }
     
     /**
      * Finds the biggest grade in the list of grades
      * @return biggest grade
      */
     public int Max() {
         int max = Integer.MIN_VALUE;
         for(Integer i : this._grades) {
             if (max < i) {
                 max = i;
             }
         }
         return max;
     }

     /**
      * Finds the average grade in the list of grades
      * @return average grade
      */
     public double Avg() {
         double sum = 0;
         for(Integer i : this._grades) {
             sum += i;
         }
         return sum/this.Count();
     }

}
