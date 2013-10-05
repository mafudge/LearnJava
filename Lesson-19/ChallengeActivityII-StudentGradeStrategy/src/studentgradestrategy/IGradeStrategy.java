/*
 * Interfaces are templates for generic behaviors. This interface implements a
 * grade distribution behavior. When we implement a class using this interface
 * we must define the methods provided here.
 */
package studentgradestrategy;

 interface IGradeStrategy {
     
     /* one method, returns the distribution for the grade */
     public String getDistribution(int grade);
    
}
