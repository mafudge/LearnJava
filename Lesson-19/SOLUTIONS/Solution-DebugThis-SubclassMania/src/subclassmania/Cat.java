package subclassmania;

public class Cat  extends Animal{

    @Override
    public String MakeNoise() {
        return "Purr";
    }
    
    public boolean hasFur()  {
        return true;
    }
    
    @Override
    public String Type() {
        return "Cat";
    }
}
