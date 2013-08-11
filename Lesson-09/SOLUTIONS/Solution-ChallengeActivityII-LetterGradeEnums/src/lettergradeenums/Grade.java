
package lettergradeenums;

/**
 *
 * Java enum representation for grades, based on the following scale:
 * 90 and above ==> A
 * 80 up to 90  ==> B
 * 70 up to 80  ==> C
 * 60 up to 70  ==> D
 * below 60     ==> F 
 */
public enum Grade {
    // TODO: List enum values and minimum grade
    A (90.0), B(80.0), C(70.0), D(60.0), F(0.0);
    
    private final double minimumScore;
  
    /**
     * Write a constructor for grade with minimum score for that grade
     * @param minimumScore lowest acceptable score for that grade 
     */
    Grade (double minimumScore) {
        //TODO: assign to private member
        this.minimumScore = minimumScore;
    }
    
    /**
     * Return the minimum score for the letter grade
     * @return lowest score fort achieving that grade
     */
    public double Min() {
        // TODO: return private member
        return this.minimumScore;
    }
            
}
