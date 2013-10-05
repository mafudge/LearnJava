/*
 * Debug This! - Subclass Mania
 * 
 * Learning to read & debug existing code is an important skill.
 * Fix the errors in this program. 
 * Try not to re-write the program, just correct what's wrong.  

 * In this activity, you simply need to get the output to match the sample run.
 * The trick is you'll have to debug the Bird, Cat, Animal, Duck, 
 * and Tiger java files. NO EDITING THIS FILE! Get those classes working correctly. 
 * 
 * PROGRAM OUTPUT:
The Bird says 'Tweet'
The Cat says 'Purr'
The Duck says 'Quack'
The Tiger says 'Roar!'
 * 
 */
package subclassmania;

public class SubclassManiaRun {

    public static void main(String[] args) {
        // TODO code application logic here
        Animal[] animals = new Animal[] {
            new Bird(),
            new Cat(),
            new Duck(),
            new Tiger()
        };
        
        for(Animal a : animals) {
            System.out.printf("The %s says '%s'\n", a.Type(),a.MakeNoise());
        }
        
    }
}
