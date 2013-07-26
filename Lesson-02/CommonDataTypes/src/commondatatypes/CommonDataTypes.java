package commondatatypes;

/**
 * @author mafudge
 */
public class CommonDataTypes {

    /**
     * This program demonstrates common variable type usage and
     * how to format output of variables.
     */
    public static void main(String[] args) {
        String studentName = "Bette Itall";
        int age = 22;       
        double gpa = 3.75;
        boolean isFemale = true;
        System.out.printf("%s is %d years old. %s has a %4.3f gpa.\n",
                studentName,
                age,
                (isFemale ? "She" : "He"),
                gpa);
    }
}
