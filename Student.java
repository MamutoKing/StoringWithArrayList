public class Student {

    //Instance variables for each Object
    private int rollno;
    private String name;
    private String address;

    //Constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    //Getters for each instance variable
    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    //Controls how Student object are displayed
    @Override 
    public String toString() {
        return String.format("%-5d %-15s %-20s",
                rollno, name, address);
        
    }
}