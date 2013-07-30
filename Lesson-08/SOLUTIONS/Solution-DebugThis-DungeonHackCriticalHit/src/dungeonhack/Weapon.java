/*
 * The vehicle by which a character attacks
 */
package dungeonhack;

public class Weapon {
    private String _name;       // Short sword
    private String _action;     // Slashes
    private int _maxDamage;     // 6
    private int _criticalHit;   // 19
    private Die _die;
    
    public Weapon(String name, String action, int maxDamage)
    {
        this._name = name;
        this._action = action;
        this._maxDamage = maxDamage;
        this._die = new Die(_maxDamage);
    }
    
    /**
     * Name of the weapon ex. "Short Sword"
     * @return name of weapon
     */
    public String name() { return _name; }    
    /**
     * The Action of the weapon ex. "Slashes"
     * @return 
     */
    public String action() { return _action; }
    /**
     * The maximum amount of damage the weapon can do
     * @return 
     */
    public int maxDamage() { return _maxDamage; }
    
    /**
     * A dice roll to determine the amount of damage done by this weapon.
     * @return damage value between 1 and maxDamage()
     */
    public int hitDamage() {
        return _die.roll();        
    }
    
    
}
