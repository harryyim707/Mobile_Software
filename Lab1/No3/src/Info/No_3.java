package Info;
public class No_3 {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("Thomas", "1990/04/17", "Jungnang-gu Seoul", 250, "20151798");
        Employee e2 = new Employee("Leonardo", "1987/08/23", "Guro-gu Seoul", 300, "20146879");
        Employee e3 = new Employee("Miriam", "1976/02/14", "Seocho-gu Seoul", 500, "20104893");
        Employee e4 = new Employee("Donald", "1968/09/30", "Gangnam-gu Seoul", 1000, "20048962");
        Employee e5 = new Employee("Joe", "1973/11/16", "Jongno-gu Seoul", 550, "20086489");
        System.out.println("Employees");
        System.out.println("Name:");
        System.out.println("Employee 1: "+e1.getName()+" Employee 2: "+e2.getName()+" Employee 3: "+e3.getName()+
        " Employee 4: "+e4.getName()+" Employee 5: "+e5.getName());
        System.out.println("Date of birth:");
        System.out.println("Employee 1: "+e1.getBirthDate()+" Employee 2: "+e2.getBirthDate()+" Employee 3: "+e3.getBirthDate()+
        " Employee 4: "+e4.getBirthDate()+" Employee 5: "+e5.getBirthDate());
        System.out.println("Address:");
        System.out.println("Employee 1: "+e1.homeAddress+" Employee 2: "+e2.homeAddress+" Employee 3: "+e3.homeAddress+
        " Employee 4: "+e4.homeAddress+" Employee 5: "+e5.homeAddress);
        System.out.println("Monthly Salary:");
        System.out.println("Employee 1: "+e1.getMonthlySalary()+" Employee 2: "+e2.getMonthlySalary()+" Employee 3: "+e3.getMonthlySalary()+
        " Employee 4: "+e4.getMonthlySalary()+" Employee 5: "+e5.getMonthlySalary());
        System.out.println("ID:");
        System.out.println("Employee 1: "+e1.employeeID+" Employee 2: "+e2.employeeID+" Employee 3: "+e3.employeeID+
        " Employee 4: "+e4.employeeID+" Employee 5: "+e5.employeeID);

        Student s1 = new Student("Daniel", "2003/05/26", "Yongsan-gu Seoul", 3.0, "2022135168");
        Student s2 = new Student("Ruth", "1999/12/18", "Nowon-gu Seoul", 3.7, "2018167089");
        Student s3 = new Student("Troy", "2002/01/24", "Mapo-gu Seoul", 4.3, "2022134048");
        Student s4 = new Student("Giselle", "2000/06/29", "Dongjak-gu Seoul", 3.9, "2020135072");
        Student s5 = new Student("Jordan", "2001/10/28", "Songpa-gu Seoul", 4.0, "2021122134");
        System.out.println("Students");
        System.out.println("Name:");
        System.out.println("Student 1: "+s1.getName()+" Student 2: "+s2.getName()+" Student 3: "+s3.getName()+
        " Student 4: "+s4.getName()+" Student 5: "+s5.getName());
        System.out.println("Date of birth:");
        System.out.println("Student 1: "+s1.getBirthDate()+" Student 2: "+s2.getBirthDate()+" Student 3: "+s3.getBirthDate()+
        " Student 4: "+s4.getBirthDate()+" Student 5: "+s5.getBirthDate());
        System.out.println("Address:");
        System.out.println("Student 1: "+s1.homeAddress+" Student 2: "+s2.homeAddress+" Student 3: "+s3.homeAddress+
        " Student 4: "+s4.homeAddress+" Student 5: "+s5.homeAddress);
        System.out.println("GPA:");
        System.out.println("Student 1: "+s1.getGPA()+" Student 2: "+s2.getGPA()+" Student 3: "+s3.getGPA()+
        " Student 4: "+s4.getGPA()+" Student 5: "+s5.getGPA());
        System.out.println("ID:");
        System.out.println("Student 1: "+s1.studentID+" Student 2: "+s2.studentID+" Student 3: "+s3.studentID+
        " Student 4: "+s4.studentID+" Student 5: "+s5.studentID);
    }
}
