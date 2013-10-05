package subclassmania;

public  Duck extends Bird {
    
   @Override
    public String MakeNoise() {
        return "";
    }

   @Override
   public String Type {
        return "Duck";
    }
}
