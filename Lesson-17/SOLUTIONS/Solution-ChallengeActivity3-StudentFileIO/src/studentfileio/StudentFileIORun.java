/** Challenge Activity 3 - Reading and Writing Students from a file
 * 
 * In this activity, we will write code to use methods which read / write 
 * student object data to / from a file. It demonstrates the use of object
 * serialization.
 * 
 * The Load() and Save() methods of the Student class have been written for you.
 * You task is to write the main() method which should do the following:
 * 
 * 1. Create File object for "student.txt
 * 2. Create two Students s1 and s2
 * 3. get input from user Name & GPA for Student s1
 * 4. Write s1 to the file.
 * 5. Read into s2 from the file
 * 6. print out student s2
 * 7. ??????
 * 8. PROFIT!!!! :-)

EXAMPLE OUTPUT FROM RUN:
Enter Student Name ==> Bill Melator
Enter Student GPA  ==> 3.42
Writing to student.txt...
Reading from student.txt...
Student: Bill Melator	3.420000
 
 * 
*/
package studentfileio;

import java.io.File;
import java.util.Scanner;

public class StudentFileIORun {

    public static void main(String[] args) {
       
        try {
            // TODO code application logic here
            
            File file = new File("student.txt");
            Scanner input = new Scanner(System.in);
            Student s1 = new Student();
            Student s2 = new Student();
            System.out.print("Enter Student Name ==> ");
            s1.setName(input.nextLine());
            System.out.print("Enter Student GPA  ==> ");
            s1.setGPA(input.nextDouble());
            System.out.printf("Writing to %s...\n",file.getName());
            s1.Save(file);
            System.out.printf("Reading from %s...\n",file.getName());
            
            s2.Load(file);
            System.out.printf("Student: %s\n", s2);
            
        } catch (Exception ex) {
            System.out.printf("ERROR: %s\n", ex);
        }
        
        
        
    }
}
