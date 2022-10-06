package Info;

public class Employee extends Person {
    String employeeID;
    int monthlySalary;
    public Employee(String n, String date, String address, int salary, String id) {
        super(n, date, address);
        this.employeeID = id;
        this.monthlySalary=salary;
    }
    int getMonthlySalary(){
        return this.monthlySalary;
    }
    
}
