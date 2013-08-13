/*
 * ArrayList Example - basic creation and enumeration
 */
package arraylistexample;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        // ArrayList are dynamic collections of objects (reference types only)
        ArrayList<Student> psy101 = new ArrayList<Student>();
        
        // Adding some students
        psy101.add(new Student("Bob",2.9));
        psy101.add(new Student("Dave",3.2));
        psy101.add(new Student("Sally",4.0));
        
        // Access as a collection
        System.out.printf("Student\tGPA\n");
        for( Student s : psy101) {
            s.println();
        }
        System.out.println();
        
        // Access with an index, similar to an array
        System.out.printf("Student\tGPA\n");
        for(int i=0;i< psy101.size();i++) {
            psy101.get(i).println();
        }
                
    }
    
}
