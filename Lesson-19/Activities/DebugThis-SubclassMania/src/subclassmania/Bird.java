package subclassmania;

/**
 *
 */
public class Bird  implements Animal {

    @Override
    public String MakeNoise() {
        return "Cheap";
    }
    
    public boolean hasFeathers() {
        return true;
    }
    
    
}
