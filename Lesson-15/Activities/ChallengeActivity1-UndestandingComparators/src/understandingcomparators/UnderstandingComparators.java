/** Challenge Activity 1 - Understanding Comparators
 * 
 * Comparators are special classes which dictate how a collection of objects 
 * should be compared to to each other, generally for sorting and searching purposes. 
 * For base java types like int, double and even String this is trivial, 
 * but for object types like Students or Playing Cards what exactly 
 * does it mean when we say one Playing Card is "less than" another?
 * 
 * You define what that means by creating your own comparator class. 
 * The comparator class should override a compare() method which compares two 
 * values (let's call them a and b ) and returns an integer:
 * 0 when a == b
 * >0 when a > b
 * <0 when a < b 
 * 
 * The code below is similar to the video lecture. Read the code, execute it
 * and try to figure out what it does. Set breakpoints and debug if you need to.
 * 
 * Your goal for this challenge activity is to implement the proper code expression
 * inside the compare() method of StudentGpaDescendingComparator.java
 * and StudentAgeComparator to get the Students sorted in the appropriate order.
 * 
 */
package understandingcomparators;

import java.util.ArrayList;
import java.util.Collections;

public class UnderstandingComparators {

    public static void main(String[] args) {
        // ArrayList are dynamic collections of objects (reference types only)
        ArrayList<Student> students = new ArrayList<Student>();        
        // Adding some students
        students.add(new Student("Sally",4.0, 19));
        students.add(new Student("Dave",3.6, 20));
        students.add(new Student("Alice",3.15, 22));
        students.add(new Student("Steve",3.8, 20));
        students.add(new Student("Arthur",2.3, 18));
                
        printStudents(students);
        
        System.out.println("SORT BY NAME");
        Collections.sort(students, new StudentNameComparator());
        printStudents(students);
        
        System.out.println("SORT BY GPA");
        Collections.sort(students, new StudentGpaComparator());
        printStudents(students);
        
        System.out.println("SORT BY AGE");
        Collections.sort(students, new StudentAgeComparator());
        printStudents(students);
        
        System.out.println("SORT BY GPA (Highest First)");
        Collections.sort(students, new StudentGpaDescendingComparator());
        printStudents(students);
        
        
    }
    
    public static void printStudents(ArrayList<Student> students) {
        System.out.printf("Student\tAge\tGPA\n");
        for( Student s : students) {
            System.out.printf("%s\n",s);
        }
        System.out.println();
    }
}
