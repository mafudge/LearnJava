/*Challenge Activity 3 - Dungeon Hack Monster's Turn (if alive)
 
Manipulate this main() method so that: 
  - the monster gets an attack after your turn is complete
  - the monster does not get to attack you if it is not alive
  - the monster does not get a critical hit bonus
  - code should be similar to the player's turn!
 
SAMPLE OUTPUT:
[Roll=17|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and hits for 1 damage!
[Roll=13|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 1 damage!

[Roll=19|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and hits for 3 damage!
[Roll=15|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 10 damage, killing you!

[Roll=20|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and hits for 4 damage (a critical hit)!
[Roll=20|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 2 damage!
 
 */
 
 package dungeonhackrun;

import dungeonhack.*;

public class DungeonHackRun {

    /**
     * The beginnings of a super cool dungeon hack simulator
     */
    public static void main(String[] args) {
        Weapon s = new Weapon("Broad Sword","slashes",10);
        Weapon c = new Weapon("Arm","Claws",6);
        Actor player = new Actor("Conan the Barbarian",5,10,s);
        Actor monster = new Actor("Grumpy Troll",5,8,c);
        Die d20 = new Die(20);
        
        // player gets first attack :-)
        int roll = d20.roll();
        System.out.printf("[Roll=%d|AC=%d] ",roll,monster.armorClass());
        System.out.printf("%s %s his %s at the %s and "
                , player.name(), player.weapon().action()
                , player.weapon().name(), monster.name());
        if (roll >= monster.armorClass()) {            
            int damage = player.weapon().hitDamage();
            if (roll==20) {
                damage = damage * 2;
                monster.takeDamage(damage);
                System.out.printf("hits for %d damage (a critical hit)", damage);                
            } else {
                monster.takeDamage(damage);
                System.out.printf("hits for %d damage", damage);
            }
            if (monster.isDead()) {
                System.out.printf(", killing it");
            }           
        } else {
            System.out.printf("misses");
        }
        System.out.println("!");
        
        /* TODO: Implement your code here */
                       
    }
}
