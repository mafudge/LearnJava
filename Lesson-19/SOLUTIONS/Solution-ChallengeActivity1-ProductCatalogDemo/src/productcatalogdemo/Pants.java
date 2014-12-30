package productcatalogdemo;

public class Pants extends Product {
    
    private int waist;
    private int inseam;
    
    public Pants(String name, double price, int waist, int inseam) {
        super (name, price);
        this.waist = waist;
        this.inseam = inseam;
    }
    
    public int getWaist() {
        return this.waist;
    }
    
    public int setWaist( int waist) {
        return (this.waist = waist);
    }
    
    public int getInseam() {
        return this.inseam;
    }
    
    public int setInseam(int inseam) {
        return (this.inseam = inseam);
    }
       
    @Override
    public String getType() {
        return "Pants";
    }
    
}
