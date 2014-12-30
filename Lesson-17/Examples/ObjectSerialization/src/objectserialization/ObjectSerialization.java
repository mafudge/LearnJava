
package objectserialization;

import java.io.*;
import java.util.ArrayList;

public class ObjectSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("students.txt");
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Tom",3.921));
        students.add(new Student("Dave", 4.0));
        students.add(new Student("Bill",2.0));
        
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream output = new ObjectOutputStream(fo);
        for ( Student s : students) {
            output.writeObject(s);
        }
        output.close();
        fo.close();
        
        FileInputStream is = new FileInputStream(file);
        ObjectInputStream input = new ObjectInputStream(is);

        try {
            while(true) {
                    Student s = (Student)input.readObject();
                    System.out.println(s);
            }
        } catch (EOFException ex) {
            
        }
        
        
        
                
    }
}
