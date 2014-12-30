package studentgradestrategy;

/*
 * This Student class uses IGradeStrategy, since each student should get
 * a grade distribution (Letter, pass/fail, etc).
 */
public class Student {
    
    private String name;
    private int grade;
    private IGradeStrategy distro;
    
    public Student(String name, int grade, IGradeStrategy distro) {
        this.name = name;
        this.grade = grade;
        this.distro = distro;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getGrade() {
        return this.grade;
    }
    
    /**
     * This is the method which performs the magic, issuing the grade distribution
     * based on the IGradeStrategy strategy
     * @return a string representation of the grade distribution
     */
    public String getDistribution() {
        // the getDistribution() that executes is dependent on how the object was constructed.
        return this.distro.getDistribution(this.grade);
    }
}
