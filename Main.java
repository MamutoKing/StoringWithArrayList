import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args){

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(123, "August", "970 Mountain Ave"));
        students.add(new Student(113, "Bre", "2886 Willow Tree Ln"));
        students.add(new Student(115, "Alex", "6100 Lark Meadow Dr"));
        students.add(new Student(101, "Fraser", "9143 Pitkin Ave"));
        students.add(new Student(110, "Jamal", "1134 Hunington Ave"));
        students.add(new Student(400, "Kyle", "4200 Kansas St"));
        students.add(new Student(410, "Yesenia", "5402 Sheilds Ave"));
        students.add(new Student(415, "Deisy", "434 Denmark Dr"));
        students.add(new Student(168, "Maurizio", "5202 S College Ave"));
        students.add(new Student(129, "Elijah", "1234 Stover Ave"));

        System.out.println("Original List");
        displayStudents(students);

        System.out.println("\nSorted by Name");
        SelectionSort.sort(students, new ComparatorName());
        displayStudents(students);
    }

    public static void displayStudents(ArrayList<Student> students) {
        
        System.out.printf("%-5s %-15s %-20s\n", "Roll Number", "Name", "Address");
        System.out.println("--------------------------------------------------");

        for (Student student : students) {

            System.out.println(student);
        }
    }
}
