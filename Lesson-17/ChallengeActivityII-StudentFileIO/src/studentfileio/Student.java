package studentfileio;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
    private String Name;
    private double GPA;
    
    public Student() {
        this.Name = "";
        this.GPA = 0.0;
    }
    
    public Student (String name, double gpa) {
        this.Name = name;
        this.GPA = gpa;
    }

    public String getName() {
        return this.Name;
    }
    
    public String setName(String newName) {
        return (this.Name = newName);
    }
    
    public double getGPA() {
        return this.GPA;
    }
    
    public double setGPA(double newGPA) {
        return (this.GPA=newGPA);
    }
    
    @Override
    public String toString() {
       return String.format("%s\t%f",this.Name, this.GPA);
    }
    
    // TODO: Write this method to save the student to a file using 
    //       FileOuputStream and ObjectOutputStream
    public void Save(File file) throws FileNotFoundException, IOException {
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream output = new ObjectOutputStream(fo);
        output.writeObject(this);
        output.close();
        fo.close();        
    }
    
    // TODO: Write this method to save the student to a file using 
    //       FileInputStream and ObjectInputStream
    public void Load(File file) throws FileNotFoundException, IOException, ClassNotFoundException {        
        FileInputStream is = new FileInputStream(file);
        ObjectInputStream input = new ObjectInputStream(is);

        try {
            Student tmp  = (Student)input.readObject();
            this.GPA = tmp.getGPA();
            this.Name = tmp.getName();
            
        } catch (EOFException ex) {
            
        }
    }
}
