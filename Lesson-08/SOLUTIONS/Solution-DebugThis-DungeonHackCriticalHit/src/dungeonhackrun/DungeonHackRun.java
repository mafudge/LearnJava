
/*
 * DEBUG THIS! Exercise - Dungeon Hack Critical hit on 20
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  
 * 
 * I've modified this code so that a roll of 20 results in a 
 * "critical hit" and does  2 x the hitDamage()
 * 
 * I didn't do a very good job of changing the code and introduced 
 * several errors (of course) ;-)
 * 
 * SAMPLE OUTPUT:
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
                     
    }
}
