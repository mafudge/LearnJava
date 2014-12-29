package yournameobjectstyle;

/**
 *
 * This class implements YourName. A means to get your name and return it
 * in various formats. 
 */
public class YourName {

    // TODO: create private variables for your first as last name
    private String first; // first name
    private String last;  // last name
    
    /**
     * Creates a new YourName object with arguments first and last name
     * @param firstName a String representing your first name
     * @param lastName a String representing your last name
     */
    public YourName(String firstName, String lastName) {
        // TODO: assign these arguments to their private variables
        this.first = firstName;
        this.last = lastName;
    }
    
    /**
     * Returns your full name first + last
     * @return your full name as a string
     */
    //TODO: implement complete fullName() method here
    public String fullName() {
        return this.first + " " + this.last;
    }
    
    /**
     * Returns your name last, first
     * @return a string of your name last, first
     */
    //TODO: implement the complete nameLastFirst() method here.
    public String nameLastFirst() {
        return this.last + ", " + this.first;
    }
    
       
}
