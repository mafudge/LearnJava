package studentgui;

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
    private boolean isIschool;
    private StudentYears year;
    
    public Student() {
        this.Name = "";
        this.GPA = 0.0;
        this.isIschool = true;
        this.year = StudentYears.Freshman;
    }
    
    public Student (String name, double gpa, boolean isischool, StudentYears year) {
        this.Name = name;
        this.GPA = gpa;
        this.isIschool = isischool;
        this.year = year;
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
    
    public boolean getIsIschool() {
        return this.isIschool;
    }
    
    public boolean setIsIschool( boolean isischool) {
        return (this.isIschool= isischool);
    }
    
    public StudentYears getYear() {
        return this.year;
    }
    
    public StudentYears setYear(StudentYears year) {
        return (this.year=year);
    }
    
    @Override
    public String toString() {
       return String.format("%s\t%f",this.Name, this.GPA);
    }
    
        public void Save(File file) throws FileNotFoundException, IOException {
        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream output = new ObjectOutputStream(fo);
        output.writeObject(this);
        output.close();
        fo.close();        
    }
    
    public void Load(File file) throws FileNotFoundException, IOException, ClassNotFoundException {        
        FileInputStream is = new FileInputStream(file);
        ObjectInputStream input = new ObjectInputStream(is);

        try {
            Student tmp  = (Student)input.readObject();
            this.GPA = tmp.getGPA();
            this.Name = tmp.getName();
            this.isIschool = tmp.isIschool;
            this.year = tmp.getYear();
            
        } catch (EOFException ex) {
            
        }
    }
}
