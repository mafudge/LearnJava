
package enumerations;

public class EnumerationsRun {

    public static void main(String[] args) {
        // Demo of Enumerations in Java
        // d is "North"
        Direction d = Direction.North;
        
        // Print d
        System.out.printf("%s is at %d degrees.\n",d,d.Degrees());
        // Print East
        System.out.printf("%s is at %d degrees.\n",Direction.East,Direction.East.Degrees());
        
        
    }
}
