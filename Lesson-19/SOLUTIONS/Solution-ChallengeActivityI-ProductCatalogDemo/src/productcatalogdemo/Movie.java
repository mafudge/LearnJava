package productcatalogdemo;

public class Movie extends Product {
    
    private int runlength;
    
    public Movie(String name, double price, int runlength) {
        super (name, price);
        this.runlength = runlength;
    }
    
    public int  getRunlength() {
        return this.runlength;
    }
    
    public int setRunlength(int runlength) {
        return (this.runlength=runlength);
    }
    
    @Override
    public String getType() {
        return "Movie";
    }
    
}
