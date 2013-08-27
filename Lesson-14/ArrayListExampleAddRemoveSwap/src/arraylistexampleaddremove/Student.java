package arraylistexampleaddremove;

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
    
    public void println() {
        System.out.printf("%s\t%f\n",this.Name, this.GPA);
    }
}
