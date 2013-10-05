package studentgradestrategy;

/*
 * This is an implementation of a letter-grade distribution
 */
public class LetterGradeStrategy implements IGradeStrategy {

    @Override
    public String getDistribution(int grade) {
        if (grade >=90) {
            return "A";
        } else if (grade >=80) {
            return "B";
        } else if (grade >=70) {
            return "C";
        } else if (grade >=60) {
            return "D";
        } else {
            return "F";
        }
    }
}
