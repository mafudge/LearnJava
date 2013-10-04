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
      * @return the number of grades as int
      */
     public int Count() {
         return this._grades.size();
     }
}
