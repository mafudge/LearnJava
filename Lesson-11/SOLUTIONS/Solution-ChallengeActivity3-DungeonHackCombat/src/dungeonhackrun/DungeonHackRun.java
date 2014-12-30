/** Challenge Activity 3 - Dungeon Hack Combat
 *  
 * Below is code from the last dungeon hack example, where both the player 
 * and monster get turns attacking each other. 
 * 
 * Manipulate the code in this main() method so that it works like true combat  
 * where both the player and monster exchange attacks until one of them is dead.
 * Each combination of player and monster attacks is called a ROUND. 
 * Include the round number with the attack information, and increment the round
 * through each combat cycle.
 * 
 * SAMPLE OUTPUT #1:
 * 
 * [Round=1|Roll=8|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and hits for 4 damage!
 * [Round=1|Roll=8|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 1 damage!
 * [Round=2|Roll=20|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and hits for 8 damage (a critical hit), killing it!
 * The Grumpy Troll is dead.
 * 
 * SAMPLE OUTPUT #2:
 * [Round=1|Roll=5|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and misses!
 * [Round=1|Roll=16|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 2 damage!
 * [Round=2|Roll=14|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and hits for 6 damage!
 * [Round=2|Roll=19|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 5 damage!
 * [Round=3|Roll=6|AC=8] Conan the Barbarian slashes his Broad Sword at the Grumpy Troll and misses!
 * [Round=3|Roll=14|AC=10] Grumpy Troll Claws its Arm at Conan the Barbarian and hits you for 4 damage, killing you!
 * You are dead.
 *  
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
        Actor player = new Actor("Conan the Barbarian",10,10,s);
        Actor monster = new Actor("Grumpy Troll",12,8,c);
        Die d20 = new Die(20);
        int round=0;
                
        // TODO: Modify this code to use a while loop - attacking until someone's dead!        
        while (true) {
            round++;
            int roll = d20.roll();
            System.out.printf("[Round=%d|Roll=%d|AC=%d] ",round,roll,monster.armorClass());
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
            
            //monster's turn
            if (!monster.isDead()) {
                roll = d20.roll();
                System.out.printf("[Round=%d|Roll=%d|AC=%d] ",round,roll,player.armorClass());
                System.out.printf("%s %s its %s at %s and "
                    , monster.name(), monster.weapon().action()
                    , monster.weapon().name(), player.name());
                if (roll >= monster.armorClass()) {            
                    int damage = monster.weapon().hitDamage();
                    player.takeDamage(damage);
                    System.out.printf("hits you for %d damage", damage);
                    if (player.isDead()) {
                        System.out.printf(", killing you");
                    }           
                } else {
                    System.out.printf("misses");
                }
                System.out.println("!");
            }
            
            //death checks
            if (player.isDead()) {
                System.out.printf("You are dead.\n");
                break;
            }
            if (monster.isDead()) {
                System.out.printf("The %s is dead.\n", monster.name());
                break;
            }
        }
    }
}
