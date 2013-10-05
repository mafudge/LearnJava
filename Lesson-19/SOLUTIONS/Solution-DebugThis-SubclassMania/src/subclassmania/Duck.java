package subclassmania;

public class Duck extends Bird {
    
   @Override
    public String MakeNoise() {
        return "Quack";
    }

   @Override
   public String Type() {
        return "Duck";
    }
}
