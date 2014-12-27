package subclassmania;

public class Cat  extends Animal{

    
    public boolean hasFur()  {
        return true;
    }
    
    @Override
    public int Type() {
        return "Cat";
    }
}
