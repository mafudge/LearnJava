/** Challenge Activity 3 - Roll ability scores for an RPG
 * 
 * Now that we have for loops under our belt, let's improve our dice roller to
 * include a method to role a die a specific number of times. This is often 
 * required when rolling ability scores for an RPG (Role-playing game)
 * 
 * Do do this, overload the roll() method of the Die.java class to accept a 
 * parameter for the number of times the Die needs to be rolled. Inside the method
 * use a for loop to roll the die that many times. For example:
 * 
 * Die d6 = new Die(6);
 * int Strength= d6.roll(3);  // Roll a 6 sided die three times.
 * 
 * Once you get that working modify the main() method here
 * to roll out a character's abilities, which should roll a six sided die
 * three times for each ability :
 * (there are 6 abilities: str, int, dex, con, wis, cha)
 * 
 *  SAMPLE OUTPUT (using seed = 5555 for the die):
 * 
 *  Character Roll:
 *  Str Int Dex Con Wis Cha
 *   11  17  10  10  13  12 
 */
package rpgabilityscores;

public class RPGAbilityScores {

    public static void main(String[] args) {
        Die d6 = new Die(6,5555);    // 6 sided-die with seed 5555
        System.out.printf("Character Ability Roll:\n");
        System.out.printf("Str Int Dex Con Wis Cha\n");
        // TODO: Write for loop to roll d6 3 times for each of the 6 abilities, 
        // printing them out directly to the console

    }
}

