package nsideddice;

public class NSidedDiceRun {

    public static void main(String[] args) {
        Die d6 = new Die(6);    // 6 sided-die
        Die d12 = new Die(12);  // 12 sided-die
        Die skullcrusher = new Die(20); 
        System.out.printf("Rolling %d sided die : %d\n",d6.getSides(), d6.roll());
        System.out.printf("Rolling %d sided die : %d\n",d12.getSides(), d12.roll());        
        System.out.printf("Rolling %d sided die : %d\n"
                ,skullcrusher.getSides(), skullcrusher.roll());        
    }
}

