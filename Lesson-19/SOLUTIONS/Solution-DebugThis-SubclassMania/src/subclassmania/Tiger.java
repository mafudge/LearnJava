package subclassmania;

public class Tiger extends Cat {
    
    @Override
    public String MakeNoise() {
        return "Roar!";
    }
    
    @Override
    public String Type() {
        return "Tiger";
    }

}
