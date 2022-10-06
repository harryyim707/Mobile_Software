package Info;

public class Student extends Person {
    String studentID;
    double GPA;
    public Student(String n, String date, String address, double gpa, String id) {
        super(n, date, address);
        this.studentID = id;
        this.GPA=gpa;
    }
    double getGPA(){
        return this.GPA;
    }
}
