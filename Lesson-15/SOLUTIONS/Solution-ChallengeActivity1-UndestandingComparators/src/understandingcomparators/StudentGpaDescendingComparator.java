package understandingcomparators;

import java.util.Comparator;

public class StudentGpaDescendingComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
            // TODO: Compare gpa's of students in descending order
            return (int)(1000*(s2.getGPA()-s1.getGPA()));
    }
    
}
