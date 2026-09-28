import java.util.Comparator;

public class ComparatorRollNo implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {


        //Compare returns:
        //negative if first roll number is smaller
        //positive if first roll number is larger
        //0 if both roll numbers are equal
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }

}
