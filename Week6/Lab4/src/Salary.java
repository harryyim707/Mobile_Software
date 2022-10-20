public class Salary extends Employee{
    private double salary;
    public Salary(String name, String address, int number, double salary){
        super(name, address, number);
        setSalary(salary);
    }
    public void setSalary(double newSalary){
        if(newSalary>=0.0){
            salary=newSalary;
        }
    }
    public double computePay(){

        return salary/10;
    }
}
