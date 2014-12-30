/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package understandingcomparators;

import java.io.PrintStream;

public class Student {
    private String Name;
    private double GPA;
    private int age;
    
    public Student(String name, double gpa, int age) {
        this.Name = name;
        this.GPA = gpa;
        this.age = age;
    }
    
    public String getName() {
        return this.Name;
    }
    
    public String getName(String newName) {
        return (this.Name = newName);
    }
    
    public double getGPA() {
        return this.GPA;
    }
    
    public double setGPA(double newGPA) {
        return (this.GPA=newGPA);
    }
    
    public int getAge() {
        return this.age;
    }
    
    public int setAge(int newAge) {
       return (this.age = newAge);
    }
    
    @Override
    public String toString() {
       return String.format("%s\t%d\t%f",this.Name, this.age, this.GPA);
    }
}
