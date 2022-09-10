package test;

public class Staff {
    String name;
    int age;
    String designation;
    double salary;

    public Staff(String name){
        this.name = name;
    }

    public void stfAge(int stfAge){
        age = stfAge;
    }

    public void stfDesignation(String stfDesignation){
        designation = stfDesignation;
    }

    public void stfSalary(double stfSalary){
        salary = stfSalary;
    }

    public void printStaff(){
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("직책: " + designation);
        System.out.println("급여: " + salary);
    }
}
