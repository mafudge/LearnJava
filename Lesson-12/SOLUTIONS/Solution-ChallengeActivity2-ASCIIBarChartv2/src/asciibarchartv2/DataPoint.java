package asciibarchartv2;

/**
 * A Class to store the data points for our bar chart
 * @author mafudge
 */
public class DataPoint {
    
    private String label;
    private int value;
    
    /**
     * Constructor makes a new data point
     * @param label the data label for the point
     * @param value the data value for the point
     */
    public DataPoint(String name, int value) {
        this.label = name;
        this.value = value;
    }
    
    /**
     * getter for the label
     * @return the name of the label
     */
    public String getLabel() {
        return this.label;
    }
    
    /**
     * getter for the value
     * @return the name of the value
     */
    public int getValue() {
        return this.value;
    }
    
    /**
     * Draws the data point to System.out
     */
    public void plot() {
        // TODO: Implement this method
        System.out.printf("%10s : [",this.label);
        for (int i=1;i<=this.value;i++) {
            System.out.print("#");
        }
        System.out.printf("] (%d)\n",this.value);
    }
    
}
