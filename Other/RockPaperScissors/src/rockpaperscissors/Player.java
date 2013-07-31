/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

/**
 *
 * @author mafudge
 */
public class Player {
    public String Name;
    public Throw Throw;
    
    public Player(String name, Throw t) {
        this.Name = name;
        this.Throw=t;
    }
}
