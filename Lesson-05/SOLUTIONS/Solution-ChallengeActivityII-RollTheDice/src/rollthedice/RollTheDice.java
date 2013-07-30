/*
 * Challenge Activity II - Roll the dice!
 * 
 * In this acticity, you will simulate the roll of 2 six-sided dice.
 * 
 * Complete the functions given to solve the problem of rolling 1 six-sided die, 
 * generating a random number between 1 and 6. 
 * Then call the function twice to roll the dice!
 * 
 * In addition, you should check for and detect "doubles" 
 * (when the same number comes up on each die)
 * 
 * SAMPLE RUNS(3 executions)
 *
 *  Dice Roll : 2,6; total==8 
 *  Dice Roll : 1,1; doubles total==2
 *  Dice Roll : 5,2; total==7
 */
package rollthedice;

import java.util.Random;

public class RollTheDice {

    public static void main(String[] args) {
        // TODO: Roll two dice, check for doubles, print die values, and total
        int d1, d2;
        d1 = roll();
        d2 = roll();
        String dbl = doubles(d1,d2);
        System.out.printf("Dice Roll : %d,%d; %s total==%d\n", d1,d2,dbl, d1+d2);
    }
    
    public static int roll() {
        // TODO: Generate a random number between 1 and 6
        Random g = new Random();
        return g.nextInt(6)+1;
    }
    
    public static String doubles(int d1, int d2) {
        // TODO: Return "doubles" if same die number for d1 and d2
        return d1==d2 ? "doubles" : "";
    }
}
