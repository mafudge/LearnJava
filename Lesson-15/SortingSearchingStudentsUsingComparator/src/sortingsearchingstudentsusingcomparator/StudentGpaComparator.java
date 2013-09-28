package sortingsearchingstudentsusingcomparator;

import java.util.Comparator;

public class StudentGpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
            return (int)(1000*(s1.getGPA()-s2.getGPA()));
    }
    
}
