package met100grades;

/**
 * This class implements a gradebook for the MET100 course.
 * @author mafudge
 */
public class Gradebook {

    public final double maxPoints = 450.0; // maximum points in the course.
    private int exam1, exam2, exam3;
    private String studentName;
    
    /**
     * Creates a new gradebook object with exam scores
     * @param name the String name of the student 
     * @param exam1 the score on exam1
     * @param exam2 the score on exam2
     * @param exam3 the score on exam3
     */
    public Gradebook(String name, int exam1, int exam2, int exam3 ) { 
        // TODO: set all private variables to their constructor arguments
    }
    
    /**
     * Gets the name of the student in this gradebook entry
     * @return name of student as String.
     */
    public String studentName() {
        // TODO: return the value of the private variable representing the 
        // student's name
        return "";
    }
    
    /**
     * Return the total number of points for this gradebook entry
     * @return total points as integer
     */
    public int totalPoints() {
        // TODO: calculate + return the total points from private variables in the class
        return 0;
    }
    
    /**
     * Calculate the final average for the gradebook entry. Represented as
     * the total points divided by the maximum amount of points.
     * @return 
     */
    public double finalAverage() {
        // TODO: calculate and return the final average 
        return 0;
    }
        
}
