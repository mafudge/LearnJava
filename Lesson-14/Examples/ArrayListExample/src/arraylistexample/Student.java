package arraylistexample;

/**
 * Student Class. Used in the ArrayList Example
 * @author mafudge
 */
public class Student {
    private String Name;
    private double GPA;
    
    public Student(String name, double gpa) {
        this.Name = name;
        this.GPA = gpa;
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
    
    @Override
    public String toString() {
        return String.format("%s\t%f",this.Name, this.GPA);
    }
}
