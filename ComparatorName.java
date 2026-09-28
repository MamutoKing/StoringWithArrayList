import java.util.Comparator;

public class ComparatorName implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        //Compare returns:
        //negative if s1 < s2
        //0 if s1 == s2
        //positive if s1 > s2

        return s1.getName().compareToIgnoreCase(s2.getName());
    }

}
