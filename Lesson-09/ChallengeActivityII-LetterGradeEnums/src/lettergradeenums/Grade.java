
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
    // TODO: List enum values and minimum grade eg. A(90), B(80)....
   
    
    // This is the private member
    private final double minimumScore;
  
    /**
     * Write a constructor for grade with minimum score for that grade
     * @param minimumScore lowest acceptable score for that grade 
     */
    Grade (double minimumScore) {
        //TODO: assign parameter to private member
    
    }
    
    /**
     * Return the minimum score for the letter grade
     * @return lowest score fort achieving that grade
     */
    public double Min() {
        // TODO: return private member value
      
    }
            
}
