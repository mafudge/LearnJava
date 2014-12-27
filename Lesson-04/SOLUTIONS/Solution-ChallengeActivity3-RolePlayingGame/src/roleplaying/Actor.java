/*
 * A character can be a player or a monster
 */
package roleplaying;

/**
 * A player or character in the role-playing universe
 * @author mafudge
 */
public class Actor {
       private String _name;        // Actor name "Valhalla"
       private int _health;         // Health Points 20
       private int _armorClass;     // Armor Class 10
       private Weapon _weapon;      // "Short Sword"
       
       /**
        * Create a new Actor (player or monster)
        * @param name  name of character ex. "Goblin"
        * @param health  number of health points ex. 5
        * @param armorClass armor class ex. 4
        * @param weapon weapon the character uses
        */
       public Actor(String name, int health, int armorClass, Weapon weapon)
       {
           this._name = name;
           this._health = health;
           this._armorClass = armorClass;
           this._weapon = weapon;
       }

       
       /**
        * Get the character name
        * @return 
        */
       public String name() { return _name; }
       
       /**
        * Get the current health
        * @return 
        */
       public int health() { return _health; }
    
       /**
        * get the current armor class
        * @return 
        */
       public int armorClass() { return _armorClass; }
       
       /** 
        * get the current weapon
        * @return 
        */
       public Weapon weapon() { return this._weapon; }
       
       /**
        * Detects if the character is dead (health <=0)
        * @return 
        */
       public boolean isDead() {
           return (this._health <=0);
       }
       
       /**
        * Applies damage to the character
        * @param amount the amount of damage to apply
        * @return 
        */
       public int takeDamage(int amount) {
           this._health = this._health - amount;
           return this._health;           
       }
        
       
       @Override
       public String toString()
       {
           return String.format("%s: Armor:%d, Health:%d, Weapon: %s", this._name, this._armorClass, this._health, this.weapon());
       }
}
