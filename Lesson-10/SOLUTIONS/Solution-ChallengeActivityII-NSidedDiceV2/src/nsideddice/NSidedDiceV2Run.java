/*
 * Challenge Activity II - N-Sided Die V2.0 
 * 
 * Now that we have for loops under our belt, let's improve our dice roller to
 * include a method to role a die a specific number of times. 
 * 
 * Do do this, overload the roll() method of the Die.java class to accept a 
 * parameter for the number of times the Die needs to be rolled. For example:
 * 
 *  Die d6 = new Die(6);
 *  int Strength= d6.roll(3);  // Roll a 6 sided die three times.
 * 
 *  Once you get that working modify the main() method here
 *  to roll out a character's abilities, which should roll a six sided die
 *  three times for each ability (there are 6 abilities)
 * 
 *  SAMPLE OUTPUT (using seed = 5555 for the die):
 * 
 *  Character Roll:
 *  Str Int Dex Con Wis Cha
 *   11  17  10  10  13  12 
 */
package nsideddice;

public class NSidedDiceV2Run {

    public static void main(String[] args) {
        Die d6 = new Die(6,5555);    // 6 sided-die with seed 5555
        System.out.printf("Character Roll:\n");
        System.out.printf("Str Int Dex Con Wis Cha\n");
        // TODO: Write for loop to roll d6 3 times for each of the 6 abilities
        for(int i=1;i<=6;i++) {
            System.out.printf("%3d ", d6.roll(3));
        }
        System.out.println();
    }
}

